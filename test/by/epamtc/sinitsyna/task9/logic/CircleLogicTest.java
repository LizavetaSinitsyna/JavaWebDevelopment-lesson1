package by.epamtc.sinitsyna.task9.logic;

import org.junit.Assert;

import org.junit.Test;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;

public class CircleLogicTest {

	@Test
	public void testCalculateCircleAreaWhenRadiusIsLargerThanZero() throws NonPositiveParameterException {
		double radius = 1;
		double expected = 3.141592653589793;
		double actual = CircleLogic.calculateCircleArea(radius);
		Assert.assertEquals(expected, actual, 0.00000001);
	}

	@Test
	public void testCalculateCircleAreaWhenRadiusIsEqualToZero() throws NonPositiveParameterException {
		double radius = 0;
		double expected = 0;
		double actual = CircleLogic.calculateCircleArea(radius);
		Assert.assertEquals(expected, actual, 0);
	}

	@Test(expected = NonPositiveParameterException.class)
	public void testCalculateCircleAreaWhenRadiusIsNegative() throws NonPositiveParameterException {
		double radius = -1;
		CircleLogic.calculateCircleArea(radius);
	}

	@Test
	public void testCalculateCircleLengthWhenRadiusIsLargerThanZero() throws NonPositiveParameterException {
		double radius = 1;
		double expected = 6.283185307179586;
		double actual = CircleLogic.calculateCircleLength(radius);
		Assert.assertEquals(expected, actual, 0.00000001);
	}

	@Test
	public void testCalculateCircleLengthWhenRadiusIsEqualToZero() throws NonPositiveParameterException {
		double radius = 0;
		double expected = 0;
		double actual = CircleLogic.calculateCircleLength(radius);
		Assert.assertEquals(expected, actual, 0);
	}

	@Test(expected = NonPositiveParameterException.class)
	public void testCalculateCircleLengthWhenRadiusIsNegative() throws NonPositiveParameterException {
		double radius = -1;
		CircleLogic.calculateCircleLength(radius);
	}

}
