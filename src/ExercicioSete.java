
public class ExercicioSete 
{
	public static void main(String[] args) 
	{
		double lado1 = 3, lado2 = 2, lado3 =1;
		
		if(lado1 == lado2 && lado2 == lado3)
		{
			System.out.println("Esse tri�ngulo � um equil�tero.");
		}
		
		else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) 
		{
			System.out.println("Esse tri�ngulo � um is�sceles.");
		}
		
		else
		{
			System.out.println("Esse tri�ngulo � um escaleno.");
		}
	}
}
