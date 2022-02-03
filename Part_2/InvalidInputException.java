package Part_2;

public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
      super(message);
    }
    
    public InvalidInputException(String message, Throwable cause) {
      super(message, cause);
    }
  }