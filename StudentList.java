package com.studenttask3;

import java.util.Scanner;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of students:");
		int num=s.nextInt();
		int i;
		Student[] list = new Student[num];
		for(i=0; i<num;i++){
			list[i]= new Student();
			System.out.println("Enter Student "+(i+1)+" id:");
			list[i].setId(s.nextInt());
			System.out.println("Enter Student "+(i+1)+" name:");
			s.nextLine();
			list[i].setName(s.nextLine());
			System.out.println("Enter Student "+(i+1)+" fee:");
			list[i].setFee(s.nextDouble());
			System.out.println("Enter Student "+(i+1)+" section:");
			list[i].setSection(s.next().charAt(0));
		}
		System.out.println("id\tname\tfee\tsection");
		for(int i1=0; i1<list.length;i1++){
			list[i1].result();
		}
	}
}	
class Student{
			 private int id;
			 private String name;
			 private double fee;
			 private char section;
		
			
			 public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public double getFee() {
				return fee;
			}
			public void setFee(double fee) {
				this.fee = fee;
			}
			public char getSection() {
				return section;
			}
			public void setSection(char section) {
				this.section = section;
			}
			public void result(){
				System.out.println(id+"\t"+name+"\t"+fee+"\t"+section);
			}
}
		