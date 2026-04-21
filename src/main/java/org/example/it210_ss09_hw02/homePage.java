package org.example.it210_ss09_hw02;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@GetMapping("/home")
public String homePage(
        @CookieValue(value = "guest_name", defaultValue = "Khách lạ") String guestName,
        Model model) {

    if ("Khách lạ".equals(guestName)) {
        model.addAttribute("msg", "Chào khách lạ!");
    } else {
        model.addAttribute("msg", "Chào mừng " + guestName + " trở lại!");
    }

    return "home-page";
}