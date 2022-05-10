package br.unicamp.ic.inf335.beans.aula04_maven;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProdutoBeanTest {
	private static ArrayList<ProdutoBean> produtos = new ArrayList<ProdutoBean>();
	
	@Test
	void TestSerialversionuid(){		
		Assertions.assertEquals(0x01, ProdutoBean.getSerialversionuid());
	}
	
	@Test
	void TestcompareTo(){
		
		ProdutoBean nProg = new ProdutoBean("C1","Prod 1", "DESC",1250.0,"estado");
		produtos.add(nProg);
		nProg = new ProdutoBean("C2","Prod 2", "Bla Bla Bla",1100.0,"Bla Bla Bla");
		produtos.add(nProg);
		nProg = new ProdutoBean("C3","Prod 3 ", "Bla Bla Bla",120.0,"Bla Bla Bla");
		produtos.add(nProg);
		nProg = new ProdutoBean("C4","Prod 4", "Bla Bla Bla",120.0,"Bla Bla Bla");
		produtos.add(nProg);
		nProg = new ProdutoBean("C5","Prod 5", "Bla Bla Bla",9400.0,"Bla Bla Bla");
		produtos.add(nProg);
		nProg = new ProdutoBean("6","Prod 6", "Bla Bla Bla",1500.0,"Bla Bla Bla");
		produtos.add(nProg);
		
		Collections.sort(produtos);
		
		boolean resultado = true;
		for (int i=1; i<produtos.size(); i++) {
			if(produtos.get(i-1).getValor() > produtos.get(i).getValor()){
				resultado = false;
				System.out.println("TestcompareToValor = " + produtos.get(i-1).getValor() + " > " + produtos.get(i).getValor());
				break;
			}
		}
		Assertions.assertEquals(true, resultado);
	}

}
