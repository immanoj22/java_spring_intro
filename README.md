# java_spring_intro

Two small projects from when I was learning the core of Spring. They are learning exercises and print to the console; there is no web layer or database.

## Exploring_spring
A plain Maven project using Spring Context (no Spring Boot). It tries the same bean ideas in two ways:
- XML configuration in `spring.xml`: beans, constructor and property injection, `ref`, `lazy-init`, autowire by type
- Java configuration with `@Configuration` and `@ComponentScan` in `AppConfig`

The classes are small things like Human, Computer, Laptop, Desktop, Student and College. A lot of `App.java` is commented-out code from trying different versions.

## demospring
A Spring Boot app (Java 17) with two `@Component` classes, `Car` and `Engine`. `Car` gets `Engine` through `@Autowired`, and the main class asks the context for `Car` and calls `start()`, which prints a line.

## Running
You need JDK 17 and Maven.

```
cd demospring
./mvnw spring-boot:run
```

For `Exploring_spring`, open it in an IDE and run `org.example.App`, or build it with `mvn package`.
