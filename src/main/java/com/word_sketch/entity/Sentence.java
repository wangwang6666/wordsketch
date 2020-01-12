package com.word_sketch.entity;

public class Sentence {
    private Long id;
    private String sentence;

    public Long getId() {
        return id;
    }

    public String getSentence() {
        return sentence;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
