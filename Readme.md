#curl

`curl --location --request POST 'localhost:8088/sqs/send' \
--header 'Content-Type: application/json' \
--data-raw '{
"id":1,
"messageBody":"test"
}'
`
