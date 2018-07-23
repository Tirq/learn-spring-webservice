package hello.controller;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

    protected final MessageSource messageSource;

    public BaseController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
