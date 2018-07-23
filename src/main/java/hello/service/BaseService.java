package hello.service;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class BaseService {

    protected final MessageSource messageSource;

    public BaseService(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

}
