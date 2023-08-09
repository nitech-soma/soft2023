FROM openjdk:slim

RUN apt -y update && apt -y install git
RUN apt -y install diffutils patch

RUN apt -y install openjdk-17-jre openjdk-17-jdk

WORKDIR /mnt
