package classes;

public class Matematica {
	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtracao(double a, double b) {
		return a - b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
	public static double divisao(double a, double b) {
		if(b == 0) 
			return 0;
		return a/b;
	}
	
	public static double f(double a, double b, double c) {
		double x = soma(a,b);
		double z = subtracao(x,c);
		double y = multiplicacao(a,b);
		double h = multiplicacao(y,c);
		
		if (h==0) 
			return 0;
		
		return divisao(z, h);
		
	}
	
	
	
	
	
	
	
	
	
}
