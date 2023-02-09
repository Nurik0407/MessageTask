package peaksoft.entity;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements Service {
    public String getMessage() {
        return "Sms: Hello world...";
    }
}
