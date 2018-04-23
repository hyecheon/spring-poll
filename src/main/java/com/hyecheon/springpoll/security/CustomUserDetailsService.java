package com.hyecheon.springpoll.security;

import com.hyecheon.springpoll.model.User;
import com.hyecheon.springpoll.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Project : spring-poll
 * Created by IntelliJ IDEA
 * Developer : 이혜천
 * Date : 2018-04-23
 * Time : 오후 10:03
 * Email : ihyecheon@gmail.com
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        final User user = userRepository.findByUsernameOrEmail(s, s)
                .orElseThrow(() -> new UsernameNotFoundException("사용자 아이디 또는 이메일을 찾을수 없습니다,: " + s));
        return UserPrincipal.create(user);
    }

    public UserDetails loadUserById(Long id) {
        final User user = userRepository.findById(id)
                .orElseThrow(() -> new UsernameNotFoundException("사용자 아이디를 찾을수 없습니다,: " + id));
        return UserPrincipal.create(user);
    }
}
