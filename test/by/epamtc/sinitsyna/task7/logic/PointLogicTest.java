package by.epamtc.sinitsyna.task7.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.epamtc.sinitsyna.exception.NullParameterException;
import by.epamtc.sinitsyna.task7.bean.Point;

public class PointLogicTest {
	private PointLogic logic;

	@Before
	public void initLogic() {
		logic = new PointLogic();
	}

	@Test
	public void testCalculateSquaredLengthBetween2Points() throws NullParameterException {
		Point point1 = new Point(0, 5);
		Point point2 = new Point(5, 0);
		double expected = 50;
		double actual = logic.calculateSquaredLengthBetween2Points(point1, point2);
		Assert.assertEquals(expected, actual, 0.1);
	}

	@Test(expected = NullParameterException.class)
	public void testCalculateSquaredLengthBetween2PointsByPassingNullFirstPoint() throws NullParameterException {
		Point point1 = null;
		Point point2 = new Point(5, 0);
		logic.calculateSquaredLengthBetween2Points(point1, point2);
	}

	@Test(expected = NullParameterException.class)
	public void testCalculateSquaredLengthBetween2PointsByPassingNullSecondPoint() throws NullParameterException {
		Point point1 = new Point(5, 0);
		Point point2 = null;
		logic.calculateSquaredLengthBetween2Points(point1, point2);
	}

	@Test
	public void testRetrieveClosestToOriginPointWhenFirstPointIsClosest() throws NullParameterException {
		Point point1 = new Point(0, 4);
		Point point2 = new Point(5, 0);
		Point expected = point1;
		Point actual = logic.retrieveClosestToOriginPoint(point1, point2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testRetrieveClosestToOriginPointWhenPointsAreEqual() throws NullParameterException {
		Point point1 = new Point(2, 4);
		Point point2 = new Point(2, 4);
		Point expected = point2;
		Point actual = logic.retrieveClosestToOriginPoint(point1, point2);
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = NullParameterException.class)
	public void testRetrieveClosestToOriginPointByPassingNullSecondPoint() throws NullParameterException {
		Point point1 = new Point(0, 4);
		Point point2 = null;
		logic.retrieveClosestToOriginPoint(point1, point2);
	}

	@Test(expected = NullParameterException.class)
	public void testRetrieveClosestToOriginPointByPassingNullFirstPoint() throws NullParameterException {
		Point point1 = null;
		Point point2 = new Point(0, 4);
		logic.retrieveClosestToOriginPoint(point1, point2);
	}

}
