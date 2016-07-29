package com.hand;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.print("请输入日期：");
		Scanner scn = new Scanner(System.in);
		String sdata = scn.nextLine();
		String mon = sdata.substring(5, 7);
		String year = sdata.substring(0, 4);
		String day = sdata.substring(8, 10);
		int y = Integer.valueOf(year);
		int m = Integer.valueOf(mon);
		int d = Integer.valueOf(day);
		if(yearRom(y)){
			printR(m,d);
		}else{
			printP(m,d);
		}
	}

	private static void printP(int m, int d) {
		switch (m) {
		case 1:
			System.out.println("你输入的日期为当年的第"+d+"天");
			break;
		case 2:
			System.out.println("你输入的日期为当年的第"+(d+31)+"天");
			break;
		case 3:
			System.out.println("你输入的日期为当年的第"+(d+31+28)+"天");
			break;
		case 4:
			System.out.println("你输入的日期为当年的第"+(d+31+28+31)+"天");
			break;
		case 5:
			System.out.println("你输入的日期为当年的第"+(d+31+28+31+30)+"天");
			break;
		case 6:
			System.out.println("你输入的日期为当年的第"+(d+31+28+31+30+31)+"天");
			break;
		case 7:
			System.out.println("你输入的日期为当年的第"+(d+31+28+31+30+31+30)+"天");
			break;
		case 8:
			System.out.println("你输入的日期为当年的第"+(d+31+28+31+30+31+30+31)+"天");
			break;
		case 9:
			System.out.println("你输入的日期为当年的第"+(d+31+28+31+30+31+30+31+31)+"天");
			break;
		case 10:
			System.out.println("你输入的日期为当年的第"+(d+31+28+31+30+31+30+31+31+30)+"天");
			break;
		case 11:
			System.out.println("你输入的日期为当年的第"+(d+31+28+31+30+31+30+31+31+30+31)+"天");
			break;
		case 12:
			System.out.println("你输入的日期为当年的第"+(d+31+28+31+30+31+30+31+31+30+31+30)+"天");
			break;
		default:
			break;
		}
	}

	public static void printR(int m,int d) {
		switch (m) {
		case 1:
			System.out.println("你输入的日期为当年的第"+d+"天");
			break;
		case 2:
			System.out.println("你输入的日期为当年的第"+(d+31)+"天");
			break;
		case 3:
			System.out.println("你输入的日期为当年的第"+(d+31+29)+"天");
			break;
		case 4:
			System.out.println("你输入的日期为当年的第"+(d+31+29+31)+"天");
			break;
		case 5:
			System.out.println("你输入的日期为当年的第"+(d+31+29+31+30)+"天");
			break;
		case 6:
			System.out.println("你输入的日期为当年的第"+(d+31+29+31+30+31)+"天");
			break;
		case 7:
			System.out.println("你输入的日期为当年的第"+(d+31+29+31+30+31+30)+"天");
			break;
		case 8:
			System.out.println("你输入的日期为当年的第"+(d+31+29+31+30+31+30+31)+"天");
			break;
		case 9:
			System.out.println("你输入的日期为当年的第"+(d+31+29+31+30+31+30+31+31)+"天");
			break;
		case 10:
			System.out.println("你输入的日期为当年的第"+(d+31+29+31+30+31+30+31+31+30)+"天");
			break;
		case 11:
			System.out.println("你输入的日期为当年的第"+(d+31+29+31+30+31+30+31+31+30+31)+"天");
			break;
		case 12:
			System.out.println("你输入的日期为当年的第"+(d+31+29+31+30+31+30+31+31+30+31+30)+"天");
			break;
		default:
			break;
		}
	}

	public static boolean yearRom(int i) {
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
}
