package com.CPP.entity;

import org.junit.Test;

import com.CPP.entity.Hello;

/**
 * hello类测试  注释要求不高，因为是自己看的
 * @author XJJ
 *
 */
public class HelloTest {
	/**
	 * 测试say方法
	 */
	Hello hello = new Hello();
	
	@Test
	public void say(){		
		//调用say方法
		hello.say("小仙女");
	}
	
	/**
	 * 测试out方法
	 */
	@Test
	public void out(){
		String str = hello.out();
		System.out.println(str);
	}
}
