package com.qtt.dao;

import com.qtt.entity.Options;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Project name：qutingting
 * Class name：OptionDao
 * description：TODO
 * date：2019/12/20 13:29
 *
 * @author ：XC
 */
@Repository
public interface OptionDao {
    int insert(Options options);
    int vote(int id);
}
