package br.unicamp.ic.inf335.beans.aula04_maven;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnuncioBeanTest {
	private static AnuncioBean anuncio = new AnuncioBean();
	private static ProdutoBean produtos = new ProdutoBean();
	
	@Test
	void TestSerialversionuid(){		
		Assertions.assertEquals(0x01, AnuncioBean.getSerialversionuid());
	}
	
	@Test
	void exceptArithmeticsExpection(){
		assertThrows(ArithmeticException.class, () -> anuncio.getValor());
	}
	
	@Test
	void TestsetDesconto() {
		//n�o deve permitir um valor inv�lido para o desconto
		Double aux = anuncio.getDesconto();
		anuncio.setDesconto(1.01);
		
		System.out.println("TestsetDesconto: Esperado = " + aux + " getDesconto = " + anuncio.getDesconto());
		
		Assertions.assertEquals(aux, anuncio.getDesconto());
	}
	
	@Test
	void TestgetValor(){	
		anuncio.setDesconto(0.2);
		produtos.setValor(1000.0);
		anuncio.setProduto(produtos);
		
		System.out.println("TestgetValor: Esperado = " + (1000-(1000*0.2)) + " getValor = " + anuncio.getValor());
		
		
		Assertions.assertEquals((1000-(1000*0.2)), anuncio.getValor());
	}
}
