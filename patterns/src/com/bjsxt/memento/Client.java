package com.bjsxt.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker=new CareTaker();
		Emp emp=new Emp("��ɽ",20,800);
		System.out.println("��һ�δ�ӡ����"+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento());//����һ��
		
		emp.setAge(28);
		emp.setName("����");
		emp.setSalary(9000);
		System.out.println("�ڶ��δ�ӡ����"+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());

		emp.recovery(taker.getMemento());//�ָ�������¼���󱣴��״̬
		System.out.println("�����δ�ӡ����"+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());

		
		
	}

}
