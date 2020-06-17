package dev.fringe.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import dev.fringe.model.Add;

@Controller
public class WebSocketController {

	@MessageMapping("/add")
	@SendTo("/topic/response")
	public Add addNum(Add req) throws Exception {
		return new Add(req.getOne() + "+" + req.getTwo() + "=" + (req.getOne() + req.getTwo()));
	}
}