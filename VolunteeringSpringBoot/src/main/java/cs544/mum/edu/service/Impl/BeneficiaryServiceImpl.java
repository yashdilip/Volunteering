/**
 * 
 */
package cs544.mum.edu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs544.mum.edu.domain.Beneficiary;
import cs544.mum.edu.repository.BeneficiaryRepository;
import cs544.mum.edu.service.IBeneficiaryService;

/**
 * @author Dilip
 *
 */
@Service
public class BeneficiaryServiceImpl implements IBeneficiaryService {

	@Autowired
	BeneficiaryRepository beneficiaryRepository;
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IBeneficiaryService#createBeneficiary(cs544.mum.edu.domain.Beneficiary)
	 */
	@Override
	public void createBeneficiary(Beneficiary beneficiary) {
		// TODO Auto-generated method stub
		beneficiaryRepository.save(beneficiary);
	}

	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IBeneficiaryService#getAllBeneficiariesByProjectId(int)
	 */
	@Override
	public List<Beneficiary> getAllBeneficiariesByProjectId(int projectId) {
		// TODO Auto-generated method stub
		return beneficiaryRepository.findAll();
	}

}
