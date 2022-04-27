package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] info = new User[3]; //배열에 사람담기
		
		//닉네임, 비번, 이름
		User p01 = new Customer("jws", "j1234", "정우성", 1000);
		User p02 = new Customer("yis", "y2345", "이효리", 2000);
		User p03 = new Employee("master", "m7788", "운영자", 5000000);
		
		info[0] = p01;
		info[1] = p02;
		info[2] = p03;
		
		for(int i=0; i<info.length; i++) {
			info[i].showInfo();
			if(name=="운영자") { //어떻게 하는거지..
				
			}
		}
	}

}
