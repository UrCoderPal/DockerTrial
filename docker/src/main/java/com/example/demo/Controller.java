package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/")
	public Map<String, Object> getValues() {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("message", "Java api is working fine");
		data.put("languages", Arrays.asList("Java", "C#", "JavaScript"));
		data.put("code", 2345);
		return data;
	}

}
