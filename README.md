# Spring Boot Learning Project 🚀

Welcome to my Spring Boot learning project! This repository documents my journey as I explore the powerful Spring Boot framework for building Java applications. Below, I outline key concepts I’ve learned today, their importance, and the advantages of using Spring Boot.

## Reference Course Details 💻
I am learning Spring Boot through the Udemy course "Spring Boot 3: Learn Spring 6, Spring Core, Spring REST, Spring MVC, Spring Security, Thymeleaf, JPA, Hibernate, MySQL" by Chad Darby, a popular Java Spring instructor. This course provides in-depth knowledge and hands-on experience with the latest Spring technologies. [Check out the course here!](https://www.udemy.com/course/spring-hibernate-tutorial/?couponCode=ST8MT101424)

---
<div align="center">

# Day 1 : Spring Boot Qick Start

</div>
---


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
<div align="center">

# Day 2 : Spring Core Concepts

</div>

## Table of Contents
1. [What is Inversion of Control (IoC)?](#what-is-inversion-of-control-ioc)
2. [Dependency Injection (DI)](#dependency-injection-di)
3. [Constructor Injection](#constructor-injection)
4. [IDE Warning](#ide-warning)
5. [Component Scanning](#component-scanning)
6. [Setter Injection](#setter-injection)
7. [Qualifiers](#qualifiers)
8. [Primary Beans](#primary-beans)
9. [Lazy Initialization](#lazy-initialization)
10. [Bean Scopes](#bean-scopes)
11. [Bean Lifecycle Methods](#bean-lifecycle-methods)
12. [Java Config Beans](#java-config-beans)

## What is Inversion of Control (IoC)?
Inversion of Control is a design principle in which the control of object creation and lifecycle management is transferred from the application code to a framework. In Spring, this is primarily achieved through the Spring IoC container, which manages the instantiation, configuration, and assembly of beans.

### Importance:
- Promotes loose coupling between components.
- Enhances testability by allowing dependencies to be managed externally.

## Dependency Injection (DI)
Dependency Injection is a specific implementation of Inversion of Control where an object receives its dependencies from an external source rather than creating them itself. This can be done through constructor injection, setter injection, or method injection.

### Importance:
- Improves code modularity and reusability.
- Makes it easier to manage dependencies, especially in large applications.

## Constructor Injection
Constructor injection involves passing dependencies through a class constructor. When the Spring container creates an instance of a class, it provides the required dependencies as constructor parameters.

### Example:
```java
@Component
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
```

### Importance:
- Ensures that the required dependencies are available when the object is created.
- Makes the class immutable (if the fields are `final`).

## IDE Warning
Sometimes, IDEs (like IntelliJ IDEA or Eclipse) may show warnings about uninitialized components or beans that are not injected correctly. These warnings help developers identify issues related to dependency management and configuration.

### Importance:
- Promotes best practices by alerting developers to potential issues.
- Encourages the use of annotations like `@Autowired`, `@Component`, etc.

## Component Scanning
Component scanning is a mechanism by which the Spring IoC container automatically discovers and registers beans in the application context. It scans specific packages for classes annotated with Spring stereotypes such as `@Component`, `@Service`, `@Repository`, or `@Controller`.

### Importance:
- Reduces the need for manual bean registration.
- Facilitates a cleaner configuration and organization of classes.

## Setter Injection
Setter injection allows dependencies to be provided through setter methods. After the bean is instantiated, Spring calls the setter methods to inject dependencies.

### Example:
```java
@Component
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
```

### Importance:
- Allows for optional dependencies.
- Provides flexibility in modifying dependencies after object creation.

## Qualifiers
In cases where multiple beans of the same type are available, the `@Qualifier` annotation is used to specify which bean to inject. This helps avoid ambiguity.

### Example:
```java
@Autowired
@Qualifier("myUserRepository")
private UserRepository userRepository;
```

### Importance:
- Resolves conflicts when multiple beans exist.
- Enhances the specificity of dependency injection.

## Primary Beans
The `@Primary` annotation indicates that a specific bean should be given preference when multiple candidates are available for autowiring. If a primary bean is present, it will be used when a matching type is requested.

### Example:
```java
@Bean
@Primary
public UserRepository primaryUserRepository() {
    return new JpaUserRepository();
}
```

### Importance:
- Simplifies dependency resolution in scenarios with multiple beans of the same type.

## Lazy Initialization
Lazy initialization defers the creation of a bean until it is needed, rather than at application startup. This can improve application startup time and resource utilization.

### Example:
```java
@Bean
@Lazy
public UserService userService() {
    return new UserService();
}
```

### Importance:
- Reduces the memory footprint for beans that may not be needed immediately.
- Can enhance performance in large applications.

## Bean Scopes
Bean scopes define the lifecycle and visibility of beans in the Spring container. Common scopes include:

- **Singleton**: A single instance per Spring IoC container (default scope).
- **Prototype**: A new instance for each request.
- **Request**: A single instance per HTTP request (web applications).
- **Session**: A single instance per HTTP session (web applications).
- **Application**: A single instance for the entire Spring context.

### Importance:
- Allows developers to control the lifecycle of beans based on their use case.

## Bean Lifecycle Methods
Spring beans have a lifecycle with several phases, including initialization and destruction. Developers can define custom initialization and destruction methods using annotations like `@PostConstruct` and `@PreDestroy`, or through XML configuration.

### Example:
```java
@PostConstruct
public void init() {
    // Initialization logic
}

@PreDestroy
public void cleanup() {
    // Cleanup logic
}
```

### Importance:
- Provides hooks for performing tasks during the lifecycle of a bean.
- Ensures proper resource management.

## Java Config Beans
Java Config is a method of defining Spring beans using Java classes and annotations instead of XML. This approach is more type-safe and provides better IDE support.

### Example:
```java
@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
```

### Importance:
- Enhances readability and maintainability of configurations.
- Promotes the use of Java features, such as type checking and refactoring.

---






