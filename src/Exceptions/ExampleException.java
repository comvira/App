package Exceptions;

public class ExampleException extends RuntimeException{
    public ExampleException() {
        super();
    }

    public ExampleException(String message) {
        super(message);
    }
}
