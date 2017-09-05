package com.imooc.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println("请输入您的年龄：");
			Scanner input = new Scanner(System.in);
			int age = input.nextInt();
			System.out.println("十年后你"+(age+10)+"岁");
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("你应该输入整数");
		}
		System.out.println("程序结束了！！");
	}
}
