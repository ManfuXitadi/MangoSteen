package com.mangosteen.app.controller;

import com.mangosteen.app.model.dao.UserInfo;
import lombok.val;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

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

    @GetMapping("v2.1/hello")
    public UserInfo testModel(){
         val userinfo = UserInfo.builder()
                 .updateTime(LocalDateTime.now())
                 .username("test")
                 .password("123456")
                 .createTime(LocalDateTime.now())
                 .id(1L)
                                .build();
        return userinfo;
    }
}
