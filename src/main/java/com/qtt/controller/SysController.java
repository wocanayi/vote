package com.qtt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project name：qutingting
 * Class name：SysController
 * description：TODO
 * date：2019/12/20 10:34
 *
 * @author ：XC
 */
@Controller
public class SysController {

    @RequestMapping("/subjects")
    public String subjects() {
        return "subjects";
    }

    @RequestMapping("/detail")
    public String detail() {
        return "detail";
    }
}
