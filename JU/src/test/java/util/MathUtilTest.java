package util;

import org.junit.Test;

import util.MathUtil;

import org.junit.Assert;

public class MathUtilTest {
	@Test
	public void divideT1() {
		final int expected = 3;
		final int actual = MathUtil.divide(6, 2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void divideT2() {
        final int expected = 0;
 
        final int actual = MathUtil.divide(1, 2);
 
        Assert.assertEquals(expected, actual);
    }
	@Test(expected = IllegalArgumentException.class)
	public void divideT3() {
		MathUtil.divide(2, 0);
	}
	
	@Test
	public void addT1() {
		final int expected = 8;
		 
        final int actual = MathUtil.add(6, 2);
 
        Assert.assertEquals(expected, actual);
	}
}
