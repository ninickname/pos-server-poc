package com.nick.pos.model;

import com.nick.pos.dao.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService {
    @Autowired
    PositionRepository positionRepository;

    public void tryToWrite() {
        Position pos = new Position();
        pos.setCompany("woo");
        pos.setLocation("tlv");
        pos.setDirectEmployee(true);
        positionRepository.save(pos);
    }

}
