# Selenium Test Automation Project

## Project Overview

This project contains automated test scripts using Selenium WebDriver to verify the login functionality of the Germany Calling application. The tests are written in Java and use the TestNG framework.

## Project Structure

- **src/**: Contains the source code for the test scripts.
  - **TestPage/**: Contains the test classes.
  - **TestWebsite/**: Contains the Page Object Model (POM) classes.

- **testng.xml**: Configuration file for running the TestNG tests.
- **pom.xml**: Maven project file containing dependencies for Selenium, TestNG, etc.
- **README.md**: Project documentation.

## Test Cases

### 1. Successful Login
- **Objective**: Verifies that a user can log in with valid credentials.
- **Expected Outcome**: The user is redirected to the upload CV section.

### 2. Unsuccessful Login
- **Objective**: Verifies that a user cannot log in with invalid credentials.
- **Expected Outcome**: An appropriate error message is displayed.

### 3. Login with Empty Fields
- **Objective**: Verifies the login page’s response when both the username and password fields are left empty.
- **Expected Outcome**: Error messages are displayed for both fields.

### 4. Login with Special Characters
- **Objective**: Verifies the login page’s response to special characters in the username and password fields.
- **Expected Outcome**: An appropriate error message is displayed.

## Setup Instructions

### Prerequisites

- Java JDK 8 or later
- Maven
- ChromeDriver (compatible with your Chrome version)
- Git

### How to Run the Tests

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Suraj-800/TestProject.git
   cd TestProject

## Running the TestNG XML Suite

### Running Tests with TestNG XML Suite

To execute all your tests defined in the TestNG XML suite, follow these steps:

1. **Locate the TestNG XML File**:
   - In your project directory, locate the TestNG XML suite file, typically named `testng.xml`.

2. **Run the Test Suite**:
   - Right-click on the `testng.xml` file.
   - Select **Run As** > **TestNG Suite**.
   - This will execute all the tests defined in the XML file according to the suite configuration.

3. **Updating the Project**:
   - After the test suite has completed, go to the **Project Explorer**.
   - Right-click on your project name.
   - Select **Maven** > **Update Project** (or simply **Refresh** if you're not using Maven).
   - This will refresh the project structure and show newly generated files.

4. **Viewing the Test Reports**:
   - After refreshing, a new folder (usually named `test-output`) will appear in your project directory.
   - Inside this folder, you can find various reports that summarize the test execution results.
     - **emailable-report.html**: A simple, easy-to-read report summarizing the results of the test suite.
     - **index.html**: A more detailed report with information on individual test cases, including which tests passed, failed, or were skipped.
   - To view these reports, right-click on the file (e.g., `index.html`) and select **Open With** > **Web Browser**.

These reports provide a comprehensive overview of the test execution, allowing you to analyze the outcomes of each test case.


   
