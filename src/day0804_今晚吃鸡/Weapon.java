package day0804_����Լ�;

import java.util.Random;

public class Weapon {
	String name;// ��������

	int bullets;// �ӵ�����

	public Weapon(String name) {

	    this(name, 100);//���췽��֮�����

	}

	public Weapon(String name, int bullets) {

	    this.name = name;

	    this.bullets = bullets;

	}

	 

	public void fire() {

	    System.out.println("����");

	    //��������ķ����ӵ�����

	    int r = 3 + new Random().nextInt(10);

	    if(r > this.bullets) {

	        r = this.bullets;

	    }

	    this.bullets -= r;

	    for (int i = 0; i < r; i++) {

	        System.out.print("ͻ");

	    }

	    System.out.println("~");

	    System.out.println("ʣ���ӵ���"+bullets);

	} 

	public void reload() {

	    this.bullets = 100;

	}
}
