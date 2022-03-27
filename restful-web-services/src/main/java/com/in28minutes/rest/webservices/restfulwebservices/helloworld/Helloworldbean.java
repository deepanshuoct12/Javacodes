package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.context.annotation.Bean;

public class Helloworldbean {
    private String str;

    public Helloworldbean(String str) {
        this.str=str;
    }

    @Override
    public String toString() {
        return "Helloworldbean{" +
                "str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
