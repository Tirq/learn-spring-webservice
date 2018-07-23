package hello.service;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class HelloService extends BaseService {


    public HelloService(MessageSource messageSource) {
        super(messageSource);
    }

    public String sayHello() {
        return messageSource.getMessage("hello.there", new String[]{"Tiago", "Gelatti", "service"},
                LocaleContextHolder.getLocale());
    }
}
