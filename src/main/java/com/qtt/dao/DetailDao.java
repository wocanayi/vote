package com.qtt.dao;

import com.qtt.vo.Detail;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Project name：qutingting
 * Class name：DetailDao
 * description：TODO
 * date：2019/12/20 11:58
 *
 * @author ：XC
 */
@Repository
public interface DetailDao {
    List<Detail> list(int id);
    // Detail list(int id);
}
