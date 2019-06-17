package com.zoumf77;

public class BasicTypeDemo {
	
	public static void main(String[] args){
		boolean isTrue=false;
		byte b=127;
		char c='c';
		short age=50;
		//易读格式
		int items=2_147_483_647;
		//长整型
		long ms=System.currentTimeMillis();
		
		System.out.println("items="+items);
		System.out.println("ms="+ms);
		
		
		
		float f=0.03f;
		double d=100.00d;
		
		Boolean isFlase=new Boolean(isTrue);
		
		//isTrue是基本数据类型，这个赋值是个什么过程
		Boolean isRight=isTrue; 
		
		Byte b1=new Byte(b);
		Byte bByte=127;
		
		//bByte是个对象实例，这个赋值是个什么过程
		b=bByte; //这又是什么过程？
		
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);

		//==和equal运算出来是真是假
		System.out.println("i1==i2 is "+(i1==i2));
		System.out.println("i1.equal(i2)"+(i1.equals(i2)));
		
		//常量池
		Integer i3=100;
		Integer i4=100;
		
		//==和equal运算出来是真是假,为什么？
		System.out.println("i3==i4 is "+(i3==i4));
		System.out.println("i3.equal(i4)"+(i3.equals(i4)));
		
		
		Integer i5=1000;
		Integer i6=1000;
		
		//==和equal运算出来是真是假,为什么？
		System.out.println("i5==i6 is "+(i5==i6));
		System.out.println("i5.equal(i6)"+(i5.equals(i6)));
		
		
		if (i5 instanceof Integer)
			System.out.println("i5 is a Integer");
		
		
		//*数字默认int和double
		//float f1=1.9;
		//注意Java 不能隐式执行向下转型，因为这会使得精度降低。
		double d1=0.1;
		short ss=1;
		//ss= (ss+1);//不可执行
		ss+=1;//可执行
	
		Long id;
		
	}

}
