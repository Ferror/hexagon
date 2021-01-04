FROM ubuntu:20.04
ARG DEBIAN_FRONTEND=noninteractive

RUN apt-get update && apt-get install -y maven default-jdk supervisor make nginx jetty9

RUN apt-get clean && apt-get autoclean

COPY nginx.conf /etc/nginx/nginx.conf
COPY supervisor.conf /etc/supervisor/conf.d/supervisor.conf

WORKDIR /app
COPY . /app

EXPOSE 80
