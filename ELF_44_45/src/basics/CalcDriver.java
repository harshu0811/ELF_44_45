package basics;

public class CalcDriver {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 12));
		System.out.println(c.add(10, 12,34));
		
		double result = c.add(23,34,45,67,78,90,12,23,21,43,543);
		System.out.println(result);
	}

}
