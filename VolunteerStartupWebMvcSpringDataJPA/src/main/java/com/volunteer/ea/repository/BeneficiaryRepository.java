/**
 * 
 */
package com.volunteer.ea.repository;

import com.volunteer.ea.domain.Beneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dilip
 *
 */
@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {

}
