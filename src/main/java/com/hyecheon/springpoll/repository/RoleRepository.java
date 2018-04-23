package com.hyecheon.springpoll.repository;

import com.hyecheon.springpoll.model.Role;
import com.hyecheon.springpoll.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Project : spring-poll
 * Created by IntelliJ IDEA
 * Developer : 이혜천
 * Date : 2018-04-23
 * Time : 오전 12:21
 * Email : ihyecheon@gmail.com
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
