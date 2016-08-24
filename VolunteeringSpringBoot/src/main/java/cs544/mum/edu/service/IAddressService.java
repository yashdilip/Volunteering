/**
 * 
 */
package cs544.mum.edu.service;

import java.util.List;

import cs544.mum.edu.domain.Address;

/**
 * @author Dilip
 *
 */
public interface IAddressService {
	void saveAddress(Address address);
	List<Address> getAllAddress();
}
