package com.example.pongjavaproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PongRestController {
  @GetMapping("/ping")
  public String index() {
    return "pong";
  }
}
