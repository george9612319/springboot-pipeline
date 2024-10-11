package com.example.estore;

import java.util.List;



public class ProductResponse {

	private List<Product> products;
	private String message;
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ProductResponse [products=" + products + ", message=" + message + "]";
	}
	/**
	 * @param products
	 * @param message
	 */
	public ProductResponse(List<Product> products, String message) {
		this.products = products;
		this.message = message;
	}
	/**
	 * 
	 */
	public ProductResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
