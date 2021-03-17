FROM ubuntu:latest

# installing Java.
RUN \
  apt-get update && \
  apt install -y openjdk-8-jdk 

MAINTAINER Abhijeet Kumar

WORKDIR /usr/local

ADD target/CalculatorDevOps-1.0-SNAPSHOT.jar .
