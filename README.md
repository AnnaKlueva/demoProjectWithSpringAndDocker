<h2> Demo project with Spring and Docker usage</h2>

<h3>Technologies:</h3>
- Junit5
- Spring Boot
- Allure
- Selenium
- Maven
- Java8
 
<h3>Browser:</h3>
- Firefox (version 88.0.1)

<h3>Allure report :</h3>

1. To run tests and generate Allure report:
```$xslt
mvn clean test
```

2. To see a report:

```$xslt
allure serve path_to_allure_results_folder/allure-results
```

<h3>TODO:</h3>

- fix failing tests
- add screenshots to allure report
- add docker
- add Travis CI

