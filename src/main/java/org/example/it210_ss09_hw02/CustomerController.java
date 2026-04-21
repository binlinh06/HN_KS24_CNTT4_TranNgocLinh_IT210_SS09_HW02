package org.example.it210_ss09_hw02;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @GetMapping("/home")
    public String homepage(
            @CookieValue(value = "guest_name", defaultValue = "Khách lạ") String guestName,
            Model model
    ) {

        model.addAttribute("msg", "Chào mừng " + guestName);

        return "home-page";
    }
}
