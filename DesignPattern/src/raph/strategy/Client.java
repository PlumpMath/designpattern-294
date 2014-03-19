package raph.strategy;

import java.util.Scanner;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个运算数");
		int numberA=sc.nextInt();
		System.out.println("请输入第二个运算数");
		int numberB=sc.nextInt();
		System.out.println("请输入运算符：+-*/");
		String operate=sc.next();
		OperationContext oc=new OperationContext(operate);
		System.out.println("运算结果："+oc.getOprateResult(numberA, numberB));

	}

}
