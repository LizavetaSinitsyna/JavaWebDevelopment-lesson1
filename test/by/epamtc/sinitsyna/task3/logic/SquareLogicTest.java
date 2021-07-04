package by.epamtc.sinitsyna.task3.logic;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;

public class SquareLogicTest {
	SquareLogic logic;

	@Before
	public void initLogic() {
		logic = new SquareLogic();
	}

	@Test
	public void testRetrieveIncircleRadius() throws NonPositiveParameterException {
		double squareArea = 4;
		double expected = 1;
		double actual = logic.retrieveIncircleRadius(squareArea);
		Assert.assertEquals(expected, actual, 0.1);
	}

	@Test(expected = NonPositiveParameterException.class)
	public void testRetrieveIncircleRadiusByPassingNegativeArea() throws NonPositiveParameterException {
		double squareArea = -4;
		logic.retrieveIncircleRadius(squareArea);
	}

	@Test
	public void testRetrieveIncircleRadiusByPassingZeroArea() throws NonPositiveParameterException {
		double squareArea = 0;
		double expected = 0;
		double actual = logic.retrieveIncircleRadius(squareArea);
		Assert.assertEquals(expected, actual, 0);
	}

	@Test
	public void testRetrieveInscribedSquareArea() throws NonPositiveParameterException {
		double radius = 1;
		double expected = 2;
		double actual = logic.retrieveInscribedSquareArea(radius);
		Assert.assertEquals(expected, actual, 0.1);
	}

	@Test(expected = NonPositiveParameterException.class)
	public void testRetrieveInscribedSquareAreaByPassingNegativeRadius() throws NonPositiveParameterException {
		double radius = -1;
		logic.retrieveInscribedSquareArea(radius);
	}

	@Test
	public void testRetrieveInscribedSquareAreaByPassingZeroRadius() throws NonPositiveParameterException {
		double radius = 0;
		double expected = 0;
		double actual = logic.retrieveInscribedSquareArea(radius);
		Assert.assertEquals(expected, actual, 0);
	}

	@Test
	public void testRetrieveAreaDifferenceInTimes() throws NonPositiveParameterException {
		double area1 = 4;
		double area2 = 2;
		double expected = 2;
		double actual = logic.retrieveAreaDifferenceInTimes(area1, area2);
		Assert.assertEquals(expected, actual, 0.1);
	}

	@Test(expected = NonPositiveParameterException.class)
	public void testRetrieveAreaDifferenceInTimesByPassingNegativeFirstArea() throws NonPositiveParameterException {
		double area1 = -3;
		double area2 = 2;
		logic.retrieveAreaDifferenceInTimes(area1, area2);
	}

	@Test(expected = NonPositiveParameterException.class)
	public void testRetrieveAreaDifferenceInTimesByPassingNegativeSecondArea() throws NonPositiveParameterException {
		double area1 = 2;
		double area2 = -3;
		logic.retrieveAreaDifferenceInTimes(area1, area2);
	}

	@Test
	public void testRetrieveAreaDifferenceInTimesByPassingZeroFirstArea() throws NonPositiveParameterException {
		double area1 = 0;
		double area2 = 2;
		double expected = 0;
		double actual = logic.retrieveAreaDifferenceInTimes(area1, area2);
		Assert.assertEquals(expected, actual, 0);
	}

	@Test
	public void testRetrieveAreaDifferenceInTimesByPassingZeroSecondArea() throws NonPositiveParameterException {
		double area1 = 2;
		double area2 = 0;
		double expected = 0;
		double actual = logic.retrieveAreaDifferenceInTimes(area1, area2);
		Assert.assertEquals(expected, actual, 0);
	}

}
