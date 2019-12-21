package com.qtt.controller;

import com.qtt.entity.Options;
import com.qtt.entity.Subject;
import com.qtt.service.OptionService;
import com.qtt.service.SubjectService;
import com.qtt.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Project name：qutingting
 * Class name：SubjectController
 * description：TODO
 * date：2019/12/20 10:02
 *
 * @author ：XC
 */
@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @Autowired
    private OptionService optionService;

    /**
     * 所有的主题
     * @return
     */
    @GetMapping("/vote/list")
    public R list() {
        return subjectService.list();
    }

    /**
     * 添加主题和选项
     * @param subject
     * @param options
     * @return
     */
    @PostMapping("/vote/insert")
    public R insert(Subject subject, Options options) {
        subjectService.insert(subject);
        options.setSid(subject.getId());
        optionService.insert(options);
        return R.Ok();
    }

    /**
     * 浏览
     * @param id
     * @return
     */
    @PostMapping("/vote/look/{id}")
    public R look(@PathVariable int id) {
        return subjectService.look(id);
    }

    /**
     * 详情页的头部信息
     * @param id
     * @return
     */
    @RequestMapping("/vote/title")
    public R title(int id) {
        return subjectService.selectByPrimaryKey(id);
    }
}
