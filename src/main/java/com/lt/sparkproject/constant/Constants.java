package com.lt.sparkproject.constant;

/**
 * 常量接口
 * @author Administrator
 *
 */
public interface Constants {

	/**
	 * 项目配置相关
	 */
	String JDBC_DRIVER = "jdbc.driver";
	String JDBC_DATASOURCE_SIZE = "jdbc.datasource.size";
	String JDBC_URL = "jdbc.url";
	String JDBC_USER = "jdbc.user";
	String JDBC_PASSWORD = "jdbc.password";
	String SPARK_LOCAL = "spark.local";
	
	/**
	 * spark作业相关
	 */
	String SPARK_APP_NAME_SESSION = "UserVisitSessionAnalyzeSpark";
	
	/**
	 * 任务相关常量
	 */
	String PARAM_START_DATE = "startDate";
	String PARAM_END_DATE = "endDate";
	
	String FIELD_SESSION_ID = "sessionid";
	String FIELD_SEARCH_KEYWORDS = "searchKeywords";
	String FIELD_CLICK_CATEGORY_IDS = "clickCategoryIds";
	String FIELD_AGE = "age";
	String FIELD_PROFESSIONAL = "perfessional";
	String FIELD_CITY = "city";
	String FIELD_SEX = "sex";
	
	
	String PARAM_START_AGE = "startAge";
	String PARAM_END_AGE = "endAge";
	String PARAM_PROFESSIONALS = "perfessionals";
	String PARAM_CITIES = "cityes";
	String PARAM_SEX = "sex";
	String PARAM_KEYWORDS = "keywords";
	String PARAM_CATEGORY_IDS = "categoryIds";
	
	
	String SESSION_COUNT = "count";
	String TIME_PERIOD_1s_3s = "1s_3s";
	String TIME_PERIOD_4s_6s = "4s_6s";
	String TIME_PERIOD_7s_9s = "7s_9s";
	String TIME_PERIOD_10s_30s = "10s_30s";
	String TIME_PERIOD_30s_60s = "10s_30s";
	String TIME_PERIOD_1m_3m = "1m_3m";
	String TIME_PERIOD_3m_10m = "3m_10m";
	String TIME_PERIOD_10m_30m = "10m_30m";
	String TIME_PERIOD_30m = "30m";
	String STEP_PERIOD_1_3 = "1_3";
	String STEP_PERIOD_4_6 = "4_6";
	String STEP_PERIOD_7_9 = "7_9";
	String STEP_PERIOD_10_30 = "10_30";
	String STEP_PERIOD_30_60 = "30_60";
	String STEP_PERIOD_60 = "60";
	
	String FIELD_VISIT_LENGTH = "visitLength";
	String FIELD_STEP_LENGTH = "stepLength";
	
}
