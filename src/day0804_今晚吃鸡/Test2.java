package day0804_����Լ�;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

	    //�½���������ʵ����

	    //���÷��䷽����װ�ط�������

	    Weapon w1 = new Weapon("AKM");

	    Weapon w2 = new Weapon("M416", 80);

	   

	    System.out.println("�س����䣬����rװ���ӵ�");

	    while(true) {

	        String s = new Scanner(System.in).nextLine();

	        if (s.equals("r")) {

	           w1.reload();

	           w2.reload();

	           System.out.println("������װ��");

	           continue;

	        }

	        w1.fire();

	        w2.fire();

	    }

	   

	}
}
