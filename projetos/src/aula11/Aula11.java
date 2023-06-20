package aula11;

public class Aula11 {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		
		v1.setIdade(15);
		v1.setNome("teste nome");
		v1.setSexo("Masculino");
		
		v1.mostraInfo();
		
		
		Aluno a1 = new Aluno();
		
		a1.setNome("pedro");
		a1.setMatricula(1111);
		a1.setCurso("LEtras");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		a1.mostraInfo();
		
		Bolsista b1 = new Bolsista();
		
		b1.setNome("Jubileu");
		b1.setIdade(20);
		b1.setSexo("M");
		b1.pagarMensalidade();
		b1.mostraInfo();
		
		Professor p1 = new Professor();
		
		p1.setEspecialidade("Ingles");
		p1.setSalario(5000);
		p1.setNome("João");
		p1.setIdade(36);
		p1.setSexo("M");
		p1.receberAumento(500);
		System.out.println(p1.getSalario());
		p1.mostraInfo();
		
		Tecnico t1 = new Tecnico();
		
		t1.setNome("lucas");
		t1.setIdade(21);
		t1.setSexo("M");
		t1.setRegistroProfissional(5555);
		t1.setMatricula(7849);
		System.out.println(t1.getRegistroProfissional() +" - " + t1.getMatricula());
		t1.mostraInfo();
		
	}
}
