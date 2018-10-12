package fr.dawan.appliweb.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dawan.appliweb.beans.Event;
import fr.dawan.appliweb.dao.JsonTools;

@WebServlet("/OpenDataController")
public class OpenDataController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<Event> events = JsonTools.importAllEventsFromJson();
			req.setAttribute("events", events);
			req.getRequestDispatcher("events.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
	
}