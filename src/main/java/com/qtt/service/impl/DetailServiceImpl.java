package com.qtt.service.impl;

import com.qtt.dao.DetailDao;
import com.qtt.service.DetailService;
import com.qtt.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project name：qutingting
 * Class name：DetailServiceImpl
 * description：TODO
 * date：2019/12/20 12:04
 *
 * @author ：XC
 */
@Service
public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailDao detailDao;

    @Override
    public R list(int id) {
        return R.Ok(detailDao.list(id));
    }
}
