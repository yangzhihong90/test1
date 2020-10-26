package com.yzh.demo;

import org.junit.Test;

public class SolutionTest {
    @Test
    public  void Test() {
		  Solution solution=new Solution(); 
		  String str="23";
		  System.out.println("输入："+str);
		  System.out.println("输出："+solution.letterCombinations(str).toString());
	}
}

