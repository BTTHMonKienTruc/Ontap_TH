package iuh.fit.ktruc.factoryPattern.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iuh.fit.ktruc.factoryPattern.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer>{

}
