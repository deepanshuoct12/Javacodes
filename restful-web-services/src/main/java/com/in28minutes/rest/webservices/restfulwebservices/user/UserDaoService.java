package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
@Component
public class UserDaoService {
    private static List<User> users= new ArrayList<>();
    private static int usercount=3;
    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));
    }

    public List<User> findAll(){
     return this.users;
    }
    public User save(User user){

        if(user.getId()==null)
            user.setId(++usercount);

        users.add(user);
        return user;
    }

    public User findOne(int id){
        for(User u:users)
        {
            if(u.getId()==id)
                return u;
        }

        return null;
    }

    public User deletebyId(int id) {
        Iterator<User> iterator= users.iterator();
        while(iterator.hasNext())
        {
            User user=iterator.next();
            if(user.getId()==id)
            {
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
