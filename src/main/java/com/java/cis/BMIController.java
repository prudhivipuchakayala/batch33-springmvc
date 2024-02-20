package com.java.cis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BMIController {

    @GetMapping("/bmi")
    public String showInputForm() {
        return "inputForm";
    }

    @PostMapping("/bmi")
    public String handleBMIRequest(@RequestParam("weight") double weight,
                                   @RequestParam("height") double height,
                                   Model model) {
        double bmi = calculateBMI(weight, height);
        model.addAttribute("bmi", bmi);
        return "bmiResult";
    }

    private double calculateBMI(double weight, double height) {
        return (weight / (height * height)) * 703;
    }
}
