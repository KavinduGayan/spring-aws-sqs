package com.kavindu.sqsproducer.controller;


import com.kavindu.sqsproducer.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sqs")
public class SqsController {
    //queue name
    private static final String QUEUE = "myQueue";

    public static final Logger LOGGER = LoggerFactory.getLogger(SqsController.class);

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @PostMapping(value = "/send")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void sendMessageToSqs(@RequestBody final Message message) {
        LOGGER.info("Sending the message to the Amazon sqs.");
        queueMessagingTemplate.convertAndSend(QUEUE, message); //send to queue
        LOGGER.info("Message sent successfully to the Amazon sqs.");
    }
}
