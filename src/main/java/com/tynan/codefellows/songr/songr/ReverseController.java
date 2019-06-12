package com.tynan.codefellows.songr.songr;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    @GetMapping("/reverse")
    public String reverser(@RequestParam String sentence) {
        String[] reverseArray = sentence.split(" ");

        StringBuilder reverseString = new StringBuilder(reverseArray[reverseArray.length - 1]);
        for (int i = 1 ; i < reverseArray.length  ; i++) {
            reverseString.append(" ").append(reverseArray[reverseArray.length - 1 - i]);
        }
        return reverseString.toString();
    }
}
