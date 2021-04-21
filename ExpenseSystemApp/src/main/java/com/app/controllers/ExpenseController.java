package com.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Expense;
import com.app.service.ExpenseServiceIf;

@Controller
public class ExpenseController {

	@Autowired
	private ExpenseServiceIf expenseService;
	
	@RequestMapping("/")
	public String processExp(Model model) {
		
		Expense expense=new Expense();
		model.addAttribute("expense", expense);
		
		model.addAttribute("expenseList", expenseService.getAllExpense());
		
		return "addExpense";
		
	}
	
	//another way to use ModelAtribute but two objects should be there that's why avoided
	@RequestMapping(value = "/processExpense",method = RequestMethod.POST)
	public String doprocessExp(@RequestParam Map<String, String> map,Model model) {
		
		
		
		String prodName = map.get("productname");
		
		String category = map.get("category");
		
		double price = Double.parseDouble(map.get("price"));
		
		int expenseId = Integer.parseInt(map.get("expenseId"));
		
		Expense resultExpense = new Expense(expenseId,prodName,category,price);
		
		String action = map.get("action");
		
		switch (action.toLowerCase()) {
		case "add":
			expenseService.add(resultExpense);
			break;
		case "edit":
			expenseService.edit(resultExpense);
			break;
			
		case "delete":
			expenseService.delete(resultExpense.getExpenseId());
			break;
			
		case "search":
			expenseService.Search(resultExpense.getExpenseId());
			break;

		default:
			break;
		}
		
		model.addAttribute("expense",resultExpense);
		
		model.addAttribute("expenseList", expenseService.getAllExpense());
		
		
		return "addExpense";
	}
	
	
	
	
	
}
