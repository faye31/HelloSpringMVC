/**
 * File Name: StudentclassServiceImpl.java
 * Project Name: HelloSpringMVC
 * Author: faye31
 * Create Date: 2018年12月4日 下午4:07:08
 * Copyright (c) 2018, All Rights Reserved. 
**/

package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.StudentclassMapper;
import com.springmvc.model.Studentclass;

@Service("studentclassService")
public class StudentclassServiceImpl implements StudentclassService {
	
	@Autowired
	private StudentclassMapper studentclassmapper;

	@Override
	public Studentclass selectByPrimaryKey(int classid) {
		return studentclassmapper.selectByPrimaryKey(classid);
	}

	@Override
	public int insert(Studentclass record) {
		return studentclassmapper.insert(record);
	}

	@Override
	public int update(Studentclass record) {
		return studentclassmapper.updateByPrimaryKey(record);
	}

	@Override
	public int delete(int classid) {
		return studentclassmapper.deleteByPrimaryKey(classid);
	}

}

