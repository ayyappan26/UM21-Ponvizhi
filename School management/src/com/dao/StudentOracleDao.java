package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.data.DBConnection;
import com.dto.StudentDto;

public class StudentOracleDao implements Idao{
	public HashMap<Integer,StudentDto> viewAllStudents() throws Exception{
		HashMap<Integer,StudentDto> studMap = new HashMap<Integer,StudentDto>();
		
		StudentDto sdto = null;
		Connection con = DBConnection.getConnection();
		String query = "SELECT * FROM student";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		int rollno;
		
		while(rs.next()) {
			sdto = new StudentDto();
			rollno = rs.getInt(1);
			sdto.setRollno(rs.getInt(1));
			sdto.setName(rs.getString(2));
			sdto.setCourse(rs.getString(3));
			sdto.setYear(rs.getInt(4));
			sdto.setPercentage(rs.getFloat(5));	
			
			studMap.put(rollno,sdto);
		}
		return(studMap);		
	}
	
	public HashMap<Integer,StudentDto> viewStudent(int id) throws Exception{
		HashMap<Integer,StudentDto> studMap = new HashMap<Integer,StudentDto>();
		
		StudentDto sdto = new StudentDto();
		Connection con = DBConnection.getConnection();
		String query = "SELECT * FROM student where rollno =" + id;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		sdto.setRollno(rs.getInt(1));
		sdto.setName(rs.getString(2));
		sdto.setCourse(rs.getString(3));
		sdto.setYear(rs.getInt(4));
		sdto.setPercentage(rs.getFloat(5));
		
		studMap.put(id,sdto);
		return(studMap);		
	}
	public void printStudentDetails(HashMap<Integer,StudentDto> h1) {
		
		for(Integer key : h1.keySet() ) {
			System.out.println("Roll no       : "+ key);
			System.out.println("Student Name  : "+h1.get(key).getName());
			System.out.println("Course        : "+h1.get(key).getCourse());
			System.out.println("Year          : "+h1.get(key).getYear());
			System.out.println("Percentage    : "+h1.get(key).getPercentage());
			System.out.println("___________________");
			
		}
	}

	
	public HashMap<String, ArrayList<StudentDto>> viewAllByDepartments() throws Exception {
		HashMap<String,ArrayList<StudentDto>> deptMap = new HashMap<>();
		ArrayList<String> deptList = new ArrayList<>();
		ArrayList<StudentDto> studDetail = new ArrayList<>();
		String query = "SELECT DISTINCT course from student";
		StudentDto sdto = null;
		
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String course;
		
		while(rs.next()) {
			deptList.add(rs.getString(1));
		}
		for(String dept : deptList) {
			studDetail = viewStudentByDepartment(dept);
			deptMap.put(dept, studDetail);
		}
		return(deptMap);
	}

	
	public ArrayList<StudentDto> viewStudentByDepartment(String deptname) throws Exception {
		ArrayList<StudentDto> deptList = new ArrayList<StudentDto>();
		StudentDto sdto = null;
		Connection con = DBConnection.getConnection();
		String query = "SELECT * FROM student WHERE course=?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, deptname);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			sdto = new StudentDto();
			sdto.setRollno(rs.getInt(1));
			sdto.setName(rs.getString(2));
			sdto.setCourse(rs.getString(3));
			sdto.setYear(rs.getInt(4));
			sdto.setPercentage(rs.getFloat(5));
			
			deptList.add(sdto);
		}
		return deptList;
	}
}
