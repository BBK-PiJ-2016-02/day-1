# Setup testing for Java on the CLI
## Download junit hamcrest core jar files to a dedicated folder
## Add To .bash_profile/.bashrc
*Modify JUNIT_HOME to point at directory with the above jar files*
```
    export JUNIT_HOME="$HOME/Tools/Java"
    export PATH="$PATH:$JUNIT_HOME"
    export CLASSPATH="$CLASSPATH:$JUNIT_HOME/junit-4.12.jar:$JUNIT_HOME/hamcrest-core-1.3.jar"
```
## Run using the following
- To compile `javac *.java;`
- To run tests `java org.junit.runner.JUnitCore HashUtilitiesTest`