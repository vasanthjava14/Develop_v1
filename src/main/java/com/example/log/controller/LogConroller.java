package com.example.log.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogConroller {
Logger log=LoggerFactory.getLogger(LogConroller.class);
public String info() {
	log.info("HELO INFO");
	return "this is logger ifo message";
}
}