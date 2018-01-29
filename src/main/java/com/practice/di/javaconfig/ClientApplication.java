package com.practice.di.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigConstructorInjection.class);
        WeatherUpdate weatherUpdate = context.getBean("weatherUpdate", WeatherUpdate.class);

        System.out.println(weatherUpdate.getUpdate());
        context.close();
    }
}
