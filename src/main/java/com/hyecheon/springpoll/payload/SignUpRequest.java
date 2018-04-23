package com.hyecheon.springpoll.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Project : spring-poll
 * Created by IntelliJ IDEA
 * Developer : 이혜천
 * Date : 2018-04-23
 * Time : 오후 11:56
 * Email : ihyecheon@gmail.com
 */
@Data
public class SignUpRequest {
    @NotBlank
    @Size(min = 4, max = 40)
    private String name;
    @NotBlank
    @Size(min = 2, max = 15)
    private String username;
    @NotBlank
    @Size(max = 40)
    @Email
    private String email;
    @NotBlank
    @Size(min = 6, max = 20)
    private String password;
}
