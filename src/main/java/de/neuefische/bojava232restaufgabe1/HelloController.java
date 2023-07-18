package de.neuefische.bojava232restaufgabe1;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello(@RequestParam String name) {
        return "Hello " + name;
    }

    @PostMapping("/strlen")
    public int getStrlen(@RequestBody StrlenRequest strlenRequest) {
        return strlenRequest.getText().length();
    }
}
