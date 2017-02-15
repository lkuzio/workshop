package xyz.javista.web.controller;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.javista.Application;

import java.time.LocalDate;

/**
 * Created by Luke on 2017-01-20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ExampleControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Ignore
    @Test
    public void exampleTest(){
        String response = restTemplate.getForObject(Application.CONTEXT+"/date",String.class);
        assert response.equals(LocalDate.now().toString());
    }
}
