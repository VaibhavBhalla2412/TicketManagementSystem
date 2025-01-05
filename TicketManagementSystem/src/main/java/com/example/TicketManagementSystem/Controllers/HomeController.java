package com.example.TicketManagementSystem.Controllers;

import com.example.TicketManagementSystem.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class HomeController {

        @GetMapping("/")
        public String home(Model model) {
            // Generate hall options based on the constant
            List<Integer> halls = IntStream.rangeClosed(1, Constants.maxHalls)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("halls", halls);
            model.addAttribute("minDate", LocalDate.now().toString());
            model.addAttribute("greeting", "hello,");
            return "index";
        }


}
