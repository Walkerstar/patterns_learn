package com.bjsxt.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * ���Զ��̻߳��������ִ�������ģʽ��Ч��
 * @author Administrator
 *
 */
public class Client03 {
	public static void main(String[] args) throws Exception {
		long start=System.currentTimeMillis();
		int threadNum=10;
		final CountDownLatch countDownLatch =new CountDownLatch(threadNum);
		
		for(int i=0;i<threadNum;i++) {
			new Thread(
					() -> {
						for(int i1 = 0; i1 <10000000; i1++) {
//								Object o=singletonDemo03.getInstance();
							Object o=singletonDemo05.INSTANCE;
						}
						countDownLatch.countDown();
					}) .start();
		}
		
		countDownLatch.await();//main�߳�������ֱ����������Ϊ0���Ż��������ִ�У�
		
		long end=System.currentTimeMillis();
		System.out.println("�ܺ�ʱ:"+(end-start));
		
	}

}
