
public class ExercicioOito 
{
	public static void main(String[] args) 
	{
		 String diaSemana = "s�bado";
		 
		 if(diaSemana == "segunda" || diaSemana == "ter�a" || diaSemana == "quarta" || diaSemana == "quinta" || diaSemana == "sexta")
		 {
			 System.out.println("Voc� pode ir ao banco.");
		 }
		 
		 else if (diaSemana == "s�bado" || diaSemana =="domingo")
		 {
			 System.out.println("O banco est� fechado, tente outro dia.");
		 }
	}
}
