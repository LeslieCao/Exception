package com.imooc.exception;

/**
 * test1():抛出“喝大了”异常
 * test2():调用test1()，捕获“喝大了异常”，并且包装成运行时异常，继续抛出
 * main方法中，调用test2(),尝试捕获test2()方法抛出的异常
 */
public class ChainTest {

	public static void main(String[] args) {
		ChainTest cTest = new ChainTest();
		try {
			cTest.test2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void test1() throws DrunkException{
		throw new DrunkException("喝酒不开车");
	}
	public void test2() {
		ChainTest test = new ChainTest();
		try {
			test.test1();
		} catch (DrunkException e) {
			RuntimeException rException = new RuntimeException("司机一滴酒，亲人两行泪！");
			rException.initCause(e);
			throw rException;
		}
	}
}
