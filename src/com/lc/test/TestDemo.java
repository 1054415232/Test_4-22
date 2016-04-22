package com.lc.test;

public class TestDemo {

	public TestDemo() {
		
	}

	public static void main(String[] args) {
		int[] a = new int[5];//长度为5的数组
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*10);//生成1-10内的随机数
			for (int j = 0; j < i; j++) {
				//判断是否重复
				if (a[i]==a[j]) {
					a[i]= (int) (Math.random()*10);
					j=-1;
				}					
			}
			System.out.print(a[i]+" ");
		}

	}

}
