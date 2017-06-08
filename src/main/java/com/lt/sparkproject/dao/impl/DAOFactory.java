package com.lt.sparkproject.dao.impl;

import com.lt.sparkproject.dao.ITaskDAO;
import com.lt.sparkproject.dao.TaskDAOImpl;

/**
 * DAO工厂类
 * @author Administrator
 *
 */
public class DAOFactory {

	/**
	 * 获取任务管理DAO
	 * @return DAO
	 */
	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}
	
}
