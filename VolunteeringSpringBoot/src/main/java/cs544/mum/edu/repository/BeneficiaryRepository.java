/**
 * 
 */
package cs544.mum.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cs544.mum.edu.domain.Beneficiary;

/**
 * @author Dilip
 *
 */
@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

}
