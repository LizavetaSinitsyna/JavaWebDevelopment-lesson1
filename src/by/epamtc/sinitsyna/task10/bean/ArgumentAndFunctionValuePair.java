package by.epamtc.sinitsyna.task10.bean;

import java.io.Serializable;

public class ArgumentAndFunctionValuePair implements Serializable {

	private static final long serialVersionUID = 1L;

	private int x;
	private double y;

	public ArgumentAndFunctionValuePair() {
	}

	public ArgumentAndFunctionValuePair(int x, double y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		long temp;
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArgumentAndFunctionValuePair other = (ArgumentAndFunctionValuePair) obj;
		if (x != other.x)
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArgumentAndFunctionValuePair [x=" + x + ", y=" + y + "]";
	}

}
