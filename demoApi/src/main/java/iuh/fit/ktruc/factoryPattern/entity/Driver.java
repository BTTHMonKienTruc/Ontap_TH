package iuh.fit.ktruc.factoryPattern.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "drivers")
public class Driver implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 938451773500369632L;
	@Id
	@Column(name = "driver_id")
	private int id;
	private String name;
	private int price;
	private String km;
	@Column(name = "customer_id")
	private int customerId;
	//
	public Driver(int id, String name, int price, String km, int customerId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.km = km;
		this.customerId = customerId;
	}
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", price=" + price + ", km=" + km + ", customerId=" + customerId
				+ "]";
	}
//		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	
}

