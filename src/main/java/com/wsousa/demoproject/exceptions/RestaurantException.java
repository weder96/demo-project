package com.wsousa.demoproject.exceptions;

public class RestaurantException  extends RuntimeException {
    public RestaurantException(String message){
        super("Exception  :".concat(message));
    }
}
