package com.example.spring_mysql.Controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PingController {


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String  sayHell0(){
        return "Hello I am live !!!!!";
    }

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @PostMapping("ping")
    public String pingWithParams(@RequestParam String message, @RequestParam(required = false) String name){
        return String.format("recieved the following message: %s ", message + (name != null ? " from "+ name: ""));
    }

    //get /users => return all users
    //get /user/{id} => return user with id
    //patch or put on users/{id} => update user with id
    //delete user/{id} => delete user with id
}
