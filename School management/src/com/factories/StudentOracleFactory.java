package com.factories;

import com.dao.Idao;
import com.dao.StudentOracleDao;

public class StudentOracleFactory extends AbstractFactory {
	public Idao getDao() {
		return new StudentOracleDao() ;
	}
}
