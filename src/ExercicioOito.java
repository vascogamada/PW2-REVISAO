
public class ExercicioOito 
{
	public static void main(String[] args) 
	{
		 String diaSemana = "sábado";
		 
		 if(diaSemana == "segunda" || diaSemana == "terça" || diaSemana == "quarta" || diaSemana == "quinta" || diaSemana == "sexta")
		 {
			 System.out.println("Você pode ir ao banco.");
		 }
		 
		 else if (diaSemana == "sábado" || diaSemana =="domingo")
		 {
			 System.out.println("O banco está fechado, tente outro dia.");
		 }
	}
}
