package com.qtt.service;

import com.qtt.entity.Subject;
import com.qtt.vo.R;

/**
 * Project name：qutingting
 * Class name：SubjectService
 * description：TODO
 * date：2019/12/20 9:36
 *
 * @author ：XC
 */
public interface SubjectService {
    R list();
    R insert(Subject subject);
    R look(int id);
    R vote(int id);
    R selectByPrimaryKey(int id);
}
