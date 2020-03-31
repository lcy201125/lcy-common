package com.lcy.common.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lcy.common.utils.StringUtil;

public class StringUtilTest {

	@Test
	public void testHashLength(){
		String str="abcd";
		boolean b=StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHashText(){
		String str="";
		boolean b=StringUtil.hasText(str);
		System.out.println(b);
	}
	
	@Test
	public void testRandomChineseString(){
		String  string =StringUtil.randomChineseString(50);
		System.out.println(string);
	}
	
	@Test
	public void testGenerateChineseName(){
		String string =StringUtil.generateChineseName();
		System.out.println(string);
	}
}
