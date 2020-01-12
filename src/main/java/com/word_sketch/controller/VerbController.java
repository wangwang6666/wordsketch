package com.word_sketch.controller;

import com.word_sketch.entity.WordWithSig;
import com.word_sketch.service.VerbService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class VerbController {

    @Autowired
    private VerbService verbService;

    @RequestMapping("/wordsketch/verb")
    public String getSketch(@RequestParam("word") String verb,
                            @RequestParam(value = "order", defaultValue = "freq") String order,
                            Model model) {
        model.addAttribute("Objects", verbService.getObject(verb, order));
        model.addAttribute("Subjects",verbService.getSubject(verb, order));
        model.addAttribute("Modifiers",verbService.getModifiers(verb, order));
        model.addAttribute("Modifies", verbService.getModifies(verb, order));
        model.addAttribute("word", verb);
        model.addAttribute("order", order);
        return "verb";
    }

}
