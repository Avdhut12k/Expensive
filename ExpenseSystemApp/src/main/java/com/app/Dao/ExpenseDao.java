package com.app.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Expense;

@Repository
public class ExpenseDao implements ExpenseDaoIf {

	@Autowired
	private SessionFactory session;
	
	
	@Override
	public void add(Expense expense) {
		
		session.getCurrentSession().save(expense);

	}

	@Override
	public void edit(Expense expense) {
		
		session.getCurrentSession().update(expense);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Expense> getAllExpense() {
		return session.getCurrentSession().createQuery("from ExpenseApp").list();
	}
	
	@Override
	public void delete(int id) {
		 session.getCurrentSession().delete(get(id));
		
	}

	@Override
	public Expense get(int id) {
		return (Expense)session.getCurrentSession().get(Expense.class, id);
		
	}

	@Override
	public Expense Search(int id) {
		return get(id);
		
	}

}
