package iuh.fit.ktruc.factoryPattern.service;

import java.util.List;

import iuh.fit.ktruc.factoryPattern.entity.Driver;

public interface DriverService {
	
	public List<Driver> findAll();
	public Driver findbyId(int maTim);
	public void save (Driver driver);
	public void del (int maXoa);
	
}
