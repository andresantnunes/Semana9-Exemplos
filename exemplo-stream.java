import java.util.*;
import java.util.stream.*;

class Pessoa{
  private int idade;
  private String nome;

  public Pessoa(String nome, int idade){
    this.idade = idade;
    this.nome = nome;
  }
  public int getIdade(){
      return this.idade;
    }
  public String getNome(){
      return this.nome;
    }
}
class Main {  
  public static void main(String args[]) { 
    Pessoa pessoa1 = new Pessoa("André", 22);
    Pessoa pessoa2 = new Pessoa("Marcos", 24);
    Pessoa pessoa3 = new Pessoa("Aurélo", 42);
    Pessoa pessoa4 = new Pessoa("Kendric", 51);
    List<Pessoa> listaPessoas = new ArrayList<>();
    listaPessoas.add(pessoa1);
    listaPessoas.add(pessoa2);
    listaPessoas.add(pessoa3);
    listaPessoas.add(pessoa4);
    listaPessoas.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

    System.out.println("-------------");

    Stream<Pessoa> stream = listaPessoas.stream().filter(pessoa -> pessoa.getIdade() >= 42 );
    stream.forEach(pessoa -> System.out.println(pessoa.getNome()));
  } 
}