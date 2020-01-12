package com.word_sketch.service;

import com.word_sketch.dao.INounDao;
import com.word_sketch.entity.And;
import com.word_sketch.entity.WordWithSig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class NounService {

    @Autowired
    private INounDao nounDao;

    public List<WordWithSig> getObject(String noun, String order) {
        return nounDao.getObjectWithoutPos(noun, order);
    }

    public List<WordWithSig> getSubject(String noun, String order) {
        return nounDao.getSubjectWithoutPos(noun, order);
    }

    public List<WordWithSig> getModifies(String noun, String order) {
        return nounDao.getModifies(noun, order);
    }

    public List<WordWithSig> getModifier(String noun, String order) {
        return nounDao.getModifier(noun, order);
    }

    public List<WordWithSig> getMeasures(String noun, String order) {
        return nounDao.getMeasures(noun, order);
    }

    public List<WordWithSig> getComposites(String noun) {
        return nounDao.getComposites(noun);
    }

    public List<And> getAnd(String noun){
        return nounDao.getAnd(noun);
    }

    public List<And> getCachedAnd(String noun) {
        return nounDao.getCachedAnd(noun);
    }

    public void add(And and) {
        nounDao.addWord(and);
    }
}
