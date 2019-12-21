package com.qtt.controller;

import com.qtt.service.OptionService;
import com.qtt.service.SubjectService;
import com.qtt.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name：qutingting
 * Class name：OptionController
 * description：TODO
 * date：2019/12/20 15:08
 *
 * @author ：XC
 */
@RestController
public class OptionController {
    @Autowired
    private OptionService optionService;

    @Autowired
    private SubjectService subjectService;

    /**
     * 选择某个选项
     * @param oid 选项的id
     * @param id 主题的id
     * @return
     */
    @RequestMapping("/vote/vote")
    public R vote(int oid, int id) {
        optionService.vote(oid);
        subjectService.vote(id);
        return R.Ok();
    }
}
