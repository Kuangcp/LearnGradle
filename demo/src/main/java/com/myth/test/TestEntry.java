package com.myth.test;
import java.util.*;
public class TestEntry{

	//  纯记事本开发
	public static void main(String []d){
		System.out.println("Hello Gradle Build Runable Jar ！");	
		
	}
	public static void testList(){
		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		for (String temp : a) {
			if("1".equals(temp)){
				a.remove(temp);
			}
		}
		for(String temp:a){
			System.out.println("集合遍历 ："+temp)
		}

	}
	
}