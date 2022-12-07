package iuh.fit.ktruc.factoryPattern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.fit.ktruc.factoryPattern.entity.Driver;
import iuh.fit.ktruc.factoryPattern.service.DriverService;

/**
 * 
 * @author AVan
 *
 */
@RestController
@RequestMapping("driver")
public class DriverController {

	@Autowired
	private DriverService driverService;

	@GetMapping("home")
	public String myHome() {
		return "home - home ";
	}

	//
	@GetMapping("")
	public List<Driver> getDrivers() {
		return driverService.findAll();
	}

	//
	@GetMapping("/{id}")
	public Driver getDriver(@PathVariable int id) {
		Driver driver = null;
		try {
			driver = driverService.findbyId(id);
		} catch (Exception e) {
			System.out.println(e);
		}
		return driver;
	}

	// add
	@PostMapping("")
	public Driver addDriver(@RequestBody Driver driver) {
		driverService.save(driver);
		return driverService.findbyId(driver.getId());
	}
	
	// update
	@PutMapping("")
	public String updateDriver(@RequestBody Driver driver) {
		driverService.save(driver);
		return "update id -- "+ driver.getId();
	}
	
	// del
	@DeleteMapping("/{id}")
	public String delDriver(@PathVariable int id) {
		
		try {
			driverService.del(id);
		} catch (Exception e) {
			return e.toString();
		}
		return "Del -- "+ id;
	}
}
