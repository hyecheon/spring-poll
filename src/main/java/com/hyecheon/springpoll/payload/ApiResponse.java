package com.hyecheon.springpoll.payload;

import lombok.Data;

/**
 * Project : spring-poll
 * Created by IntelliJ IDEA
 * Developer : 이혜천
 * Date : 2018-04-23
 * Time : 오후 11:59
 * Email : ihyecheon@gmail.com
 */
@Data
public class ApiResponse {
    private Boolean success;
    private String message;

    public ApiResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
