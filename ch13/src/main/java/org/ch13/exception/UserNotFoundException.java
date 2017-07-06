package org.ch13.exception;

/**
 * Created by langye on 2017/3/29.
 */
public class UserNotFoundException extends RuntimeException{

    private String message;
    public UserNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
