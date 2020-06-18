package dev.fringe.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.fringe.model.Add;

@Controller
public class WebSocketController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@MessageMapping("/add")
	@SendTo("/topic/response")
	public Add add(Add req) {
		return new Add(String.format("%s+%s=%s", req.getOne(),req.getTwo(), req.getOne() + req.getTwo()));
	}
}