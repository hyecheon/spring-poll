package com.hyecheon.springpoll.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Project : spring-poll
 * Created by IntelliJ IDEA
 * Developer : 이혜천
 * Date : 2018-04-24
 * Time : 오전 12:08
 * Email : ihyecheon@gmail.com
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AppException extends RuntimeException {
    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}
