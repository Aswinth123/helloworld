import java.util.*;

public class JavaWebAppp {
  public static void main(String[] args) {
    System.out.println("Welcome to the World");
  }
}
- task: Maven@4
  inputs:
    mavenPomFile: 'pom.xml'
    publishJUnitResults: true
    testResultsFiles: '**/surefire-reports/TEST-*.xml'
    javaHomeOption: 'JDKVersion'
    mavenVersionOption: 'Default'
    mavenAuthenticateFeed: false
    effectivePomSkip: false
    sonarQubeRunAnalysis: false