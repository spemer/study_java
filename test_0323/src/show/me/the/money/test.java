package show.me.the.money;
// ��Ű���� ���� ���� ����(Ǯ����)

import java.util.ArrayList;
//import show.me.the.money.*;
//��̴��Ӵ� ��� ��Ű��.Ŭ������ �����ؼ� ���

public class test
{

	public static void main(String[] args)
	{
		stock s1 = null, s2 = null, s3 = null;
			// ���� ����. �̸��� ������� ���� (�ʱ�ȭ�� ���� ���� ����)
			// null = �̸��� ���� ������, ����Ű�� ���� ����.

		s1 = new stock();
		s2 = new stock();
		s3 = new stock();
			// ��ü ���� 3�� ������� (�������)

			// stock.java ���� ������� ***Ʋ*** �� ���� ������ ���� ��ü�� ��(������)�� ��������
		s1.name = "Samsung";
		s1.buy_price = 300000;
		s1.cur_price = 2000000;
		s1.target = 0.1; // ��ǥ ���ͷ��� 10%
			// s1 �� ���� ��������

		s2.name = "LG";
		s2.buy_price = 30000;
		s2.cur_price = 80000;
		s2.target = 0.2;

		s3.name = "Kakao";
		s3.buy_price = 3000;
		s3.cur_price = 1000;
		s3.target = 0.3;
			// �� ��ü �ȿ� �� ���� ��������.

			// stock.java���� Ŭ���� (���� Ʋ)�� �� ��������
			// ���� ��ü�鿡�� ������ �� �ϸ�
			// ���� �ٿ��ָ� ��𿡳� �� �� ����


		/*
		System.out.println(s1.name + ": " + s1.isTargetMatched());
		System.out.println(s2.name + ": " + s2.isTargetMatched());
		System.out.println(s3.name + ": " + s3.isTargetMatched());
		*/



		//roboAdvisor robo = new roboAdvisor();
			// ���ڰ� ���� �����ڸ� ����, Ŭ���� �̸��� �����ϰ�


		ArrayList<stock> s = new ArrayList<stock>();
			// ��ü�̸��� s, ArrayList�� Ŭ���� - ũ�Ⱑ ������� �پ��� �þ��� ��
		s.add(s1);
		s.add(s2);
		s.add(s3);
			// .add ��� �޼ҵ尡 �⺻������
			// .add�� �ݴ�� .remove


		/*
		stock[] s = new stock[3];
			// 3�� ���� �迭�� �������
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		*/


		roboAdvisor robo = new roboAdvisor(s);
			// �����ڸ� �����Ҷ� �μ��� �̹� ���� �Ѱ���
			// new �����ڸ� ����ؼ� ��ü�� ����
		//robo.setStocks(s);
		robo.showStockNamesToSell();
		// ��������� (.)�� ����ؼ� ��ü robo�� ��� (����� �޼ҵ�)�� ������

		System.out.println("-------------------");

		stock newStock = new stock();
		newStock.name = "��Ʈ����";
		newStock.buy_price = 50000;
		newStock.cur_price = 100000;
		newStock.target = 0.1;

		robo.addStock(newStock);
		robo.showStockNamesToSell();

	}

}
