/**
 * 
 */
package cs544.mum.edu.repository;

import cs544.mum.edu.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dilip
 *
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
