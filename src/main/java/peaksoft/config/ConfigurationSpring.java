package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import peaksoft.entity.EmailService;
import peaksoft.entity.MessagePrinter;
import peaksoft.entity.Service;
import peaksoft.entity.SmsService;

@Configuration
@PropertySource("peaksoft")
public class ConfigurationSpring {


    @Bean
    @Primary
    public Service emailService() {
        return new EmailService();
    }

    @Bean
    public Service smsService() {
        return new SmsService();
    }

    @Bean
    public MessagePrinter messagePrinter() {
        return new MessagePrinter(emailService());
    }
}
