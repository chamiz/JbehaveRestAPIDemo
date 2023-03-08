# Jbehave RestAPI demo code

Demo project using JBehave, JUnit, RestAssured, Gradle for testing REST webservices

This project was written using https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false URI

**Prerequisites**

1. Java 8
2. Gradle latest
3. InteliJ IDEA / Eclipse IDE

**Package Structure**

|      |          | Package/Class name    | Description                                      |
|------|----------|-----------------------|--------------------------------------------------|
| main | Java     | WebServiceDemoImpl    | Contains actual methods which calls webservice   | 
| test | Java     | com.example.steps     | Story definition                                 |  
| test |          | WebServiceDemoStories | Execution class                                  | 
| test | Resource | Story File            | JBehave story file which describes the test case |
|      |          | .circleci             | .circleci config files for CI                    |
|      |          | build.gradle          | Gradle build file                                |

If you need to **import project** files to your IDE please run commands

gradle idea (for IDEA IDE) or
gradle eclipse (for Eclipse IDE)

**Build Project**

gradle clean build or use your IDE

**Test Execution**

1. Using JUnit
   Right click on WebServiceDemoStories and run as JUnit test.

2. Using Gradle
   Execute command "gradle test"

**View Test Execution Reports**

1. Gradle report
   Navigate to build\reports\tests\test and open index.html file using any web browser or double click to open using
   default web browser.
2. JBehave report
   Navigate to build\classes\jbehave and open com.example.stories.webServiceDemo.html file using any web browser or
   double click to open using default web browser.

**CI support**

This project has enabled continuous integration support using Circle CI.
https://app.circleci.com/pipelines/github/chamiz/JbehaveRestAPIDemo


If you need further clarifications or enhancement requests on this project please contact me via email.


Cheers

Chamila Ambahera

chamila.ambahera@gmail.com
