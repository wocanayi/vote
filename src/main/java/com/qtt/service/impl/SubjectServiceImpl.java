package com.qtt.service.impl;

import com.qtt.dao.SubjectDao;
import com.qtt.entity.Subject;
import com.qtt.service.SubjectService;
import com.qtt.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project name：qutingting
 * Class name：SubjectServiceImpl
 * description：TODO
 * date：2019/12/20 9:37
 *
 * @author ：XC
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDao subjectDao;

    @Override
    public R list() {
        return R.Ok(subjectDao.list());
    }

    @Override
    public R insert(Subject subject) {
        int insert = subjectDao.insert(subject);
        if (insert > 0) {
            return R.Ok("插入成功");
        } else {
            return R.fail("插入失败");
        }
    }

    @Override
    public R look(int id) {
        return R.Ok(subjectDao.look(id));
    }

    @Override
    public R vote(int id) {
        return R.Ok(subjectDao.vote(id));
    }

    @Override
    public R selectByPrimaryKey(int id) {
        return R.Ok(subjectDao.selectByPrimaryKey(id));
    }
}
