package core.basesyntax.exceptions;

public class ReadDataFromFileException extends RuntimeException {
    public ReadDataFromFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadDataFromFileException(String message) {
        super(message);
    }
}
