package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class personVersionController {

    @GetMapping("/v1/person")
    public PersonV1 retrievepersonv1()
    {
        return new PersonV1("abhi verma");
    }
    @GetMapping("/v2/person")
    public PersonV2 retrievepersonv2(){
        return new PersonV2( new Name("abhi","verma"));
    }

    @GetMapping(value = "/person/param" , params = "version=1")
    public PersonV1 paramsv1()
    {
        return new PersonV1("abhi verma");
    }
    @GetMapping(value = "/person/param" , params = "version=2")
    public PersonV2 paramsv2(){
        return new PersonV2( new Name("abhi","verma"));
    }

    @GetMapping(value = "/person/header" , headers = "X-API-VERSION=1")
    public PersonV1 headerv1()
    {
        return new PersonV1("abhi verma");
    }
    @GetMapping(value = "/person/header" , headers = "X-API-VERSION=2")
    public PersonV2 headerv2(){
        return new PersonV2( new Name("abhi","verma"));
    }

    @GetMapping(value = "/person/produces" , produces = "application/vnd.company.app-v1+json")
    public PersonV1 prducesv1()
    {
        return new PersonV1("abhi verma");
    }
    @GetMapping(value = "/person/produces" , produces = "application/vnd.company.app-v2+json")
    public PersonV2 producesv2(){
        return new PersonV2( new Name("abhi","verma"));
    }


}
