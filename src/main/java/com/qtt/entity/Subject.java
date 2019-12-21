package com.qtt.entity;

import lombok.Data;

/**
 * Project name：qutingting
 * Class name：Subject
 * description：TODO
 * date：2019/12/20 9:34
 *
 * @author ：XC
 */
@Data
public class Subject {
    private int id;
    private String theme;
    private int votenum;
    private int seenum;
    private String createtime;
    private Options options;
}
