package fr.pizzeria.service;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.model.PizzaMemDao;

public class AjouterPizzaServiceTest {

	@Rule
	public TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();

	@Test
	public void testExecuteUC() throws SavePizzaException {
		systemInMock.provideLines("MAX", "pizzaTest", "15", "VIANDE");

		PizzaMemDao dao = new PizzaMemDao();
		AjouterPizzaService ajout = new AjouterPizzaService();
		ajout.executeUC(new Scanner(System.in), dao);

		assertEquals(9, dao.findAllPizzas().size());

	}

	@Test(expected = SavePizzaException.class)
	public void testExecuteUC2() throws SavePizzaException {
		systemInMock.provideLines("", "pizzaTest", "15", "VIANDE");

		PizzaMemDao dao = new PizzaMemDao();
		AjouterPizzaService ajout = new AjouterPizzaService();

		ajout.executeUC(new Scanner(System.in), dao);

	}

}
