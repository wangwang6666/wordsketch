package com.word_sketch.entity;

public class And {
    private Integer id1;
    private Integer id2;
    private String statement;
    private Integer freq;
    private String word1;
    private String word2;

    public Integer getId1() {
        return id1;
    }

    public Integer getId2() {
        return id2;
    }

    public String getStatement() {
        return statement;
    }

    public Integer getFreq() {
        return freq;
    }

    public String getWord1() {
        return word1;
    }

    public String getWord2() {
        return word2;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    public void setWord1(String word1) {
        this.word1 = word1;
    }

    public void setWord2(String word2) {
        this.word2 = word2;
    }
}
