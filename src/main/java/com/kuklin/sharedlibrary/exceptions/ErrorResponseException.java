package com.kuklin.sharedlibrary.exceptions;

import lombok.Data;

@Data
public class ErrorResponseException extends RuntimeException{
    private final ErrorStatus errorStatus;
    private final ServiceOrigin serviceOrigin;

    public ErrorResponseException(ErrorStatus errorStatus, Throwable ex, ServiceOrigin serviceOrigin) {
        super(ex);
        this.errorStatus = errorStatus;
        this.serviceOrigin = serviceOrigin;
    }

    public ErrorResponseException(ErrorStatus errorStatus, ServiceOrigin serviceOrigin) {
        super(errorStatus.getMessage());
        this.errorStatus = errorStatus;
        this.serviceOrigin = serviceOrigin;
    }
}
