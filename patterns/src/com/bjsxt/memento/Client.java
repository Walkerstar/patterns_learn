package com.bjsxt.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker=new CareTaker();
		Emp emp=new Emp("钟山",20,800);
		System.out.println("第一次打印对象："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento());//备忘一次
		
		emp.setAge(28);
		emp.setName("张三");
		emp.setSalary(9000);
		System.out.println("第二次打印对象："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());

		emp.recovery(taker.getMemento());//恢复到备忘录对象保存的状态
		System.out.println("第三次打印对象："+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());

		
		
	}

}
