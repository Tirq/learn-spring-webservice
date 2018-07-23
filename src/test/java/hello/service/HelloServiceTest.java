package hello.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest {

    private HelloService service;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        this.service = new HelloService(messageSource);
    }

    @Test
    public void testHello() {
        String s = service.sayHello();
        assertEquals(s, "Hello Tiago Gelatti, have a great day! - service");
    }

}
