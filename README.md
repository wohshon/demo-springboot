### Hello world spring boot service 

Ramdom `echo` services for use in testing purposes

- POST example

        curl -X POST -H 'Content-type: application/json' -d '{"greetings": "bob"}' localhost:8080/echo

- Get exaample , plain text 

        curl localhost:8080/echo/world

- Get example returning JSON payload

        curl localhost:8080/echojson/world