FROM openjdk:8
MAINTAINER The Dev

RUN mkdir /app
WORKDIR /app


COPY wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh