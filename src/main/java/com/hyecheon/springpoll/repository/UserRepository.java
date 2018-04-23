package com.hyecheon.springpoll.repository;

import com.hyecheon.springpoll.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Project : spring-poll
 * Created by IntelliJ IDEA
 * Developer : 이혜천
 * Date : 2018-04-23
 * Time : 오전 12:18
 * Email : ihyecheon@gmail.com
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findById(Long userId);

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
