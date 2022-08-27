package com.springbootdocker.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
@GetMapping(path = {"hi","/hi/{nm}"})
public String getHi(@PathVariable(name = "nm",required = false) Optional<String> name )
{
	
	return "Hi "+name.orElse(" World !")+" !";
}

@GetMapping(path = {"hello","/hello/{nm}"})
public String getHello(@PathVariable(name = "nm",required = false) Optional<String> name )
{
	
	return "Hello "+name.orElse(" World !")+" !";
}

}
