package com.practice.twothrd;

public class aaa {

	public static void main(String[] args) {
		String name="Sanjaayaa";
		
		for (int i = 0; i < name.length(); i++) {
			if(name.indexOf('a', i)==-1)
				break;
			if(i==name.indexOf('a', i))
			{
				System.out.println(i);
			}
			
		}
		
		
	}

}
