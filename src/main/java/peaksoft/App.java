package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import peaksoft.config.ConfigurationSpring;
import peaksoft.entity.MessagePrinter;
import peaksoft.entity.Service;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ConfigurationSpring.class);

        MessagePrinter messagePrinter = context.getBean("messagePrinter", MessagePrinter.class);
        messagePrinter.getMessage();
    }
}
