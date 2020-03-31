package com.lcy.common.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lcy.common.utils.RandomUtil;

public class RandomUtilTest {

	
	@Test
	public void testRandom(){
		int i=RandomUtil.random(1, 100);
		System.out.println(i);
	}
	
	@Test
	public void testSubRandom(){
		int []is=RandomUtil.subRandom(1, 3, 2);
		for (int i : is) {
			System.out.println(i);
		}
	}
	
	@Test
	public void testRandomCharacter(){
		char character=RandomUtil.randomCharacter();
		System.out.println(character);
	}
	
	@Test
	public void testRandomString(){
		String string =RandomUtil.randomString(8);
		System.out.println(string);
	}
}
