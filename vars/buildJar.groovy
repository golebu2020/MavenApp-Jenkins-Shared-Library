#!/usr/bin/env groovy

def call(){
    echo "Building application"
    sh "mvn package"

}