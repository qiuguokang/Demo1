package com.qiu.demo;
/**
 * ���α���
 * ��1����������
 * ��2��������ֵ
 * ��3����������
 */
public class Demo1 {
/**
 * ��1��Java�У����õ����ͱ���ͨ���ؼ��֡�int�������塣
 * ��2���¶�������ͱ��������и���������
 * ��3����������ֵͨ����ֵ���š�=������ɡ�
 */
	public void test1(){
/**
 * (1)�����������α���a,b.
 * (2)Ȼ��ֱ��a��b��ֵ10��20.
 * (3)�����a+b�ĺͣ�Ȼ��Ѻ͵�ֵ��c������.
 * (4)���c��ֵ 		
 */

		int a = 10 ;
		int b = 20 ;
		int c = a + b;
		System.out.println("c="+c);

	}
	//��������"(ֻ���壬����ֵ)
	
	int a;
	int b;
	int c;
	
	public void test2(){
		
	 //��ֵǰ�������
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		
        //������ֵ
		a = 10;
		b = 20;
		c = a + b;
        //��ֵ���������
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		
	}
}
