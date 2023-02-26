package com.moudjames23.springcollob.exceptions;

import com.moudjames23.springcollob.config.MyHttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.moudjames23.springcollob.config.MyHttpResponse.*;

@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> ressourceNotFound(ResourceNotFoundException exception)
    {
        return response(HttpStatus.NOT_FOUND, exception.getMessage(), null);
    }

    @ExceptionHandler(ResourceAlreadyExistException.class)
    public ResponseEntity<Object> resourceAlreadyExist(ResourceAlreadyExistException exception)
    {
        return  response(HttpStatus.CONFLICT, exception.getMessage(), null);
    }
}
