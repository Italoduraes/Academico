
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//alunos
		
		Aluno a1= new Aluno("Italo duraes", "2179010" , 20 , "Ci�ncia da Computa��o" , "Matutino" , "Masculino");
		
		//Disciplina
		
		Disciplina d1= new Disciplina("Algebra", "Ci�ncia da Computa��o", 75);
		
		
		System.out.println(a1.getNome());
		System.out.println(d1.getNome());
		
		System.out.println(a1.imprimirAluno());

	}

}
