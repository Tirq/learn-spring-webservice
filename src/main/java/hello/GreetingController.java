package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return getGreeting(name);
    }

    private Greeting getGreeting(String name) {
        return new Greeting(getNextCounter(), getBuiltName(name));
    }

    private Long getNextCounter() {
        return counter.incrementAndGet();
    }

    private String getBuiltName(String name) {
        return String.format(template, name);
    }

}