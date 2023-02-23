
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
	String str1="Blue";
	@GetMapping("/game")
	public String getMyFav()
	{
		return "My favourite color is "+str1;
	}

}
