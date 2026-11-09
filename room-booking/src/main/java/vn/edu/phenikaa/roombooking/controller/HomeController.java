
package vn.edu.phenikaa.roombooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute(
                "title",
                "Hệ thống quản lý đặt phòng học nhóm"
        );

        model.addAttribute(
                "message",
                "Chào mừng bạn đến với website Nhóm 05!"
        );

        return "index";
    }
}
