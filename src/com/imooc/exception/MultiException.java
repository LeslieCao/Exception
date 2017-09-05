package com.imooc.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.AuthenticationException;

public class MultiException {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("请输入你的第一个整数：");
			int one = input.nextInt();
			System.out.println("请输入你的第二个整数");
			int two = input.nextInt();
			System.out.println("两个输相除等于："+(one/two));
		}
		catch (InputMismatchException e) {
			System.out.println("请输入整数！！！");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("除数不能为零！！！");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("不知名异常");
		}
}
}
