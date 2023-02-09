package peaksoft.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class EmailService implements Service {
    public String getMessage() {
        return "Email: Hello world...";
    }
}
