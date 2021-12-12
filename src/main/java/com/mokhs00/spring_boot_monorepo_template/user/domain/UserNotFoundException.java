package com.mokhs00.spring_boot_monorepo_template.user.domain;

import com.mokhs00.spring_boot_monorepo_template.common.error.ApplicationException;
import com.mokhs00.spring_boot_monorepo_template.common.error.ErrorCode;

public class UserNotFoundException extends ApplicationException {
    public UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
