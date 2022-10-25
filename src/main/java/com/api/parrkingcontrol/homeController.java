package com.api.parrkingcontrol;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
    @GetMapping("/")
		public String start(){

			return "Hello Word, by SpringBoot!";
		}
}
