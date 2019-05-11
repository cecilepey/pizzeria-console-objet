package fr.pizzeria.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PizzaMemDaoTest {

	@Test
	public void testPizzaMemDao() {

	}

	@Test
	public void testFindAllPizzas() {

		List<Pizza> listPizza = new ArrayList();
		listPizza.add(new Pizza("Pépéroni", "PEP", 12.50, CategoriePizza.SANS_VIANDE));
		Assert.assertEquals(1, listPizza.size());
	}

	@Test
	public void testSaveNewPizza() {
		Pizza pizza = null;
		List<Pizza> listPizza = new ArrayList<>();
		listPizza.add(pizza);
		Assert.assertEquals(1, listPizza.size());
	}

	@Test
	public void testUpdatePizza() {
		PizzaMemDao dao = new PizzaMemDao();
		Pizza pizza = new Pizza("calzone", "CAL", 12.50, CategoriePizza.SANS_VIANDE);
		dao.updatePizza("PEP", pizza);
		Assert.assertEquals("CAL", pizza.getCode());

	}

	@Test
	public void testDeletePizza() {
		PizzaMemDao dao = new PizzaMemDao();
		dao.deletePizza("PEP");
		Assert.assertEquals(7, dao.findAllPizzas().size());

	}

	@Test
	public void testFindPizzaByCode() {
		PizzaMemDao dao = new PizzaMemDao();
		Assert.assertEquals(null, dao.findPizzaByCode("REO"));

	}

	@Test
	public void testPizzaExists() {
		PizzaMemDao dao = new PizzaMemDao();
		Assert.assertFalse(dao.pizzaExists("REO"));

	}

}
