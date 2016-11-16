package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import repositories.FeeRepository;
import domain.Fee;

@Service
@Transactional
public class FeeService {

	// Managed repository -----------------------------------------------------
	@Autowired
	private FeeRepository feeRepository;

	// Supporting services ----------------------------------------------------
	@Autowired
	private ActorService actorService;

	// Constructors -----------------------------------------------------------
	public FeeService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------
	public void save(Fee fee) {
		Assert.notNull(fee);
		Assert.isTrue(actorService.checkAuthority("ADMINSTRATOR"),
				"Only an admin could save fee");

		feeRepository.save(fee);
	}
	
	public Fee findOne(int id){
		Fee result;
		
		result = feeRepository.findOne(id);
		Assert.notNull(result);
		
		return result;
	}
	
	// Other business methods -------------------------------------------------
	
	public Fee findFee(){
		Fee result;
		
		result = feeRepository.findFee();
		Assert.notNull(result);
		
		return result;
	}
}
