package com.lc.test;

public class TestDemo {

	public TestDemo() {
		
	}

	public static void main(String[] args) {
		int[] a = new int[5];//����Ϊ5������
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*10);//����1-10�ڵ������
			for (int j = 0; j < i; j++) {
				//�ж��Ƿ��ظ�
				if (a[i]==a[j]) {
					a[i]= (int) (Math.random()*10);
					j=-1;
				}					
			}
			System.out.print(a[i]+" ");
		}

	}

}
