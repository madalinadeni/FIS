class Complex{
	private double real;
	private double imaginar;
	private static int contor;
	
	public Complex( double re, double img)
	{
		real=re;
		imaginar=img;
	}
	
	public double calculareModul()
	{
		return Math.sqrt(real*real+imaginar*imaginar);
		
	}
	
	public void Afisare()
	{
		contor++;
		System.out.println(real+"+i*"+imaginar);
	}
	
	public Complex Suma(Complex nr2)
	{
		Complex nr3=new Complex(this.real+nr2.real, this.imaginar+nr2.imaginar);
		return nr3;
	}
	
	public static int AfisareContor()
	{
		return contor;
	}
	
}
class Main{
	public static void main(String argv[])
	{
		Complex nr1= new Complex(4,5);
		nr1.Afisare();
		
		Complex nr2= new Complex(5,6);
		nr2.Afisare();
		(nr1.Suma(nr2)).Afisare();
		System.out.println();
		System.out.println("S a afisat " +Complex.AfisareContor()+" numere ");
	}
	
}