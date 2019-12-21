package com.qtt.controller;

import com.qtt.service.DetailService;
import com.qtt.vo.Detail;
import com.qtt.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name：qutingting
 * Class name：DetailController
 * description：TODO
 * date：2019/12/20 12:05
 *
 * @author ：XC
 */
@RestController
public class DetailController {

    @Autowired
    private DetailService detailService;

    /**
     * 主题投票详情
     * @param id
     * @return
     */
    @GetMapping("/vote/detail")
    public R list(int id) {
        return R.Ok(detailService.list(id));
    }
}
