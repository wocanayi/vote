package com.qtt.service.impl;

import com.qtt.dao.OptionDao;
import com.qtt.entity.Options;
import com.qtt.service.OptionService;
import com.qtt.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project name：qutingting
 * Class name：OptionServiceImpl
 * description：TODO
 * date：2019/12/20 13:30
 *
 * @author ：XC
 */
@Service
public class OptionServiceImpl implements OptionService {
    @Autowired
    private OptionDao optionDao;

    @Override
    public R insert(Options options) {
        return R.Ok(optionDao.insert(options));
    }

    @Override
    public R vote(int id) {
        return R.Ok(optionDao.vote(id));
    }
}
