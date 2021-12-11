package com.mokhs00.spring_boot_monorepo_template.common.error;

import lombok.Getter;

@Getter
public class ApplicationException extends RuntimeException {

    private ErrorCode errorCode;

    private ApplicationException() {
    }

    public ApplicationException(ErrorCode errorCode) {
        super(errorCode.getMessage());
    }
}
