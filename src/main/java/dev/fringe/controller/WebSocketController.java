package dev.fringe.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.fringe.model.Request;
import dev.fringe.model.Response;

@Controller
public class WebSocketController {

	@RequestMapping("/")
	public String start() {
		return "home";
	}
	
	@MessageMapping("/add")
	@SendTo("/topic/response")
	public Response addNum(Request req) throws Exception {
		return new Response(req.getNum1() + "+" + req.getNum2() + "=" + (req.getNum1() + req.getNum2()));
	}

}
