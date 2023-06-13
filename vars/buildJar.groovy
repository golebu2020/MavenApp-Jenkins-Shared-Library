#!/usr/bin/env groovy



def call(){
    echo "Building application fir branch $BRANCH_NAME"
    sh "mvn package"

}