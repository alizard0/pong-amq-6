package com.example.pongjavaproject.controller;

import com.example.pongjavaproject.service.JmsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PongRestController {
  private JmsService jmsService;

  public PongRestController(JmsService jmsService) {
    this.jmsService = jmsService;
  }

  @GetMapping("/ping")
  public void ping() {
    jmsService.publish("ping-pong", "ping");
  }
}
