package br.unicamp.ic.inf335.beans.aula04_maven;


import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnuncianteBeanTest {
	
	private AnuncianteBean anun = new AnuncianteBean();

	
	@Test
	void TestCPF(){		
		anun.setCPF("12345678900");
		Assertions.assertEquals("12345678900", anun.getCPF());
	}

	@Test
	void exceptArithmeticsExpection(){
		assertThrows(ArithmeticException.class, () -> anun.valorMedioAnuncios());
	}

	
	@Test
	void TestremoveAnuncio() {	
		anun.removeAnuncio(30);
	}
	
	
	@Test
	void testValorMedioAnuncios() {
		ProdutoBean nProd = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1000.0,"Poucos riscos, estado de novo.");
		
		AnuncioBean nAnu = new AnuncioBean(nProd, null, 0.1);			
		anun.addAnuncio(nAnu);
		nAnu = new AnuncioBean(nProd, null, 0.1);
		anun.addAnuncio(nAnu);
		nAnu = new AnuncioBean(nProd, null, 0.1);
		anun.addAnuncio(nAnu);
		nAnu = new AnuncioBean(nProd, null, 0.1);
		anun.addAnuncio(nAnu);
		nAnu = new AnuncioBean(nProd, null, 0.1);
		anun.addAnuncio(nAnu);
		
		
		System.out.println("testValorMedioAnuncios: Esperado = " + ((900*5)/5) + " valorMedioAnuncios = " + anun.valorMedioAnuncios());
		
		Assertions.assertEquals((900*5)/5, anun.valorMedioAnuncios());
	}



}
