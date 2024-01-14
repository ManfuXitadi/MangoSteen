package com.MangoSteen.app.controller;


import org.springframework.web.bind.annotation.*;



import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class FirstController {
//
//    @Resource
//    private UserInfoMapper userInfoMapper;

    //用路径作为参数
    @RequestMapping(path = "say/hello/{sentence}/{id}", method = GET)
    public String saySentence(@PathVariable("sentence") String sentence, @PathVariable("id") int id){
        return String.format("Hello~ ,%s , %d", sentence, id);
    }

    //用？参数1 = 参数值1 & 参数2 = 参数值2 ……作为参数
    @GetMapping("saybye")
    public String sayBye(@RequestParam("name") String name ,
                         @RequestParam("age") int age){

        return String.format("Say Bye with %s  %d",name, age);
    }


}
