package com.mokhs00.spring_boot_monorepo_template.user.domain;

import com.mokhs00.spring_boot_monorepo_template.common.error.ApplicationException;
import com.mokhs00.spring_boot_monorepo_template.common.error.ErrorCode;

public class InvalidPasswordException extends ApplicationException {
    public InvalidPasswordException() {
        super(ErrorCode.INVALID_PASSWORD);
    }
}
