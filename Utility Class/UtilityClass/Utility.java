

import java.util.*;

/* This is a parameterized class. You should decide 
* what the parameter should look like in order to 
* pass all the test cases. 
* In other words, you might want to change the parameter of this class to something more appropriate.
*/
public class Utility<T extends Comparable<T>> {
	private List<T> list;

    public Utility() {
        this.list = new ArrayList<>();
    }

    public Utility(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    public List<T> getList() {
        return this.list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
    public int linearSearch(T element) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(element) == 0) {
                return i;
            }
        }
        return -1;
    }

    public void mergeList(List<? super T> inputList) {
        inputList.addAll(this.list);
    }

    public boolean containList(List<? extends T> inputList) {
        return this.list.containsAll(inputList);
    }

    public void removeMultipleOf10(List<? extends MyInteger> myList) {
        myList.removeIf(MyInteger::isMultipleOf10);
    }

}

/**
 * The Point class represents a two-dimensional point with coordinates (x, y).
 * It implements the Comparable interface to provide custom comparison logic.
 */
class Point implements Comparable<Point> {
	/**
	 * The x-coordinate of the point.
	 */
	double x;
	/**
	 * The y-coordinate of the point.
	 */
	double y;

	/**
	 * Constructs a Point object with the specified coordinates.
	 * 
	 * @param x The x-coordinate of the point.
	 * @param y The y-coordinate of the point.
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Compares this point with another point for ordering based on their
	 * coordinates.
	 * 
	 * @param p The point to compare with.
	 * @return 0 if the points have the same coordinates, 1 if the x-coordinates are
	 *         equal but y-coordinate of this point is greater, -1 if the
	 *         x-coordinates are equal but y-coordinate of this point is smaller, -1
	 *         if the x-coordinate of this point is smaller, 1 if the x-coordinate
	 *         of this point is greater.
	 */
	@Override
	public int compareTo(Point p) {
		if (this.x == p.x && this.y == p.y)
			return 0;
		else if (this.x == p.x)
			return this.y < p.y ? -1 : 1;
		else
			return this.x < p.x ? -1 : 1;
	}
}

/**
 * The MyInteger class represents an integer number. It implements the
 * Comparable interface to provide custom comparison logic.
 */
class MyInteger implements Comparable<MyInteger> {
	/**
	 * The integer value stored in this MyInteger object.
	 */
	int x;

	/**
	 * Constructs a MyInteger object with the default value 0.
	 */
	public MyInteger() {
		this.x = 0;
	}

	/**
	 * Constructs a MyInteger object with the specified integer value.
	 * 
	 * @param x The integer value to assign to this MyInteger object.
	 */
	public MyInteger(int x) {
		this.x = x;
	}

	/**
	 * Checks if the provided MyInteger is a multiple of 10.
	 * 
	 * @param input The MyInteger object to check.
	 * @return true if the input MyInteger is a multiple of 10, false otherwise.
	 */
	public static boolean isMultipleOf10(MyInteger input) {
		return (input.x % 10) == 0;
	}

	/**
	 * Compares this MyInteger with another MyInteger for ordering.
	 * 
	 * @param input The MyInteger to compare with.
	 * @return 0 if the MyIntegers have the same value, -1 if this MyInteger is
	 *         smaller than the input MyInteger, 1 if this MyInteger is greater than
	 *         the input MyInteger.
	 */
	@Override
	public int compareTo(MyInteger input) {
		if (this.x == input.x)
			return 0;
		else if (this.x < input.x)
			return -1;
		else
			return 1;
	}
}

/**
 * The NaturalNumber class represents a subset of integer numbers known as
 * natural numbers. It extends the MyInteger class to inherit integer value
 * storage and comparison functionality.
 */
class NaturalNumber extends MyInteger {
	/**
	 * Constructs a NaturalNumber object with the specified natural number value.
	 * 
	 * @param x The natural number value to assign to this NaturalNumber object.
	 */
	public NaturalNumber(int x) {
		super(x);
	}
}

/**
 * The OddNumber class represents a subset of natural numbers known as odd
 * numbers. It extends the NaturalNumber class to inherit natural number value
 * storage and comparison functionality.
 */
class OddNumber extends NaturalNumber {
	/**
	 * Constructs an OddNumber object with the specified odd number value.
	 * 
	 * @param x The odd number value to assign to this OddNumber object.
	 */
	public OddNumber(int x) {
		super(x);
	}
}

/**
 * The EvenNumber class represents a subset of natural numbers known as even
 * numbers. It extends the NaturalNumber class to inherit natural number value
 * storage and comparison functionality.
 */
class EvenNumber extends NaturalNumber {
	/**
	 * Constructs an EvenNumber object with the specified even number value.
	 * 
	 * @param x The even number value to assign to this EvenNumber object.
	 */
	public EvenNumber(int x) {
		super(x);
	}
}
