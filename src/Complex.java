
class Complex {
	private double Real;
	private double Img;
	
	public Complex(){
		Real=4.0;
		Img=6.0;
	}
	
	public Complex(double a, double b){
		this.Real = a;
		this.Img = b;
	}
	
	public Complex AddComplex(Complex n1, Complex n2){
		Complex Result = new Complex();
		
		Result.Real = n1.Real + n2.Real;
		Result.Img = n1.Img + n2.Img;
		
		return Result;
	}
	
	public Complex SubtComplex(Complex n1, Complex n2){
		Complex Result = new Complex();
		
		Result.Real = n1.Real - n2.Real;
		Result.Img = n1.Img - n2.Img;
		
		return Result;
	}
	
	public void Show(){
		System.out.println(Real+ "+(" +Img +"i)");
	}
	
	public void SetComplex(double a, double b){
		this.Real = a;
		this.Img = b;
	}
	
	public void SetReal(double r){
		this.Real = r;
	}
	
	public void SetImg(double i){
		this.Img = i;
	}
	
	public double GetReal(){
		return Real;
	}
}
