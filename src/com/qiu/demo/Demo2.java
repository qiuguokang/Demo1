package com.qiu.demo;
 /**
  * 数字型类型
  * 数字的类型分为整数型和浮点型
  * 整数型中又分为:byte(字节型 ，1个字节)，short(短整型，2个字节)，
  *           int(整形，4个字节)，long(长整形，8个字节)；
  * 浮点型中则分为:float(单精度浮点型，4个字节)，
  *           double(双精度浮点型，8个字节)
  */

public class Demo2 {
    /**
	 * byte(字节型整数型)
	 * 变量长度：1个字节（8位）
	 * 取值范围：-2^7——2^7-1; -128——127;共有2^8(256)个值。
	 */
	public void testByte(){
		//定义变量 a,b
		byte a = 1;
		byte b = -1;
		//输出变量 a,b
		System.out.println(a);
		System.out.println(b);
		
		//研究short变量数值的范围
	//	byte c1 = 256;
		byte c2 = -128;
	//	byte c3 = 128;
		byte c4 = 127;
		System.out.println(c2);
		System.out.println(c4);
	    /**
		 * byte变量占一个字节，一个字节是8个二进制位，一个二进制位中能存在
		 * 两个中状态0和1
		 * 8个二进制位能存2^8个状态，2^8是256；
		 * 所以一个字节能存256个数
		 * 正负数各占一半，0占正数位
		 * 所以byte的取值范围是：-128_127之间；
		 */
	}
	
	/**
	 * short(短整型)
	 * 变量长度   2个字节（16位）
	 * 取值范围 -2^15_2^15-1(-32768_32767)
	 */
	public void testShort(){
		//定义变量
		short a = 100;
		short b = -100;
		//访问变量
		System.out.println(a);
		System.out.println(b);
		//研究short型的取值范围
	//	short c1 = 65536;
		short c2 = -32768;
	//	short c3 = 32768;
		short c4 = 32767;
		System.out.println(c2);
		System.out.println(c4);
		/**
		 * short变量占2个字节， 2个字节是16个二进制位，一个二进制位能存在两个中状态的0和1；
		 * 16个二进制位能存2^16个状态，2^16是65536，
		 * 正负数各占一半，0占正数位，所以是 -2^15_2^15-1(-32768_32767);
		 */
	}
    /**
     * int(整形)
     * 变量长度 4个字节（32位）
     * 取值范围-2^31_2^31-1(-2147483648_2147483647)
     */
	public void testInt(){
		//定义变量 a,b;
		int a = 2000;
		int b = -2000;
		//打印变量a,b;
		System.out.println(a);
		System.out.println(b);
		//研究int变量数值的范围
	//	int c1 = 4294967296;
		int c2 = -2147483648;
   //	int c3 = 2147483648;
		int c4 = 2147483647;
		
		System.out.println(c2);
		System.out.println(c4);
	}
	 /**
	  * int变量占4个字节，4个字节是32个二进制位，一个二进制位中能存在两个中状态的0和1；
	  * 32个二进制位能存2^32个状态，2^32是4294967296；
	  * 正负数各占一半，0占正数位，所以范围是-2^31_2^31(-2147483648_2147483647);
	  */
	
	/**
	 * long(长整型)
	 * 变量长度   8个字节
	 * 取值范围  —2^63_2^63-1;
	 */
	public void testLong(){
		//定义变量
		long a = 10000000l;
		long b = 1000000000000000000l;
		//访问变量
		System.out.println(a);
		System.out.println(b);
	}

}
