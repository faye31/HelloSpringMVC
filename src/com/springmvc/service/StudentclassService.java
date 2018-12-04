/**
 * File Name: StudentclassService.java
 * Project Name: HelloSpringMVC
 * Author: faye31
 * Create Date: 2018年12月4日 下午3:07:57
 * Copyright (c) 2018, All Rights Reserved. 
**/

package com.springmvc.service;

import com.springmvc.model.Studentclass;

public interface StudentclassService {
	
	Studentclass selectByPrimaryKey(int classid);

	int insert(Studentclass record);
	
	int update(Studentclass record);
	
	int delete(int classid);
	
}

