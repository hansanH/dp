package com.navtb.dp.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class IndexController {
    String wwww = "";

    @RequestMapping("/index")
    public String index(@RequestParam(value = "x",defaultValue = "") String x){
//        log.info(x);
//        String str ="test _ "+ x;
//        String xx = "xxx";
//        xx = null;
//        wwww+=str;
        return null;
    }
}
