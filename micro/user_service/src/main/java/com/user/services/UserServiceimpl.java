package com.user.services;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService{
    List<User>list=List.of(
            new User(1L,"durgesh","87654321"),
            new User(2L,"abhi","9987654321"),
            new User(3L,"prince","767654321")
    );
    @Override
  public User getUser(Long userId){
      return this.list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
  }
}
