package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien extends FirstprojApplication {
 private int aname;
 private String aid;
 private String tech;
public int getAname() {
	return aname;
}
public void setAname(int aname) {
	this.aname = aname;
}
public String getAid() {
	return aid;
}
public void setAid(String aid) {
	this.aid = aid;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
  public void show()
  {
	  System.out.println("in show function of alien");
  }
}
