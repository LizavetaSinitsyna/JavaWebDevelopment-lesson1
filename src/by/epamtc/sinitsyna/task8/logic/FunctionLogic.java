/*-
 * Вычислить значение функции:
 * -x * x + 3 * x + 9, если х >= 3;
 * 1 / ((x ^ 3) - 6), если х < 3.
 */

package by.epamtc.sinitsyna.task8.logic;

public class FunctionLogic {

	public double calculateFunction(double x) {
		if (x >= 3) {
			return -x * x + 3 * x + 9;
		} else {
			return 1 / (x * x * x - 6);
		}
	}

}
