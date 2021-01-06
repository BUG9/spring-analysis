package com.zhc;


public class ItBean {

	private TestBean testBean;

	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}

	/**
	 * 构造函数
	 */
	public ItBean(){
		System.out.println("ItBean 构造器...");
	}
}
