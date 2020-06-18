package dev.fringe.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.fringe.model.WebSocketAdd;

@Controller
public class WebSocketController {

	@RequestMapping("/")
	public String websocket() {
		return "websocket";
	}
	
	@MessageMapping("/add")
	@SendTo("/topic/response")
	public WebSocketAdd add(WebSocketAdd req) {
		return new WebSocketAdd(String.format("%s+%s=%s", req.getOne(),req.getTwo(), req.getOne() + req.getTwo()));
	}
}