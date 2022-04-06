package br.com.fiap.aplicacao;

import br.com.fiap.dominio.Pessoa;

public class Progama {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Jhoctan Teixeira", "jhoctansilva@gmail.com");
		Pessoa p2 = new Pessoa(2, "Yasmim Camilo", "yasmimcamilosf@gmail.com");
		Pessoa p3 = new Pessoa(3, "Lunna Camilo Teixeira", "lunnacamilostex@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
