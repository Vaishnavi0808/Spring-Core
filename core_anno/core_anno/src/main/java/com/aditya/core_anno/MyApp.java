
package com.aditya.core_anno;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.aditya.core_anno");
        context.refresh();
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.sayHello();
        context.close();
    }

}
