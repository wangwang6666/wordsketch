package com.word_sketch.dao;

import com.word_sketch.entity.WordWithSig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IAdvDao {

    List<WordWithSig> getModifies (@Param("adv") String adv,
                                   @Param("order") String order);
}
