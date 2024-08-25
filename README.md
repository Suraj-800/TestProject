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

## Running TestNG Tests

### Running Tests in Eclipse

To run the TestNG tests using the Eclipse IDE, follow these steps:

1. **Open the Project**: 
   - Please make sure that your project is imported into Eclipse.

2. **Locate the Test Class**: 
   - Navigate to the `src` folder and locate the test class you want to run. For example, the `LoginTest` class can be found under `src/TestPage/LoginTest.java`.

3. **Run the Test**:
   - Right-click on the test class (e.g., `LoginTest.java`).
   - Select **Run As** > **TestNG Test**.
   - The test will execute, and the results will be displayed in the TestNG view of the Eclipse IDE.

4. **View the Results**:
   - After the tests have been completed, you can view the results in the TestNG panel, which shows the status of each test (e.g., Passed, Failed, Skipped).
   - Detailed logs and any assertion failures will also be available in the Eclipse console.



   
