
public class ExercicioSete 
{
	public static void main(String[] args) 
	{
		double lado1 = 3, lado2 = 2, lado3 =1;
		
		if(lado1 == lado2 && lado2 == lado3)
		{
			System.out.println("Esse triângulo é um equilátero.");
		}
		
		else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) 
		{
			System.out.println("Esse triângulo é um isósceles.");
		}
		
		else
		{
			System.out.println("Esse triângulo é um escaleno.");
		}
	}
}
