#!/usr/bin/env groovy
package com.payment

class Docker implements Serializable{
    def script

    Docker(script){
        this.script = script
    }

    def buildDockerImage(String imageName){
        script.echo "building the docker image..."
        script.withCredentials([script.usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USER', passwordVariable: 'PASS')]){
            script.sh "docker build --tag $imageName ."
            script.sh "echo $script.PASS | docker login -u $script.USER --password-stdin"
            script.sh "docker push $imageName"
        }
    }
}
