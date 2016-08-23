/**
 * 
 */
package com.volunteer.ea.repository;

import com.volunteer.ea.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dilip
 *
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
