package com.word_sketch.dao;

import com.word_sketch.entity.WordWithSig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IVerbDao {

    List<WordWithSig> getSubject(@Param("verb") String verb,
                                 @Param("order") String order);

    List<WordWithSig> getObject(@Param("verb") String verb,
                                @Param("order") String order);

    List<WordWithSig> getModifiers(@Param("verb") String verb,
                                   @Param("order") String order);

    List<WordWithSig> getModifies(@Param("verb") String verb,
                                  @Param("order") String order);
}
