package com.CPP.entity;

import org.junit.Test;

import com.CPP.entity.Hello;

/**
 * hello�����  ע��Ҫ�󲻸ߣ���Ϊ���Լ�����
 * @author XJJ
 *
 */
public class HelloTest {
	/**
	 * ����say����
	 */
	Hello hello = new Hello();
	
	@Test
	public void say(){		
		//����say����
		hello.say("С��Ů");
	}
	
	/**
	 * ����out����
	 */
	@Test
	public void out(){
		String str = hello.out();
		System.out.println(str);
	}
}
