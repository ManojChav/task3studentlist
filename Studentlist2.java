package com.studenttask3;

import java.util.Scanner;

public class Studentlist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    	Scanner s = new Scanner(System.in);
				System.out.println("Enter the number of students:");
				int num=s.nextInt();
				int i = 0;
				int[] id = new int[num];
				String[] name = new String[num];
				double[] fee = new double[num];
				char[] section = new char[num];
				allinfo(i,num,id,name,fee,section);
				System.out.println("Enter section that you want to see");
				char sec = s.next().charAt(0);
				System.out.println("id\tname\tfee\tsection");
				result(i,num,id,name,fee,section,sec);		
					
	}
	
	private static void allinfo(int i,int num,int[]id, String[] name, double[] fee, char[] section){
		Scanner s= new Scanner(System.in);
		if(i<num){
			System.out.println("Enter Student "+(i+1)+" id:");
			id[i]=s.nextInt();
			System.out.println("Enter Student "+(i+1)+" name:");
			s.nextLine(); 
			name[i]=s.nextLine();
			System.out.println("Enter Student "+(i+1)+" fee:");
			fee[i]=s.nextDouble();
			System.out.println("Enter Student "+(i+1)+" section:");
			section[i]= s.next().charAt(0);
			i++;
			allinfo(i,num,id,name,fee,section);
		}			

	}
private static void result(int i, int num, int[] id, String[] name, double[] fee, char[] section, char sec) {
		
		if(i<num){
			if(section[i]==sec){
			System.out.println(id[i]+"\t"+name[i]+"\t"+fee[i]+"\t"+section[i]);}
			i++;
			result(i,num,id,name,fee,section,sec);
		}
		
	}
}


