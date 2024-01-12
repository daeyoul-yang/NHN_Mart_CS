package com.nhnacademy.springmvc.repository;

import com.nhnacademy.springmvc.domain.Customer;
import com.nhnacademy.springmvc.domain.User;
import java.util.HashMap;
import java.util.Map;

public interface UserRepository  {

    boolean exists(String id);
    boolean matches(String id, String password);

    User getUser(String id);
}
