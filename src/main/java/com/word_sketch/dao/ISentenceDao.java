package com.word_sketch.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ISentenceDao {
    List<String> querySentences(String phrase);
}
