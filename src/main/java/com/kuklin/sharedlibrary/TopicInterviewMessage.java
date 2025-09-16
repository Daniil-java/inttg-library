package com.kuklin.sharedlibrary;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TopicInterviewMessage {
    private String content;
    private Boolean isEnd;
    private int score;
}
