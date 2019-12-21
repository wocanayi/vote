package com.qtt.service;

import com.qtt.entity.Options;
import com.qtt.vo.R;

/**
 * Project name：qutingting
 * Class name：OptionService
 * description：TODO
 * date：2019/12/20 13:30
 *
 * @author ：XC
 */

public interface OptionService {
    R insert(Options options);
    R vote(int id);
}
