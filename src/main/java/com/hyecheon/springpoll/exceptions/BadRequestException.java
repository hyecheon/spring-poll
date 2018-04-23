package com.hyecheon.springpoll.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Project : spring-poll
 * Created by IntelliJ IDEA
 * Developer : 이혜천
 * Date : 2018-04-24
 * Time : 오전 12:09
 * Email : ihyecheon@gmail.com
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}

