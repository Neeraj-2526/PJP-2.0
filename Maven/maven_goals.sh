#!/bin/bash

echo "Enter the plug-in to list out the goals : "

read plugin

echo "The goals within the plug-in =>  $plugin are : "

mvn help:describe -Dplugin=org.apache.maven.plugins:maven-$plugin-plugin\-Ddetail=true
