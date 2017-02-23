#!/bin/sh

if [ "$#" -ne 1 ] || ! [ -f "input/$1.in" ]; then
  echo "Usage: $0 <inputname>" >&2
  exit 1
fi


CLASSPATH="bin"

javac -cp $CLASSPATH -d bin src/*.java
java -cp $CLASSPATH main $1
