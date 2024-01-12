package com.nhnacademy.springmvc.repository;

import com.nhnacademy.springmvc.domain.Admin;
import com.nhnacademy.springmvc.domain.Customer;
import com.nhnacademy.springmvc.domain.User;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AdminRepositoryImpl implements AdminRepository {

    private final Map<String, Admin> adminMap = new HashMap<>();
    @Override
    public boolean exists(String id) {
        return adminMap.containsKey(id);
    }

    @Override
    public boolean matches(String id, String password) {
        return Optional.ofNullable(getUser(id))
                .map(Admin ->Admin.getPassword().equals(password))
                .orElse(false);
    }

    @Override
    public User getUser(String id) {
        return exists(id) ? adminMap.get(id):null;
    }
}






