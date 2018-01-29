Spring Bean Dependency Types Using Java Config

README
======

This repository contains code examples for different types of bean injection in Spring. Broadly, Spring supports these injection types:

1. Constructor based injection
2. Setter based injection

The examples here use Java config (class) based mechanism for Spring Bean definition and injection using @Configuration annotation. While it can also be done using XML file(s) and @Autowired annotations (using @ComponentScan, @Service, @Component etc.).

The AppConfigConstructorInjection class shows how to use constructor injection. While AppConfigSetterInjection shows setter based injection. The ClientApplication is the client application which uses the beans and their methods.

The project is a maven based project and can be imported to IntelliJ and Eclipse for editing and running easily.

There are Unit tests to show and test the funtionality.
