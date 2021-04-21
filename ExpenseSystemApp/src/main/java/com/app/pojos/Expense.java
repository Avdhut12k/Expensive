package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ExpenseApp")
public class Expense {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int expenseId;
	
	@Column
	private String productname;
	
	@Column
	private String category;
	
	@Column
	private Double price;
	
	
	
	
	public Expense() {
		
	}
	

	public Expense(int expenseId, String productname, String category,Double price) {
		super();
		this.expenseId = expenseId;
		this.productname = productname;
		this.category = category;
		this.price = price;
	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", productname=" + productname + ", category=" + category
				+ ", price=" + price + "]";
	}

	
	

	
	
	
	
}
