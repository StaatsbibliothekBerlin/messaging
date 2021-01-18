FROM maven:3-jdk-11-openj9

VOLUME /target

COPY . /opt/hsp-messaging

WORKDIR /opt/hsp-messaging

CMD mvn clean package -Pintegration && cp activitystreams-hsp/target/*.jar /target/ && cp tei-jaxb/target/*.jar /target/

