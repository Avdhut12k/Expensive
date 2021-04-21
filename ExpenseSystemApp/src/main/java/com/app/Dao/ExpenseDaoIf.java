package com.app.Dao;

import java.util.List;

import com.app.pojos.Expense;

public interface ExpenseDaoIf {
	
	public void add(Expense expense);
	public void edit(Expense expense);
	public Expense get(int id);
	public void delete(int id);
	public Expense Search(int id);
	public List<Expense> getAllExpense();
	

}
