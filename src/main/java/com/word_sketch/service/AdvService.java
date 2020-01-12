package com.word_sketch.service;

import com.word_sketch.dao.IAdvDao;
import com.word_sketch.entity.WordWithSig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvService {

    @Autowired
    private IAdvDao advDao;

    public List<WordWithSig> getModifies (String adv, String order) {
        return advDao.getModifies(adv, order);
    }
}
