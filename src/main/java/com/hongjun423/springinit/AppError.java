package com.hongjun423.springinit;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class AppError {

    public String message;
    public String reson;

}
