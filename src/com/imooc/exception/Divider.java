package com.imooc.exception;


/**
 * @author lesliecao
 *
 */
public class Divider {
	public static void main(String[] args) {
		Divider divider = new Divider();
		int result = divider.test();
		System.out.println("Test方法输出完毕，result的值是："+result);
		int result2 = divider.test2();
		System.out.println("Test2执行完毕");
	}
	/**
	 * divider(除数)
	 * result(结果)
	 * try-catch捕获while循环
	 * 每次循环，divider减1一，result=result+100/divider
	 * 如果：捕获异常，打印输出“抛出异常了！！！”，返回-1
	 * 否则：返回result
	 */
	public int test() {
		int divider = 10;
		int result = 100;
		try {
			while(divider>-1) {
				divider--;
				result = result + 100/divider;
			};
			return result;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("抛出异常了！！！");
			return -2;
		}
	}
	
	/**
	 * divider(除数)
	 * result(结果)
	 * try-catch捕获while循环
	 * 每次循环，divider减1一，result=result+100/divider
	 * 如果：捕获异常，打印输出“抛出异常了！！！”，返回 999
	 * 否则：返回result
	 * finally： 打印输出“这是finally！！！哈哈!”,同时打印输出result的值
	 */
	public int test2() {
		int divider = 10;
		int result = 100;
		try {
			while(divider>-1) {
				divider--;
				result = result + 100/divider;
			};
			return result;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("抛出异常了！！！");
			return result=999;
		}finally {
			System.out.println("这是finally！！！哈哈! Result的值是："+result);
		}
	}
}
