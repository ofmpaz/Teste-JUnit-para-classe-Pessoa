package testeJUnit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	
	private String nome; 
	private LocalDateTime nascimento; 
	
	public Pessoa(String _nome, LocalDateTime _nascimento) {
		nome = _nome; 
		nascimento = _nascimento; 
	}
	
	public int getIdade() {
		return(int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
	}
	
	public boolean eMaiorDeIdade() {
		return getIdade() >= 18; 
	}

}
