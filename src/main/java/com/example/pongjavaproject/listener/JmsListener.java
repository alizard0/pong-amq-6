package com.example.pongjavaproject.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JmsListener {

  private final Logger logger = LoggerFactory.getLogger(JmsListener.class);

  @org.springframework.jms.annotation.JmsListener(destination = "ping-pong")
  public void receiveMessage(String text) {
    logger.info(String.format("Received '%s'", text));
  }
}
