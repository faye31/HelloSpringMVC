package com.springmvc.dao;

import com.springmvc.model.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(byte[] uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(byte[] uid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}