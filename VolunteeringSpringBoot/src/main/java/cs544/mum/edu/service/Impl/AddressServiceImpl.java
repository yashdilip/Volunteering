/**
 * 
 */
package cs544.mum.edu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs544.mum.edu.domain.Address;
import cs544.mum.edu.repository.AddressRepository;
import cs544.mum.edu.service.IAddressService;

/**
 * @author Dilip
 *
 */
@Service
public class AddressServiceImpl implements IAddressService{

	@Autowired
	AddressRepository addressRepository;
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IAddressService#saveAddress(cs544.mum.edu.domain.Address)
	 */
	@Override
	public void saveAddress(Address address) {
		// TODO Auto-generated method stub
		addressRepository.save(address);
		
	}

	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IAddressService#getAllAddress()
	 */
	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

}
