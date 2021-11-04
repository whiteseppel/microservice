FROM openjdk
COPY target/classes/com/ /tmp
WORKDIR /tmp
CMD java example.demo DemoApplication