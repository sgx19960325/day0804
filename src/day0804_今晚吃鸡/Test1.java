package day0804_����Լ�;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

	    System.out.println("��ӭ����̼�ս��");

	    //100��ʿ����ÿ��ʿ����һ��ǹ

	    Soldier[] a = new Soldier[100];

	    for (int i = 0; i < a.length; i++) {

	        //�½�ʿ��ʵ����Ϊid��weapon��ֵ

	        Soldier s = new Soldier();

	        s.id = i+1;

	        s.weapon = new Weapon("AK"+(i+1));

	        //��ʿ����������

	        a[i] = s;

	    }

	    System.out.println("���س�ִ��");

	    while(true) {

	        //��ͣ�ȴ������س���Ż�������ִ��

	        new Scanner(System.in).nextLine();

	        //ÿ��ʿ������һ��

	        for (int i = 0; i < a.length; i++) {

	           //if (a[i].blood != 0) {//�����Ѫ

	              a[i].attack();    //ִ�н���

	              System.out.println("----");

	              /*

	              a = [{},{},{x},{},{},{},{}]

	                           i

	             

	              a = [{},{},{},{},{},{}]

	                       i

	               * */

	              if (a[i].blood == 0) {

	                 Soldier[] b = new Soldier[a.length-1];

	                 System.arraycopy(a,0,b,0,i);

	                 System.arraycopy(a,i+1,b,i,a.length-i-1);

	                 a = b;

	                 i--;

	              }

	           //}

	        }

	        System.out.println("\n\n---------------------");

	    }

	}
}
