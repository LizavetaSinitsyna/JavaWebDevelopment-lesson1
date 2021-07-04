package by.epamtc.sinitsyna.task10.logic;

import java.util.Arrays;

import org.junit.Assert;

import org.junit.Test;

import by.epamtc.sinitsyna.exception.NonPositiveParameterException;
import by.epamtc.sinitsyna.task10.bean.ArgumentAndFunctionValuePair;
import by.epamtc.sinitsyna.task10.exception.IncorrectIntervalBoundsException;

public class FunctionLogicTest {

	@Test
	public void testCalculateFunction() throws NonPositiveParameterException, IncorrectIntervalBoundsException {
		int a = 5;
		int b = 8;
		int h = 3;
		ArgumentAndFunctionValuePair[] expected = { new ArgumentAndFunctionValuePair(5, Math.tan(5)),
				new ArgumentAndFunctionValuePair(8, Math.tan(8)) };
		ArgumentAndFunctionValuePair[] actual = FunctionLogic.calculateFunction(a, b, h);
		Assert.assertTrue(Arrays.equals(expected, actual));
	}

	@Test(expected = IncorrectIntervalBoundsException.class)
	public void testCalculateFunctionWhenPassedInteralIsIncorrect()
			throws NonPositiveParameterException, IncorrectIntervalBoundsException {
		int a = 8;
		int b = 5;
		int h = 3;
		FunctionLogic.calculateFunction(a, b, h);
	}

	@Test(expected = NonPositiveParameterException.class)
	public void testCalculateFunctionWhenPassedStepIsIncorrect()
			throws NonPositiveParameterException, IncorrectIntervalBoundsException {
		int a = 8;
		int b = 5;
		int h = -3;
		FunctionLogic.calculateFunction(a, b, h);
	}

	@Test
	public void testCalculateFunctionWhenPassedLargeBounds()
			throws NonPositiveParameterException, IncorrectIntervalBoundsException {
		int a = 2147483646;
		int b = 2147483647;
		int h = 2;
		ArgumentAndFunctionValuePair[] expected = {
				new ArgumentAndFunctionValuePair(2147483646, Math.tan(2147483646)) };
		ArgumentAndFunctionValuePair[] actual = FunctionLogic.calculateFunction(a, b, h);
		Assert.assertTrue(Arrays.equals(expected, actual));
	}

}
