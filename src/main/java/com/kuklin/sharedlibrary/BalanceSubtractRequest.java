package com.kuklin.sharedlibrary;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class BalanceSubtractRequest {
    private BigDecimal amount;
}
