package com.word_sketch.service;

import com.word_sketch.dao.ISentenceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SentenceService {

    @Autowired
    private ISentenceDao sentenceDao;

    public List<String> querySentences(String phrase) {
        return sentenceDao.querySentences(phrase).stream()
                .map(s -> {
                    StringBuilder sb = new StringBuilder(s);
                    int length = phrase.length();
                    int start = s.indexOf(phrase);
                    sb.insert(start+length, "</span>");
                    sb.insert(start,"<span style=\"color:red\">");
                    return sb.toString();
                }).collect(Collectors.toList());
    }
}
