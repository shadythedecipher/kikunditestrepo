package com.mingati.kikundi.validator.user;

import com.mingati.kikundi.dto.UserDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class UsernameAlreadyExistsValidator implements UserValidator{
    @Override
    public String validate(UserDto userDto) {
        return  StringUtils.EMPTY;
    }
}
