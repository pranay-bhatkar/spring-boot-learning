# Spring Boot Learning Project 🚀

Welcome to my Spring Boot learning project! This repository documents my journey as I explore the powerful Spring Boot framework for building Java applications. Below, I outline key concepts I’ve learned today, their importance, and the advantages of using Spring Boot.

## Course Details 💻
I am learning Spring Boot through the Udemy course "Spring Boot 3: Learn Spring 6, Spring Core, Spring REST, Spring MVC, Spring Security, Thymeleaf, JPA, Hibernate, MySQL" by Chad Darby, a popular Java Spring instructor. This course provides in-depth knowledge and hands-on experience with the latest Spring technologies. [Check out the course here!](https://www.udemy.com/course/spring-hibernate-tutorial/?couponCode=ST8MT101424)


<div align="center">

# Day 1

</div>


## Table of Contents
1. [Introduction to Spring Boot](#introduction-to-spring-boot)
2. [Importance and Advantages of Spring Boot](#importance-and-advantages-of-spring-boot)
3. [Spring Boot Initializer](#spring-boot-initializer)
4. [Creating a REST Controller](#creating-a-rest-controller)
5. [Understanding Maven](#understanding-maven)
6. [Maven Project Structure](#maven-project-structure)
7. [Key Maven Concepts](#key-maven-concepts)
8. [Spring Boot Actuators](#spring-boot-actuators)
9. [Securing Endpoints](#securing-endpoints)
10. [Running Spring Application from Command Line](#running-spring-application-from-command-line)
11. [Injecting Custom Properties](#injecting-custom-properties)
12. [Configuring Spring Boot Server](#configuring-spring-boot-server)
13. [Getting Started](#getting-started)

## Introduction to Spring Boot
Spring Boot is an extension of the Spring framework that simplifies the process of setting up and developing new applications. It provides a comprehensive suite of tools and libraries, enabling developers to create stand-alone, production-ready applications with minimal configuration.

## Importance and Advantages of Spring Boot
1. **Rapid Development**: Spring Boot minimizes the amount of boilerplate code required to set up a Spring application, allowing developers to focus more on building business logic rather than configuration.
2. **Convention Over Configuration**: It follows the principle of convention over configuration, which means sensible defaults are provided. Developers can override configurations as needed without specifying every detail.
3. **Embedded Servers**: Spring Boot comes with embedded servers (like Tomcat, Jetty, or Undertow), enabling applications to be easily run as stand-alone Java applications without requiring separate server installations.
4. **Microservices Ready**: Spring Boot is designed to create microservices architecture, making it easier to develop, deploy, and manage distributed systems.
5. **Rich Ecosystem**: It integrates seamlessly with various Spring projects (Spring Data, Spring Security, Spring Cloud, etc.), providing a robust ecosystem for building enterprise-grade applications.
6. **Production-Ready Features**: Spring Boot provides built-in features for monitoring, health checks, and metrics via Spring Actuator, facilitating production readiness.

## Spring Boot Initializer
The Spring Boot Initializer is a web-based tool that allows developers to bootstrap a new Spring Boot project quickly. It enables the selection of project metadata (like group ID, artifact ID, and package name) and dependencies (like Spring Web, Spring Data JPA, etc.) in an intuitive interface.

### Importance:
- Saves time and effort by generating a ready-to-use project structure.
- Reduces the complexity of configuring dependencies and build tools.

[Explore Spring Initializr](https://start.spring.io/)

## Creating a REST Controller
Creating RESTful web services is a core feature of Spring Boot. By using the `@RestController` annotation, developers can easily map HTTP requests to Java methods.

### Importance:
- Enables the development of scalable APIs that can be consumed by various clients (web, mobile, etc.).
- Supports standard HTTP methods (GET, POST, PUT, DELETE) for interaction.

### Example:
```java
@RestController
@RequestMapping("/api")
public class MyController {
    
    @GetMapping("/greeting")
    public String greet() {
        return "Hello, World!";
    }
}
```

[Read about Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)

## Understanding Maven
Maven is a build automation tool used primarily for Java projects. It simplifies the process of managing project dependencies, build lifecycle, and project structure.

Importance:
- Centralizes the management of dependencies, plugins, and project configurations.
- Facilitates the integration of external libraries and frameworks.

[Maven documentation](https://maven.apache.org/guides/index.html)

## Maven Project Structure
Maven projects follow a standard directory layout:

- ```src/main/java``` : Contains Java source files.
- ```src/main/resources``` : Contains configuration files and resources.
- ```src/test/java``` : Contains test files.
  
### Importance:
- Provides a clear organization of code, making it easier to manage and maintain.
- Ensures that the project adheres to best practices, enhancing collaboration among developers.

## Key Maven Concepts
1. **Dependencies:** Libraries that your project relies on.
2. **Plugins:** Tools that can be executed during the build process (e.g., compiling code, running tests).
3. **Lifecycle Phases:** Steps in the build process, such as ```compile```, ```test```, and ```package```.

### Importance:
- Understanding these concepts is crucial for managing builds effectively and ensuring that the application runs smoothly.

## Spring Boot Actuators
Actuators provide built-in endpoints for monitoring and managing Spring Boot applications. They expose important information about the application’s health, metrics, and environment.

### Importance:
- Facilitates easy monitoring of application performance and health status in production.
- Enhances operational capabilities with minimal additional coding.
  
[Learn about Spring Boot Actuators](https://docs.spring.io/spring-boot/reference/actuator/index.html)

## Securing Endpoints
With Spring Security, developers can secure REST endpoints to protect sensitive information and ensure that only authorized users can access specific resources.

### Importance:
- Protects applications from unauthorized access and ensures data integrity.
- Provides robust authentication and authorization mechanisms.

[Spring Security Guide](https://spring.io/projects/spring-security)

## Running Spring Application from Command Line
Spring Boot applications can be easily run from the command line using Maven, allowing for quick testing and development iterations.

Command:
```
mvn spring-boot:run

```

### Importance:
- Simplifies the development workflow by enabling developers to quickly test changes without a complex deployment process.

## Injecting Custom Properties
Custom properties can be injected into the Spring Boot application via the ```application.properties``` or ```application.yml``` files, allowing developers to configure settings like database URLs, server ports, and more.

### Importance:
- Enhances flexibility in application configurations without altering the code.
- Allows for different configurations for various environments (development, testing, production).

[Spring Boot Configuration](https://docs.spring.io/spring-boot/appendix/application-properties/index.html)

## Configuring Spring Boot Server
Spring Boot applications come with an embedded server, such as Tomcat, allowing for straightforward deployment. Server configurations, like port numbers, can be easily managed through the application properties.

### Importance:
- Reduces deployment complexity by eliminating the need for a separate server setup.
- Enables easy customization of server settings to fit application needs.

## Getting Started
1. **Clone this repository:**
```
git clone https://github.com/pranay-bhatkar/spring-boot-learning.git

```

2. **Navigate to the project directory:**
```
cd springboot-project

```

3. **Run the application:**
```
mvn spring-boot:run

```

---




