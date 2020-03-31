package com.lcy.common.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Calendar;

import org.junit.Test;

import com.lcy.common.utils.RandomUtil;
import com.lcy.common.utils.StringUtil;

public class PersonTest {

	@Test
	public void testCreatePerson() {
		for (int i = 0; i <10000; i++) {
			
			Person p=new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1,120));
			p.setAbout(StringUtil.randomChineseString(140));
			
			Calendar c=Calendar.getInstance();
			c.set(2010, 0,1);
			System.out.println(c);
		}
	}

}
