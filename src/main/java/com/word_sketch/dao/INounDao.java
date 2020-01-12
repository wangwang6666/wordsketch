package com.word_sketch.dao;

import com.word_sketch.entity.And;
import com.word_sketch.entity.WordWithSig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface INounDao {
    List<WordWithSig> getObjectWithoutPos(@Param("noun") String noun,
                                          @Param("order") String order);

//    List<WordWithSig> getObjectWithPos(@Param("noun") String noun);

    List<WordWithSig> getSubjectWithoutPos(@Param("noun") String noun,
                                           @Param("order") String order);

    List<WordWithSig> getModifies(@Param("noun") String noun,
                                  @Param("order") String order);

    List<WordWithSig> getModifier(@Param("noun") String noun,
                                  @Param("order") String order);

    List<WordWithSig> getMeasures(@Param("noun") String noun,
                                  @Param("order") String order);

    List<WordWithSig> getComposites(@Param("noun") String noun);

    List<And> getAnd(@Param("noun") String noun);

    List<And> getCachedAnd(String noun);

    void addWord(And and);
}
