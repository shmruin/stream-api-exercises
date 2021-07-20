package space.gavinklfong.demo.streamapi;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.slf4j.Slf4j;
import space.gavinklfong.demo.streamapi.models.Customer;
import space.gavinklfong.demo.streamapi.models.Order;
import space.gavinklfong.demo.streamapi.models.Product;
import space.gavinklfong.demo.streamapi.repos.CustomerRepo;
import space.gavinklfong.demo.streamapi.repos.OrderRepo;
import space.gavinklfong.demo.streamapi.repos.ProductRepo;

@Slf4j
@DataJpaTest
public class StreamApiQuestionTest {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private ProductRepo productRepo;	
	
	
	//
	// Obtain a list of product with category = "Books" and price > 100
	//
	@Test
	public void exercise1() {

		log.info("exercise 1 - Obtain a list of product with category = \"Books\" and price > 100");
		long startTime = System.currentTimeMillis();
		List<Product> result;	// TODO : Answer this question.
		
		long endTime = System.currentTimeMillis();

		log.info(String.format("exercise 1 - execution time: %1$d ms", (endTime - startTime)));		
//		result.forEach(p -> log.info(p.toString()));
		
	}
	
	//
	// Obtain a list of order with product category = "Baby"
	//
	@Test
	public void exercise2() {
		
		log.info("exercise 2 - Obtain a list of order with product category = \"Baby\"");
		long startTime = System.currentTimeMillis();
		List<Order> result; // TODO : Answer this question.
		
		long endTime = System.currentTimeMillis();

		log.info(String.format("exercise 2 - execution time: %1$d ms", (endTime - startTime)));		
//		result.forEach(o -> log.info(o.toString()));

	}
	
	
	//
	// Obtain a list of product with category = “Toys” and then apply 10% discount
	//
	@Test
	public void exercise3() {
		
		log.info("exercise 3 - Obtain a list of product with category = “Toys” and then apply 10% discount");
		long startTime = System.currentTimeMillis();
		
		List<Product> result; // TODO : Answer this question.
	
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 3 - execution time: %1$d ms", (endTime - startTime)));		
//		result.forEach(o -> log.info(o.toString()));
		
	}
	
	//
	// Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
	//
	@Test
	public void exercise4() {
				
		log.info("exercise 4 - Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021");
		long startTime = System.currentTimeMillis();		
		List<Product> result; // TODO : Answer this question.
		
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 4 - execution time: %1$d ms", (endTime - startTime)));		
//		result.forEach(o -> log.info(o.toString()));
	}
	
	//
	// Get the cheapest products of “Books” category
	//
	@Test
	public void exercise5() {
		
		log.info("exercise 5 - Get the 3 cheapest products of \"Books\" category");
		long startTime = System.currentTimeMillis();		
		Optional<Product> result; // TODO : Answer this question.

		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 5 - execution time: %1$d ms", (endTime - startTime)));		
//		log.info(result.get().toString());
					
	}
	
	//
	// Get the 3 most recent placed order
	//
	@Test
	public void exercise6() {
		
		log.info("exercise 6 - Get the 3 most recent placed order");
		long startTime = System.currentTimeMillis();	
		List<Order> result; // TODO : Answer this question.
		
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 6 - execution time: %1$d ms", (endTime - startTime)));		
//		result.forEach(o -> log.info(o.toString()));
	}
	
	//
	// Log order with order date on 1-Jan-2021 to the console and get a list of products
	//
	@Test
	public void exercise7() {
		
		log.info("exercise 7 - Get a list of products which was ordered on 15-Mar-2021");
		long startTime = System.currentTimeMillis();		
		List<Product> result; // TODO : Answer this question.
		
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 7 - execution time: %1$d ms", (endTime - startTime)));		
//		result.forEach(o -> log.info(o.toString()));
	}
	
	//
	// Calculate the total lump of all orders placed on 14-Feb-2021
	//
	@Test
	public void exercise8() {
		
		log.info("exercise 8 - Calculate the total lump of all orders placed in Feb 2021");
		long startTime = System.currentTimeMillis();	
		Double result; // TODO : Answer this question.
		
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 8 - execution time: %1$d ms", (endTime - startTime)));		
//		log.info("Total lump sum = " + result);
	}
	
	
	//
	// Calculate the average price of all orders placed on 15-Mar-2021
	//
	@Test
	public void exercise9() {
	
		log.info("exercise 9 - Calculate the average price of all orders placed on 15-Mar-2021");
		long startTime = System.currentTimeMillis();	
		Double result; // TODO : Answer this question.
		
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 9 - execution time: %1$d ms", (endTime - startTime)));		
//		log.info("Average = " + result);
	}
	
	//
	// Obtain statistics summary of all products which category = "Books"
	//
	@Test
	public void exercise10() {
		
		log.info("exercise 10 - Obtain statistics summary of all products belong to \"Books\" category");
		long startTime = System.currentTimeMillis();	
		DoubleSummaryStatistics statistics; // TODO : Answer this question.
		
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 10 - execution time: %1$d ms", (endTime - startTime)));		
//		log.info(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f", 
//				statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum()));
		
	}
	
	//
	// Obtain a data map of order id and the order's product count
	//
	@Test
	public void exercise11() {
		
		log.info("exercise 11 - Obtain a mapping of order id and the order's product count");
		long startTime = System.currentTimeMillis();	
		Map<Long, Integer>  result; // TODO : Answer this question.
		
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 11 - execution time: %1$d ms", (endTime - startTime)));		
//		log.info(result.toString());
	}
	
	//
	// Obtain a data map of customer and list of orders
	//
	@Test
	public void exercise12() {
		
		log.info("exercise 12 - Obtain a data map of customer and list of orders");
		long startTime = System.currentTimeMillis();	
		Map<Customer, List<Order>> result; // TODO : Answer this question.
		
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 12 - execution time: %1$d ms", (endTime - startTime)));		
//		log.info(result.toString());
	}
	
	//
	// Obtain a data map with order and its total price
	//
	@Test
	public void exercise13() {
		
		log.info("exercise 13 - Obtain a data map with order and its total price");
		long startTime = System.currentTimeMillis();	
		Map<Order, Double> result; // TODO : Answer this question.
		
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 13 - execution time: %1$d ms", (endTime - startTime)));		
//		log.info(result.toString());
	}
	
	//
	// Obtain a data map of product name by category
	//
	@Test
	public void exercise14() {
		
		log.info("exercise 14 - Obtain a data map of product name by category");
		long startTime = System.currentTimeMillis();	
		Map<String, List<String>> result; // TODO : Answer this question.
		
		
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 14 - execution time: %1$d ms", (endTime - startTime)));		
//		log.info(result.toString());
	}
	
	//
	// Get the most expensive product per category
	//
	@Test
	void exercise15() {
		
		
		log.info("exercise 15 - Get the most expensive product per category");
		long startTime = System.currentTimeMillis();	
		Map<String, Optional<Product>> result; // TODO : Answer this question.
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 15 - execution time: %1$d ms", (endTime - startTime)));		
//		log.info(result.toString());
//		result.forEach((k,v) -> {
//			log.info("key=" + k + ", value=" + v.get());
//		});
		
	}
	
}
