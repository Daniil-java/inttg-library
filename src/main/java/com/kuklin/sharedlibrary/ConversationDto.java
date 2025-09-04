package com.kuklin.sharedlibrary;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ConversationDto {
    private Long id;
    private String name;
    private Long userId;
}
