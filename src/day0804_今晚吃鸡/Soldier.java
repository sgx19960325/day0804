package day0804_����Լ�;

import java.util.Random;

public class Soldier {
	int id; //Ĭ��ֵ0

	int blood = 100;

	day0804_.Weapon weapon; // Ĭ��ֵ null

	//��Ա����

	public void go() {

	    System.out.println(this.id+"��ʿ��ǰ��");

	}

	public void attack() {

	    if(this.blood == 0) {

	        System.out.println("����"+id+"��ʿ����ʬ��");

	        return;

	    }

	    System.out.println(this.id+"��ʿ������");

	    //�����ǹ

	    if (this.weapon != null) {

	        if (this.weapon.bullets == 0) {

	           this.weapon.reload();//װ���ӵ�

	        }

	        this.weapon.fire(); //����

	    }

	   

	    //ģ���ܵ��˺�������һ������ļ�Ѫ��

	    int d = new Random().nextInt(10);

	    //�����Ѫ���ȵ�ǰѪ����

	    if(d > this.blood) {

	        d = this.blood;//�ж��ټ�����

	    }

	    this.blood -= d;

	    System.out.println("Ѫ����"+this.blood);

	    if(this.blood == 0) {

	        System.out.println(id+"��ʿ������");

	    }

	}
}
