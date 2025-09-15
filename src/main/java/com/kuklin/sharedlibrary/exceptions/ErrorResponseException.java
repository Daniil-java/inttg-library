package com.kuklin.sharedlibrary.exceptions;

import lombok.Data;

@Data
public class ErrorResponseException extends RuntimeException{
    private final ErrorStatus errorStatus;
    private final Service service;

    public ErrorResponseException(ErrorStatus errorStatus, Throwable ex, Service service) {
        super(ex);
        this.errorStatus = errorStatus;
        this.service = service;
    }

    public ErrorResponseException(ErrorStatus errorStatus, Service service) {
        super(errorStatus.getMessage());
        this.errorStatus = errorStatus;
        this.service = service;
    }
}
