package org.sonnyjava.foodlist;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FoodListController")
public class FoodListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get data from model
		List<Food> foodItems = FoodListDBUtils.getFoods();
		request.setAttribute("foodItems", foodItems);
		
		//redirect this page to view
		RequestDispatcher dispatcher = request.getRequestDispatcher("foodlist-page.jsp");
		dispatcher.forward(request, response);

	}

}
