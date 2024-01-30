## Table of Contents

- [Technologies Used](#technologies-used)
- [Folder Structure](#folder-structure)
- [Setup and Running](#setup-and-running)
- [Design Patterns](#design-patterns)
- [Created By](#created-by)

## Technologies Used

- **Serenity**: Test automation framework that integrates with Cucumber for behavior-driven development (BDD).
- **Cucumber**: BDD tool for writing acceptance tests in a human-readable format.
- **Selenium**: Open-source tool for automating web sites.
- **Java**: Programming language used for test implementation.
- **Gradle**: Build tool used to manage dependencies and build the project.
- **Other Dependencies**: Add any other significant dependencies or tools used.

## Folder Structure

The project structure is organized as follows:

```bash
|-- .gitignore
|-- README.md
|-- build.gradle
|-- gradlew
|-- gradlew.bat
|-- serenity.properties
|-- src
    -- test
        |-- java
        |   -- com
        |       -- andrest
        |           |-- acceptanceTestSuite
        |           |   |-- AcceptanceTestSuite.java
        |           |-- navigation
        |           |   |-- CinemarkGoHomePage.java
        |           |   |-- NavigateTo.java
        |           |-- steps
        |           |   |-- ParameterDefinitions.java
        |           |   |-- RegisterStepDefinitions.java
        |           |   |-- SearchMovieStepDefinitions.java
        |           |-- targets
        |           |   |-- AlertTargets.java
        |           |   |-- BillboardTargets.java
        |           |   |-- LoginTargets.java
        |           |   |-- PaymentTargets.java
        |           |   |-- RegisterTargets.java
        |           |   |-- SelectMovieTargets.java
        |           |-- tasks
        |           |   |-- LoginForm.java
        |           |   |-- PaymentForm.java
        |           |   |-- RegisterForm.java
        |           |   |-- SelectComb.java
        |           |   |-- SelectMovie.java
        |           |-- utils
        |               |-- Constants.java
        |               |-- CustomTargets.java
        |               |-- DropDownOption.java
        |               |-- EnterDataAfterClick.java
        |-- resources
            |-- features
            |   |-- create_booking.feature
            |   |-- create_user.feature
            |-- serenity.conf
            

```

## Setup and Running

Follow these steps to set up and run the project:

1. **Clone Repository**:
    - <code> https://github.com/AndresTapiero/web-cinemark.git</code>


2. **Install Dependencies**:
   <code>./gradlew install</code>


5. **Run Tests**:
   <code>./gradlew clean test</code>

Add any additional steps or configurations required to run the project.

## Design Patterns

- Page Object Model
- Screenplay Pattern

## Created By

- Andrés Tapiero