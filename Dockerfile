FROM ubuntu:21.04
RUN apt-get update
RUN apt-get install -y maven default-jdk

WORKDIR /app
COPY . /app

#RUN export DISPLAY=:0.0
RUN mvn clean install

EXPOSE 80

CMD mvn exec:java -Dexec.mainClass="presenter.rest.RESTApp"

