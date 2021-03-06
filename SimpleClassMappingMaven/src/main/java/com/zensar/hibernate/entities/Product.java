package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Dipankar Chakraborty
 * @creation_date 1 October 2019 10:13 AM
 * @modification_date 1 October 2019 10:13 AM
 * @version 1.0
 * @copyright Zensar Technologies. All rights reserved.
 *
 */
@Entity
public class Product {
	@Id
	@Column(name = "id")
	private int productId;
	private String name;
	private String Brand;
	private float price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", Brand=" + Brand + ", price=" + price + "]";
	}
}
