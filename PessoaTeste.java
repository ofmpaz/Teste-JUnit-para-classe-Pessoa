package testeJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class PessoaTeste {

	@Test
	void testCalculoDeIdade() {
		Pessoa monica = new Pessoa("Mônica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
		Assertions.assertEquals(22, monica.getIdade()); 
	}

	@Test
	void deveRetornarSeEhMaiorDeIdade() {
		Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(1995, 10, 7, 19, 0, 0)); 
		Assertions.assertTrue(jessica.eMaiorDeIdade());
	}

	@Test
	void confereSeEhMenorDeIdade() {
		Pessoa joao = new Pessoa("João", LocalDateTime.of(2023, 2, 2, 19, 0, 0));
		Assertions.assertFalse(joao.eMaiorDeIdade());
	}

}
