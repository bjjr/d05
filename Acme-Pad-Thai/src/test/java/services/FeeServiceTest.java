package services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import domain.Fee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/datasource.xml",
		"classpath:spring/config/packages.xml" })
@Transactional
public class FeeServiceTest {

	// Service under test -------------------------
	@Autowired
	private FeeService feeService;

	// Test ---------------------------------------
	@Test
	public void testfeeFindOne() {
		System.out
				.println("--------------List unique fee registered------------");

		Fee fee;

		fee = feeService.findFee();

		System.out.println(fee.getFee());

		System.out
				.println("----------------------END---------------------------");
	}
	
}
