package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Dao.ExpenseDaoIf;
import com.app.pojos.Expense;

@Service
public class ExpenseService implements ExpenseServiceIf {
	
	@Autowired
	private ExpenseDaoIf expenseDao;

	@Transactional
	public void add(Expense expense) {
		expenseDao.add(expense);
		
	}

	@Transactional
	public void edit(Expense expense) {
		expenseDao.edit(expense);
		
	}

	@Transactional
	public Expense get(int id) {
		return expenseDao.get(id);
	}

	@Transactional
	public void delete(int id ) {
		expenseDao.delete(id);
		
	}

	@Transactional
	public Expense Search(int id) {
		return expenseDao.Search(id);
	}

	@Transactional
	public List<Expense> getAllExpense() {
		return expenseDao.getAllExpense();
	}

}
