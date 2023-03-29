# Teste JUnit para a classe Pessoa

## Este repositório contém um simples projeto em Java com uma classe Pessoa que possui dois métodos: getIdade() e eMaiorDeIdade(). O objetivo deste projeto é demonstrar como utilizar o framework JUnit para escrever testes unitários para esses métodos.

### Requisitos
JDK 8 ou superior
Eclipse IDE ou outra IDE Java
Como executar os testes
Clone o repositório para sua máquina.
Importe o projeto no Eclipse ou outra IDE Java.
Abra a classe PessoaTeste localizada no pacote testeJUnit.
Execute os testes clicando com o botão direito do mouse na classe e selecionando Run As > JUnit Test.
Sobre os testes
Existem três testes escritos na classe PessoaTeste:

### testCalculoDeIdade(): 
testa o método getIdade() verificando se a idade calculada está correta para uma data de nascimento conhecida.
deveRetornarSeEhMaiorDeIdade(): testa o método eMaiorDeIdade() para uma pessoa com data de nascimento conhecida que é maior de idade.
confereSeEhMenorDeIdade(): testa o método eMaiorDeIdade() para uma pessoa com data de nascimento conhecida que é menor de idade.
Sobre a classe Pessoa
A classe Pessoa possui dois atributos:

nome: uma String que representa o nome da pessoa.
nascimento: um LocalDateTime que representa a data e hora de nascimento da pessoa.
A classe possui dois métodos públicos:

getIdade(): retorna a idade da pessoa com base na data atual.
eMaiorDeIdade(): retorna true se a pessoa é maior de idade e false caso contrário.
