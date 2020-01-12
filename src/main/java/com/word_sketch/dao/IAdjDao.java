package com.word_sketch.dao;

import com.word_sketch.entity.WordWithSig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IAdjDao {
    List<WordWithSig> getModifiers(@Param("adj") String adj,
                                   @Param("order") String order);

    List<WordWithSig> getModifies (@Param("adj") String adj,
                                   @Param("order") String order);
}
