package com.in28minutes.rest.webservices.restfulwebservices.user;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilderDsl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.swing.text.html.parser.Entity;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jpa")
public class UserJpaResource {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/users")
    public List<User>retrieveAllusers(){
        return this.userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public EntityModel<User> retrieveOneuser(@PathVariable int id){
        Optional<User> user=userRepository.findById(id);
        if(!user.isPresent())
            throw new UserNotFoundException("id-"+id);

        WebMvcLinkBuilder linktoUsers = linkTo(methodOn(this.getClass()).retrieveAllusers());
        EntityModel<User>model= EntityModel.of(user.get());
        model.add(linktoUsers.withRel("all-users"));
        return model;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        userRepository.deleteById(id);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user)
    {
        User saveduser = this.userRepository.save(user);
//      return saveduser;
 //       System.out.println(saveduser);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveduser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

////////post ////////
    @GetMapping("/users/{id}/posts")
    public List<Post>retrieveallpostofuser(@PathVariable int id)
    {
       Optional<User>userOptional=this.userRepository.findById(id);
       if(!userOptional.isPresent())
           throw new UserNotFoundException("id-"+id);

       return userOptional.get().getPosts();
    }
    @PostMapping("/users/{id}/posts")
   public ResponseEntity<Object>createPost(@PathVariable int id,@RequestBody Post post)
   {
       Optional<User>userOptional=userRepository.findById(id);
       System.out.println(post);//

       if(!userOptional.isPresent())
           throw new UserNotFoundException("id-"+id);
       User user = userOptional.get();
       post.setUser(user);
       System.out.println(user);//
      postRepository.save(post);
       System.out.println(postRepository.findAll());
       URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.getId()).toUri();
       return ResponseEntity.created(location).build();
   }
}
