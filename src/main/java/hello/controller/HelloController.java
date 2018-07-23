package hello.controller;

import hello.service.HelloService;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController extends BaseController {

    private final HelloService service;

    public HelloController(MessageSource messageSource, HelloService service) {
        super(messageSource);
        this.service = service;
    }

    @RequestMapping("/helloFromService")
    public String greetingFromService() {
        return service.sayHello();
    }

    @RequestMapping("/helloFromController")
    public String greetingFromController() {
        return messageSource.getMessage("hello.there", new String[]{"Tiago", "Gelatti", "controller"},
                LocaleContextHolder.getLocale());
    }

    @RequestMapping("/helloFromError")
    public String greetingFromError() throws Exception {
        int a = 1 / 0;
        return "";
    }

    @ExceptionHandler({Exception.class})
    public String handleException(Locale locale) {
        String errorMessage = messageSource.getMessage("error.uknown", null, locale);
        return errorMessage;
    }

}
