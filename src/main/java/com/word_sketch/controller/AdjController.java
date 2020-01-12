package com.word_sketch.controller;

import com.word_sketch.entity.WordWithSig;
import com.word_sketch.service.AdjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AdjController {
    @Autowired
    private AdjService adjService;

    @RequestMapping("/wordsketch/adjective")
    public String getSketch (@RequestParam("word") String adj,
                             @RequestParam(value = "order", defaultValue = "freq") String order,
                             Model model) {
        model.addAttribute("modifier", adjService.getModifiers(adj, order));
        model.addAttribute("modifies", adjService.getModifies(adj, order));
        model.addAttribute("word", adj);
        model.addAttribute("order", order);
        return "adj";
    }
}
