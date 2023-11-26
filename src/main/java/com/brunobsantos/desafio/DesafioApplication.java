package com.brunobsantos.desafio;

import com.brunobsantos.desafio.entities.Order;
import com.brunobsantos.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	private Order order1 = new Order(1034, 150.0, 20.0);
	private Order order2 = new Order(2282, 800.0, 10.0);
	private Order order3 = new Order(1309, 95.90, 0.0);

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.printf("\n\nExemplo 1: \nPedido código %d\nValor total: R$ %.2f",
				order1.getCode(), orderService.total(order1));

		System.out.printf("\n\nExemplo 2: \nPedido código %d\nValor total: R$ %.2f",
				order2.getCode(), orderService.total(order2));

		System.out.printf("\n\nExemplo 3: \nPedido código %d\nValor total: R$ %.2f",
				order3.getCode(), orderService.total(order3));
	}
}
