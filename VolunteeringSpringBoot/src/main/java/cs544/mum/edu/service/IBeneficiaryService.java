/**
 * 
 */
package cs544.mum.edu.service;

import java.util.List;

import cs544.mum.edu.domain.Beneficiary;

/**
 * @author Dilip
 *
 */
public interface IBeneficiaryService {
	void createBeneficiary(Beneficiary beneficiary);
	List<Beneficiary> getAllBeneficiariesByProjectId(int projectId);
}
