package com.hyecheon.springpoll.payload;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Project : spring-poll
 * Created by IntelliJ IDEA
 * Developer : 이혜천
 * Date : 2018-04-23
 * Time : 오후 11:55
 * Email : ihyecheon@gmail.com
 */
@Data
public class LoginRequest {
    @NotBlank
    private String usernameOrEmail;
    @NotBlank
    private String password;

}
