package com.mingati.kikundi.validator.user;

import com.mingati.kikundi.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserValidator {
    String validate(UserDto userDto);
}
