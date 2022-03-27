package com.in28minutes.rest.webservices.restfulwebservices.user;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilderDsl;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.swing.text.html.parser.Entity;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping("")
    public List<User>retrieveAllusers(){
        return this.userDaoService.findAll();
    }

    @GetMapping("/{id}")
    public EntityModel<User> retrieveOneuser(@PathVariable int id){
     User user=userDaoService.findOne(id);
     if(user==null)
         throw new UserNotFoundException("id-"+id);

        WebMvcLinkBuilder  linktoUsers = linkTo(methodOn(this.getClass()).retrieveAllusers());
        EntityModel<User>model= EntityModel.of(user);
        model.add(linktoUsers.withRel("all-users"));
     return model;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        User user = userDaoService.deletebyId(id);

        if(user==null)
            throw new UserNotFoundException("id-"+id);

    }

    @PostMapping("")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user)
    {
     User saveduser = this.userDaoService.save(user);
//      return saveduser;
        System.out.println(saveduser);
      URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveduser.getId()).toUri();
    return ResponseEntity.created(location).build();
    }



}
