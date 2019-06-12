package com.tynan.codefellows.songr.songr;

import org.springframework.web.bind.annotation.*;


@RestController
public class CapitalizeController {

    @GetMapping("/capitalize/{string}")
    public String capitalize(@PathVariable String string) {
        return string.toUpperCase();
    }
}
