package com.qtt.dao;

import com.qtt.entity.Options;
import com.qtt.entity.Subject;
import com.qtt.vo.R;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Project name：qutingting
 * Class name：SubjectDao
 * description：TODO
 * date：2019/12/20 9:36
 *
 * @author ：XC
 */
@Repository
public interface SubjectDao {
    List<Subject> list();
    int insert(Subject subject);
    int look(int id);
    int vote(int id);
    Subject selectByPrimaryKey(int id);
}
