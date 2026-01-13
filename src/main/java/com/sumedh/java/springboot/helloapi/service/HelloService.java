package com.sumedh.java.springboot.helloapi.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
 public String hello() {
	 return "Hello From Springboot service";
 }
}
