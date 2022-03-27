package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("/helloworld")
public class helloworldcontroller {

    @Autowired
private MessageSource messageSoure;
    @GetMapping("/")
    public String fun()
    {
        return "Hello world";
    }

    @GetMapping("/hello-world-bean/{name}")
    public Helloworldbean helloworldbean(@PathVariable String name)
    {
        return new Helloworldbean("this is hello world bean " + name);
    }

    @GetMapping("/internationalised")
    public String fun2(@RequestHeader(name="Accept-Language",required = false) Locale locale)
    {
       // return messageSoure.getMessage("good.morning.message",null,"Default Message",locale);
        return messageSoure.getMessage("good.morning.message",null,"Default Message", LocaleContextHolder.getLocale());
        //return "Hello world";
    }

}
