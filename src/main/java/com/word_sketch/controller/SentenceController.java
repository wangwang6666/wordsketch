package com.word_sketch.controller;

import com.word_sketch.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SentenceController {

    @Autowired
    private SentenceService sentenceService;

    @RequestMapping("/wordsketch/sentence")
    public String getSketch(@RequestParam("phrase") String phrase,
                            Model model) {
        model.addAttribute("sentences", sentenceService.querySentences(phrase));
        return "sentence";
    }
}
