#!/usr/bin/env groovy
import com.payment.Docker
def call(){
    return new Docker(this).dockerLogin()
}