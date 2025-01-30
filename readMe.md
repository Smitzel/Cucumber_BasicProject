# Java Cucumber Example Project

Welcome to the **Java Cucumber Example Project**! This is a basic setup to get you started with BDD (Behavior Driven Development) using Cucumber and Java. It includes everything you need to run your first test scenarios with extended HTML reporting.

## Features

- **Basic Cucumber Setup**: Ready-to-go configuration to start writing and running Cucumber tests.
- **Example Scenario**: See how to define simple test scenarios using Gherkin syntax.
- **HTML Reporting**: Extended HTML reports to track test execution results in a visually appealing way.
- **Cucumber Runner Class**: A Java class that triggers your tests and integrates with Cucumber's features.

## Getting Started

### Prerequisites

Before you can start, ensure that you have the following installed on your machine:

- Java 8+ (JDK)
- Maven
- IDE (like IntelliJ IDEA or Eclipse)

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/smitzel/Cucumber_BasicProject.git
    ```

2. Navigate to the project directory:
    ```bash
    cd java-cucumber-example
    ```

3. Install the dependencies using Maven:
    ```bash
    mvn clean install
    ```

4. Run the tests:
    ```bash
    mvn test
    ```

### Structure

- **TestRunner.java**: This is the class that runs your Cucumber tests.
- **ExampleSteps.java**: Contains the methods that map to steps in your Gherkin scenarios.
- **example.feature**: A sample feature file written in Gherkin syntax.
- **extent.properties**: A properties file to configure the report 

### Example Scenario

Here is a simple Gherkin scenario from the `example.feature` file:

```gherkin
Feature: Example feature

  @tag
  Scenario: 01. Test Cucumber setup
    Given I have a working Cucumber setup
    When I run the tests
    Then I should see the results in the console
```

### HTML Report

After running your tests , Cucumber will generate an HTML report located at:

target/reports
M

To view the test results:

1. Navigate to the `target/reports/Report_YYYYMMDD_HHmmSS/` directory.
2. Open the `ExtentReport.html` file in your browser.

The report provides a detailed summary of each test scenario, including whether each step passed or failed, and it’s a great way to visualize your test results.

### How It Works

- **Step Definitions**: The `ExampleSteps.java` class contains the methods that correspond to each step in your Gherkin scenarios. Cucumber will map your Gherkin steps to these methods.
- **Cucumber Runner**: The `TestRunner.java` class runs your Cucumber tests using the JUnit framework and integrates with the Maven build lifecycle.

### Conclusion

This project provides a basic structure for using Cucumber with Java. It's a great starting point to experiment with BDD and integrate it into your testing strategy!



