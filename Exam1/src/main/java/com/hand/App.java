package com.hand;
import java.util.ArrayList;
import java.util.List;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		int count=0;
		List list = new ArrayList();
		for (int i = 101; i <= 200; i++) {
			for (int j = 1; j <= i; j++) {
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				list.add(i);
			}
			count = 0;
		}
		System.out.print("101-200间总共有"+list.size()+"个素数，分别是");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"，");
		}
	}
}
