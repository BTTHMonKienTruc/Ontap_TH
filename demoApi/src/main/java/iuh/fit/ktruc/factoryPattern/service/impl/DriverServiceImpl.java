package iuh.fit.ktruc.factoryPattern.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iuh.fit.ktruc.factoryPattern.entity.Driver;
import iuh.fit.ktruc.factoryPattern.repository.DriverRepository;
import iuh.fit.ktruc.factoryPattern.service.DriverService;

/**
 * 
 * @author Admin
 *
 */

@Transactional
@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepository driverRepository;
	
	@Override
	public List<Driver> findAll() {
		// TODO Auto-generated method stub
		return driverRepository.findAll();
	}

	@Override
	public Driver findbyId(int maTim) {
		// TODO Auto-generated method stub
		Optional<Driver> result = driverRepository.findById(maTim);
		Driver driver = null;
		if (result.isPresent()) {
			driver = result.get();
		}
		else {
			throw new RuntimeException("Khongo tim dc ma - "+ maTim);
		}
		return driver;
	}

	@Override
	public void save(Driver driver) {
		// TODO Auto-generated method stub
		driverRepository.save(driver);
	}

	@Override
	public void del(int maXoa) {
		// TODO Auto-generated method stub
		Optional<Driver> a = driverRepository.findById(maXoa);
		if (a.isPresent()) {
			driverRepository.deleteById(maXoa);
		}
		else {
			throw new RuntimeException("Khongo tim dc ma - "+ maXoa);
		}
	}

}
