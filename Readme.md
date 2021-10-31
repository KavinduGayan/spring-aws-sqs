# Curl

`curl --location --request POST 'localhost:8088/sqs/send' \
--header 'Content-Type: application/json' \
--data-raw '{
"id":1,
"messageBody":"test"
}'
`

# Links

* [presentation](docs/aws sqs.pptx)
* [uml-diagram](docs/sequence-diagrame.puml)
* [aws-sqs](https://aws.amazon.com/sqs/)
* [aws-pricing](https://aws.amazon.com/sqs/pricing/)
* [sqs-listner](https://javadoc.io/doc/org.springframework.cloud/spring-cloud-aws-messaging/2.1.3.RELEASE/org/springframework/cloud/aws/messaging/listener/SqsMessageDeletionPolicy.html)