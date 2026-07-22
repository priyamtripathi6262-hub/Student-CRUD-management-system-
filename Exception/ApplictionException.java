package com.example.demo.Exception;

//import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@ControllerAdvice
@RestControllerAdvice

public class ApplictionException {
    
    @ExceptionHandler(Exception.class)
    public void handleException(Exception e){
        System.out.println("An error occurred" + e.getMessage());
    }
    @ExceptionHandler(ArithmeticException.class)
    public String handleArithmeticException (ArithmeticException e){
     System.out.println("An error occurred" + e.getMessage());
      return"An arithmetic error occurred";

}
}
