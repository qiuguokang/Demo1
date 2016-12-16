package com.qiu.demo;
/**
 * 整形变量
 * （1）变量定义
 * （2）变量赋值
 * （3）变量访问
 */
public class Demo1 {
/**
 * （1）Java中，常用的整型变量通过关键字“int”来定义。
 * （2）新定义的整型变量必须有个变量名。
 * （3）给变量赋值通过赋值符号“=”来完成。
 */
	public void test1(){
/**
 * (1)定义两个整形变量a,b.
 * (2)然后分别给a，b赋值10，20.
 * (3)计算出a+b的和，然后把和的值用c来接收.
 * (4)输出c的值 		
 */

		int a = 10 ;
		int b = 20 ;
		int c = a + b;
		System.out.println("c="+c);

	}
	//变量声明"(只定义，不赋值)
	
	int a;
	int b;
	int c;
	
	public void test2(){
		
	 //赋值前输出变量
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		
        //变量赋值
		a = 10;
		b = 20;
		c = a + b;
        //赋值后输出变量
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		
	}
}
