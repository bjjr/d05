package services;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import utilities.AbstractTest;
import domain.Contest;
import domain.RecipeCopy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/datasource.xml",
		"classpath:spring/config/packages.xml" })
@Transactional
public class ContestServiceTest extends AbstractTest {

	// Service under test -------------------------
	@Autowired
	private ContestService contestService;

	// Test ---------------------------------------
	@Test
	public void testCreateContest() {
		authenticate("administrator1");
		Contest contest;

		contest = contestService.create();
		
		Assert.isTrue(contest.getClosingTime()==null);
		Assert.isTrue(contest.getOpeningTime()==null);
		Assert.isTrue(contest.getRecipeCopies()==null);
		Assert.isTrue(contest.getTitle()==null);
		unauthenticate();
	}
	
	// Test ---------------------------------------
	@Test
	public void testMinRecipeCopyPerContest() {
		authenticate("administrator1");
		System.out
				.println("--------------Min number of recipe copies per contest------------");

		Integer min;

		min = contestService.minRecipeCopyPerContest();

		System.out.println(min);

		System.out
				.println("----------------------END---------------------------");
		unauthenticate();
	}

	// Test ---------------------------------------
	@Test
	public void testMaxRecipeCopyPerContest() {
		authenticate("administrator1");
		System.out
				.println("--------------Max number of recipe copies per contest------------");

		Integer max;

		max = contestService.maxRecipeCopyPerContest();

		System.out.println(max);

		System.out
				.println("----------------------END---------------------------");
		unauthenticate();
	}
	
	// Test ---------------------------------------
	@Test
	public void testAvgRecipeCopyPerContest() {
		authenticate("administrator1");
		System.out
				.println("--------------Avg number of recipe copies per contest------------");

		Double avg;

		avg = contestService.avgRecipeCopyPerContest();

		System.out.println(avg);

		System.out
				.println("----------------------END---------------------------");
		unauthenticate();
	}
	
	// Test ---------------------------------------
	@Test
	public void testContestFindContestMoreRecipesQualified() {
		System.out
				.println("--------------List contest with more recipe copies------------");

		Contest contest;

		contest = contestService.findContestMoreRecipesQualified();

		System.out.println(contest.getTitle());

		System.out
				.println("----------------------END---------------------------");
	}

	// Test ---------------------------------------
	@Test
	public void testContestFindRecipeCopiesByContest() {
		System.out
				.println("--------------List all the recipes copy by contest------------");

		Collection<RecipeCopy> all;

		all = contestService.findRecipeCopiesByContest(253);

		for (RecipeCopy r : all) {
			System.out.println(r.getTitle());
		}

		System.out
				.println("----------------------END---------------------------");
	}

	// Test ---------------------------------------
	@Test
	public void testContestFindRecipeWinnerByContest() {
		System.out
				.println("--------------List all the winners copy by contest------------");

		Collection<RecipeCopy> all;

		all = contestService.findRecipeWinnerByContest(253);

		for (RecipeCopy r : all) {
			System.out.println(r.getTitle());
		}

		System.out
				.println("----------------------END---------------------------");
	}
}
