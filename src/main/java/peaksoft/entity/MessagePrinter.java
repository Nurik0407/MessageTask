package peaksoft.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@NoArgsConstructor
@Getter
@Component("messagePrinter")
public class MessagePrinter {
    private Service service;

    @Autowired
    public MessagePrinter(@Qualifier("emailService") Service service) {
        this.service = service;
    }

    public void getMessage() {
        System.out.println(getService().getMessage());
    }
}
