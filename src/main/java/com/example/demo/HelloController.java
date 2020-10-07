package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

import com.example.demo.entity.Message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/")
@Log4j2
public class HelloController {
	
	@GetMapping("/echo/{message}")	
	public String echo(@PathVariable("message") String message) {
		log.info("Hello {}",message);
		return "Hello "+message;
	}

	@GetMapping("/echojson/{message}")	
	@ResponseBody
	public Message echoJson(@PathVariable("message") String message) {
		log.info("Json: Hello {}",message);
		Message msg = new Message();
		msg.setGreetings("Hello "+message);
		return msg;
	}

	@PostMapping("/echo")
	@ResponseBody
	public Message echo(@RequestBody Message msg) {
		log.info("Post: Hello {}",msg);
		msg.setGreetings("Hello "+msg.getGreetings());
		return msg;

	}
}
