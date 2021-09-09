package com.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dto.StudentDto;

public interface Idao {
	public abstract HashMap<String,ArrayList<StudentDto>> viewAllByDepartments() throws SQLException;
	public abstract ArrayList<StudentDto> viewStudentByDepartment(String deptname) throws SQLException;
}

