### Hello world spring boot service 

Ramdom `echo` services for use in testing purposes

- POST example

        curl -X POST -H 'Content-type: application/json' -d '{"greetings": "bob"}' localhost:8080/echo

- Get exaample , plain text 

        curl localhost:8080/echo/world

- Get example returning JSON payload

        curl localhost:8080/echojson/world

## Running as a openshift service

	oc new-app registry.redhat.io/openjdk/openjdk-11-rhel7~https://github.com/wohshon/demo-springboot#metrics --context-dir=/ --name=demo-app
        
	oc expose svc demo-app

## actuator and micromter libraries injected
