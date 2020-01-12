package com.word_sketch.entity;

public class WordWithSig {
    private String word;
    private Float sig;
    private Integer freq;

    public void setWord(String word) {
        this.word = word;
    }

    public void setSig(Float sig) {
        this.sig = sig;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public Integer getFreq() {
        return freq;
    }

    public Float getSig() {
        return sig;
    }
}
