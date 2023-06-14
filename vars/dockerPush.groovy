#!/usr/bin/env groovy
import com.payment.Docker
def call(String imageName){
    return new Docker(this).dockerPush(imageName)
}