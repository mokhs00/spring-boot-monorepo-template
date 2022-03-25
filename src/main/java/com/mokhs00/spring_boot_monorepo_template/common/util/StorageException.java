package com.mokhs00.spring_boot_monorepo_template.common.util;

import com.mokhs00.spring_boot_monorepo_template.common.error.ApplicationException;
import com.mokhs00.spring_boot_monorepo_template.common.error.ErrorCode;

public class StorageException extends ApplicationException {


    public StorageException(String message) {
        super(message, ErrorCode.INTERNAL_SERVER_ERROR);
    }
}
