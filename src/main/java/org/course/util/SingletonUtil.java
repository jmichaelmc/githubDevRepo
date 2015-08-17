package org.course.util;

public class SingletonUtil {
	
	private SingletonUtil(){}
	
	private static SingletonUtil singletonUtil;
	private String testString;
	private int testInt;
	
	public static SingletonUtil getSingletonUtil() {
		return singletonUtil;
	}
	public static void setSingletonUtil(SingletonUtil singletonUtil) {
		SingletonUtil.singletonUtil = singletonUtil;
	}
	public String getTestString() {
		return testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}
	public int getTestInt() {
		return testInt;
	}
	public void setTestInt(int testInt) {
		this.testInt = testInt;
	}
	
	
}
