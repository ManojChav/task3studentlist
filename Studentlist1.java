package com.studenttask3;

import java.util.Scanner;

public class Studentlist1 {
//1.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int num=s.nextInt();
		
		int[] id = new int[num];
		String[] name = new String[num];
		double[] fee = new double[num];
		char[] section = new char[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Student "+(i+1)+" id:");
			id[i]= s.nextInt();
			System.out.println("Enter Student "+(i+1)+" name:");
			s.nextLine(); 
			name[i]= s.nextLine();
			System.out.println("Enter Student "+(i+1)+" fee:");
			fee[i]= s.nextDouble();
			System.out.println("Enter Student "+(i+1)+" section:");
			section[i]= s.next().charAt(0);
		}
		
		System.out.println("id\tname\tfee\tsection");
		
		for(int i=0;i<num;i++){
			System.out.println(id[i]+"\t"+name[i]+"\t"+fee[i]+"\t"+section[i]);
		}
	}
    
}
