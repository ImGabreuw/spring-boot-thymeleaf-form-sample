package me.gabreuw.spring_boot_thymeleaf_form_sample.controller;

import lombok.extern.log4j.Log4j2;
import me.gabreuw.spring_boot_thymeleaf_form_sample.domain.User;
import me.gabreuw.spring_boot_thymeleaf_form_sample.domain.enums.ProfessionType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/register")
@Log4j2
public class UserController {

    @GetMapping
    public String showForm(Model model) {
        User user = new User();

        model.addAttribute("user", user);
        model.addAttribute("professionList", ProfessionType.getAllProfessionNames());

        return "register_form";
    }

    @PostMapping
    public String submitForm(
            @ModelAttribute(name = "user") User user
    ) {
        log.info(user);

        return "register_success";
    }

}
