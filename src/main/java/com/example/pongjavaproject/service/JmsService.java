package com.example.pongjavaproject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JmsService {
  private final Logger logger = LoggerFactory.getLogger(JmsService.class);

  private JmsTemplate jmsTemplate;

  public JmsService(JmsTemplate jmsTemplate) {
    this.jmsTemplate = jmsTemplate;
  }

  public void publish(String queue, String message) {
    this.jmsTemplate.convertAndSend(queue, message);
    logger.info(String.format("Published '%s' at '%s'", message, queue));
  }
}
