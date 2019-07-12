package com.wangchi.firstspringboot.bms.controllers;


import com.wangchi.firstspringboot.bms.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
    此控制器处理超时罚款处理
 */
@RestController
@RequestMapping("/payIn")
public class TimeController {
    @Autowired
    private TimeService timeService;
    @PostMapping("/{userId}/{bookNumber}")
    public String  subMoney(@PathVariable("userId") int userId, @PathVariable("bookNumber") int bookNumber){
        if(timeService.subMoney(userId,bookNumber))
            return "扣款成功";
        else return "余额不足，扣款失败";
    }

}
