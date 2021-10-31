package com.kavindu.sqsconsumer.listner;

import com.kavindu.sqsconsumer.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Component
public class AwsListener {
    //queue name
    private static final String QUEUE = "myQueue";

    public static final Logger LOGGER = LoggerFactory.getLogger(AwsListener.class);

    // @SqsListener listens to the message from the queue.
    @SqsListener(value = QUEUE, deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void getMessageFromSqs(Message message, @Header("MessageId") String messageId) {
        LOGGER.info("Received message= {} with messageId= {}", message.toString(), messageId);
        // TODO - save to db, send SMS, Send email ...etc.
    }
}
