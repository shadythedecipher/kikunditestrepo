package com.mingati.kikundi.service;

import com.mingati.kikundi.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDto createCustomer(UserDto customerDto);
}
