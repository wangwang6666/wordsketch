package com.word_sketch.service;

import com.word_sketch.dao.IAdjDao;
import com.word_sketch.entity.WordWithSig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdjService {
    @Autowired
    private IAdjDao adjDao;

    public List<WordWithSig> getModifiers (String adj, String order) {
        return adjDao.getModifiers(adj, order);
    }

    public List<WordWithSig> getModifies (String adj, String order) {
        return adjDao.getModifies(adj, order);
    }
}
