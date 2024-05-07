package com.example.springboot_practice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class myFirstAPI {
    @RequestMapping("/Hello")


    public String sayHello(){
        return "Hello World!";
    }

    @RequestMapping("/Hello/{name}")
    public String sayhelloName(@PathVariable("name") String name){
        return "Hello "+name+"!";
    }
    @RequestMapping("/Hello/{name}/{times}")
    public String sayHelloNameTime(@PathVariable("name") String name,
                                   @PathVariable("times") Integer times){
        String str =" ";
        for(int i=0;i<times;i++){
            str += "Hello "+name+" "+(i+1)+"!";
            str += "<br>";
        }
        return str;


    }
}