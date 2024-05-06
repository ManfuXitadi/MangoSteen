package com.mangosteen.app.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Hello Controller
 */
@RestController
public class HelloController {

    /**
     * say hello api
     * @param name name
     * @param id specific id
     * @return say hello
     */
//    @RequestMapping(path = "v1.0/hello/{name}/{id}", method = RequestMethod.GET)
    @GetMapping(path = "v1.0/hello/{name}/{id}")
    public String sayHello(@PathVariable("name") String name, @PathVariable("id") int id){
        return String.format("Hello, %s 今年 %d 岁" , name,id);
    }

    @GetMapping(path = "v2.0/greeting")
    public String myStatus(@RequestParam("name") String name,

                            @RequestParam("status") String status){
        return String.format("%s 今天的状态时 %s", name, status);
    }
}
