package com.nick.pos.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

public  @Data class Position {

    @Id
    private String id;
    private String company;
    private String location ;
    private boolean isDirectEmployee;
    private List<Interview> interviews;
}
