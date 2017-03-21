package xyz.javista.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Created by Luke on 2017-01-20.
 */
@RestController
public class ExampleController {

    @RequestMapping("/date")
    public String getDate(){
        return LocalDate.now().toString();
    }
}
