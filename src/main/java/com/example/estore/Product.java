package com.example.estore;




public class Product {
	
	private String productName;
	private Integer productPrice;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * @param productName
	 * @param productPrice
	 */
	public Product(String productName, Integer productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}
	/**
	 * 
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	
	

}
