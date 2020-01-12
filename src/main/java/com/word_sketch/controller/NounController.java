package com.word_sketch.controller;

import com.word_sketch.entity.And;
import com.word_sketch.entity.WordWithSig;
import com.word_sketch.service.NounService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.logging.Logger;

@Controller
public class NounController {

    @Autowired
    private NounService nounService;

    @RequestMapping("wordsketch")
    public String searchNoun() {
        return "home";
    }

    @RequestMapping("/wordsketch/noun")
    public String getSketch(@RequestParam("word") String noun,
                            @RequestParam(value = "order", defaultValue = "freq") String order,
                            Model model) {
        model.addAttribute("Object_of", nounService.getObject(noun, order));
        model.addAttribute("Subject_of", nounService.getSubject(noun, order));
        model.addAttribute("modifier", nounService.getModifier(noun, order));
        model.addAttribute("modifies", nounService.getModifies(noun, order));
        model.addAttribute("measure", nounService.getMeasures(noun, order));
        model.addAttribute("composites", nounService.getComposites(noun));
        List<And> ands = nounService.getCachedAnd(noun);
        if(ands != null && ands.size() != 0) model.addAttribute("and", ands);
        model.addAttribute("word", noun);
        model.addAttribute("order", order);
        return "noun";
    }

    @RequestMapping("and")
    @ResponseBody
    public String get() {
        String[] words = {"发展","规定","月","群众","人民","民族","学生","行业","模式","政治","数据","王"};
        for (String word : words) {
            List<And> ands = nounService.getAnd(word);
            for(And and : ands) {
                and.setStatement("select w2.w_id, w.w_id, count(*) as freq, w.word from words_pos_base w, inv_w i1, inv_w i2, inv_w i3, words_pos_base w2 where w2.word="
                + word
                + " and i3.w_id=w2.w_id and i2.w_id=105 and i2.s_id=i3.s_id and i1.s_id=i2.s_id and i2.pos=i3.pos+1 and (i1.pos=i2.pos+1) and i1.w_id=w.w_id and (w.pos=\"NN\" or w.pos=\"NR\")\n group by w.w_id order by freq desc limit 20;");
                nounService.add(and);
            }
            System.out.println(word);
        }
        return "success all!";
    }
}
