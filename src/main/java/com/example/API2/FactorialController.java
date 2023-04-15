package com.example.API2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/valore")
public class FactorialController {

    @GetMapping("/{n}")
    public int factorialController(@PathVariable int n){
        int x = n;
        for(int i = n-1; i > 0; i--){
            x = x * i;
        }
        return x;
    }
}
