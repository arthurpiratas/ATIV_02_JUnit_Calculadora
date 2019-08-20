package negocio;

public class Calculadora implements ICalculadora{
	
	public Calculadora () {
		
	}

	@Override
	public int somar(String num1, String num2) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt(num1); 
		int b = Integer.parseInt(num2); 
		
		return a+b;
	}

	@Override
	public double dividir(String num1, String num2) {
		// TODO Auto-generated method stub
		
		double a = Double.parseDouble(num1); 
		double b = Double.parseDouble(num2); 
		
		return (a/b);
	}

	@Override
	public double rauzQuadrada(String num1) {
		// TODO Auto-generated method stub
		
		double a = Double.parseDouble(num1); 
		
		for (int i = 1; i < 100; i++) {
			if(i*i == a) {
				return i; 
			}
		}
		
		
		return 0;
	}
	
}
