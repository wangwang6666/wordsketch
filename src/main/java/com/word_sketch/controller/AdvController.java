package com.word_sketch.controller;

import com.word_sketch.entity.WordWithSig;
import com.word_sketch.service.AdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AdvController {

    @Autowired
    private AdvService advService;

    @RequestMapping("/wordsketch/adverb")
    public String getSketch (@RequestParam("word") String adv,
                             @RequestParam(value = "order", defaultValue = "freq") String order,
                             Model model) {
        model.addAttribute("modifies", advService.getModifies(adv, order));
        model.addAttribute("word", adv);
        model.addAttribute("order", order);
        return "adv";
    }
}
