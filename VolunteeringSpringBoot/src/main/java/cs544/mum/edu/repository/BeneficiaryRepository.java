/**
 * 
 */
package cs544.mum.edu.repository;

import cs544.mum.edu.domain.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dilip
 *
 */
@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

}
