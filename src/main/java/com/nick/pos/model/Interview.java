package com.nick.pos.model;

import lombok.Data;

import java.util.Date;

public @Data class Interview {
    private Boolean havePassed ;
    private Interviewer  interviewer;
    private Date date;
    private String summary ;
    private MediaType media;
}
