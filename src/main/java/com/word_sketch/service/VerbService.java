package com.word_sketch.service;

import com.word_sketch.dao.IVerbDao;
import com.word_sketch.entity.WordWithSig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VerbService {

    @Autowired
    private IVerbDao verbDao;

    public List<WordWithSig> getObject(String verb, String order) {
        return verbDao.getObject(verb, order);
    }

    public List<WordWithSig> getSubject(String verb, String order) {
        return verbDao.getSubject(verb,order);
    }

    public List<WordWithSig> getModifiers(String verb, String order) {
        return verbDao.getModifiers(verb,order);
    }

    public List<WordWithSig> getModifies(String verb, String order) {
        return verbDao.getModifies(verb,order);
    }
}
