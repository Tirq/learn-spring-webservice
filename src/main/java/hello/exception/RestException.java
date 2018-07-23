package hello.exception;


public class RestException extends RuntimeException {

    private String message;

    public RestException(String message) {
        this.message = message;
    }
}
