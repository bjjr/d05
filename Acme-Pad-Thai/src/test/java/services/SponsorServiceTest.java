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
import domain.Bill;
import domain.Sponsor;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/datasource.xml",
		"classpath:spring/config/packages.xml" })
@Transactional
public class SponsorServiceTest extends AbstractTest {

	// Service under test -------------------------
	@Autowired
	private SponsorService sponsorService;

	// Test ---------------------------------------
	@Test
	public void testCreateSponsor() {
		Sponsor sponsor;

		sponsor = sponsorService.create();
		
		Assert.isTrue(sponsor.getCampaigns()==null);
		Assert.isTrue(sponsor.getCompanyName()==null);
		Assert.isTrue(sponsor.getCreditCard()==null);
	}
	
	// Test ---------------------------------------
	@Test
	public void testSaveSponsor() {
		Sponsor sponsor, saved;

		sponsor = sponsorService.findOne(62);
		sponsor.setCompanyName("test company name");

		saved = sponsorService.save(sponsor);
		Assert.isTrue(sponsorService.exist(saved.getId()));

		unauthenticate();
	}
	
	// Test ---------------------------------------
	@Test
	public void testShowBillsBySponsor() {
		System.out.println("--------------List bills by sponsor------------");

		Collection<Bill> all;

		all = sponsorService.showBillsBySponsor(61);

		for (Bill b : all) {
			System.out.println(b);
		}

		System.out
				.println("----------------------END---------------------------");
	}

	// Test ---------------------------------------
	@Test
	public void testCompaniesByNumCampaigns() {
		authenticate("administrator1");
		System.out
				.println("--------------List companies order by num of campaigns------------");

		Collection<String> all;

		all = sponsorService.companiesByNumCampaigns();

		for (String s : all) {
			System.out.println(s);
		}

		System.out
				.println("----------------------END---------------------------");
		unauthenticate();
	}

	// Test ---------------------------------------
	@Test
	public void testCompaniesByNumBills() {
		authenticate("administrator1");
		System.out
				.println("--------------List companies order by num of bills------------");

		Collection<String> all;

		all = sponsorService.companiesByNumBills();

		for (String s : all) {
			System.out.println(s);
		}

		System.out
				.println("----------------------END---------------------------");
		unauthenticate();
	}

	// Test ---------------------------------------
	@Test
	public void testInactiveSponsors() {
		authenticate("administrator1");
		System.out
				.println("--------------List all the inactive sponsors------------");

		Collection<Sponsor> all;

		all = sponsorService.inactiveSponsors();

		for (Sponsor s : all) {
			System.out.println(s);
		}

		System.out
				.println("----------------------END---------------------------");
		unauthenticate();
	}

	// Test ---------------------------------------
	@Test
	public void testCompaniesSpentLessThanAverage() {
		authenticate("administrator1");
		System.out
				.println("--------------List companies who spent less than average------------");

		Collection<String> all;

		all = sponsorService.companiesSpentLessThanAverage();

		for (String s : all) {
			System.out.println(s);
		}

		System.out
				.println("----------------------END---------------------------");
		unauthenticate();
	}

	// Test ---------------------------------------
	@Test
	public void testCompaniesSpentAtLeastNinety() {
		authenticate("administrator1");
		System.out
				.println("--------------List companies who spent at least 90%------------");

		Collection<String> all;

		all = sponsorService.companiesSpentAtLeastNinety();

		for (String s : all) {
			System.out.println(s);
		}

		System.out
				.println("----------------------END---------------------------");
		unauthenticate();
	}

}
