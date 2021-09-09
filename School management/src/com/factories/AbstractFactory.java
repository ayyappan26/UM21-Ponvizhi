package com.factories;

import com.dao.Idao;

public abstract class AbstractFactory {
	public abstract Idao getDao();
	public static AbstractFactory getFactory(int choice) {
		AbstractFactory factory = null;
		switch(choice) {
		case 1:
			factory = new StudentOracleFactory();
			break;
		}
		return factory;
	}
	
}
