package com.hand;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		double salary;
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入工资：");
		try {
			salary = sca.nextDouble();
			if (salary > 0) {
				if ((salary - 3500.0) > 1500.0 && (salary - 3500.0) < 4500.0) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500.0) * 0.1);
				} else if ((salary - 3500.0) <= 0) {
					System.out.println("您不需要缴纳税费");
				} else if ((salary - 3500.0) < 1500.0 && (salary - 3500.0) > 0) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500.0) * 0.03);
				} else if ((salary - 3500.0) > 4500.0 && (salary - 3500.0) < 9500.0) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500.0) * 0.2);
				} else if ((salary - 3500.0) > 9000.0 && (salary - 3500.0) < 35000.0) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500.0) * 0.25);
				} else if ((salary - 3500.0) > 35000.0 && (salary - 3500.0) < 55000.0) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500.0) * 0.3);
				} else if ((salary - 3500.0) > 55000.0 && (salary - 3500.0) < 80000.0) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500.0) * 0.35);
				} else if ((salary - 3500.0) > 80000.0) {
					System.out.println("所需要缴纳的税费为" + (salary - 3500.0) * 0.45);
				} else {
					System.out.println("您输入有误，请重新输入！");
				}
			} else {
				System.out.println("您输入有误，请重新输入！");
			}
		} catch (Exception e) {
			System.out.println("您输入有误，请重新输入！");
		}

	}
}
