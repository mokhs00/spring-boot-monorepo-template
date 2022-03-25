package com.mokhs00.spring_boot_monorepo_template.common.util;

import com.mokhs00.spring_boot_monorepo_template.common.error.ApplicationException;
import com.mokhs00.spring_boot_monorepo_template.common.error.ErrorCode;

public class StorageFileNotFoundException extends ApplicationException {

    public StorageFileNotFoundException() {
        super(ErrorCode.STORAGE_FILE_NOT_FOUND);
    }

    public StorageFileNotFoundException(String message) {
        super(message, ErrorCode.STORAGE_FILE_NOT_FOUND);
    }

}
