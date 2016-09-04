
public class Main {

	public static void main(String[] args) {
		Complex n1 = new Complex(3.0, 2.0);
		Complex n2 = new Complex(2.0, 7.0);
		Complex Result = new Complex();
		
		Result=n1.AddComplex(n1, n2);
		System.out.println("El resultado de la suma es: ");
		Result.Show();
		
		Result=n1.SubtComplex(n1, n2);
		System.out.println("El resultado de la resta es: ");
		Result.Show();
	}

}
