package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceimpl implements ContactService{

    List<Contact>list = List.of(
            new Contact(11L,"dyno@gmail.com","dyno",1L),
            new Contact(12L,"abhi@gmail.com","abhi",1L),
            new Contact(21L,"prince@gmail.com","prince tanwar",2L),
            new Contact(22L,"super@gmail.com","superstar",2L)
    );
    @Override
    public List<Contact> getContactofUser(Long userId) {
        return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
        //return null;
    }
}
