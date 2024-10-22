package com.xworkz.Servlets;

import com.xworkz.DTO.MovieTicketDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 5, urlPatterns = "/bookTicket")
public class MovieTicketServlet extends HttpServlet {

    public MovieTicketServlet() {
        System.out.println("Movie Ticket servlet created!");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Fetching the form parameters
        String theatreName = req.getParameter("theatreName");
        String seatType = req.getParameter("seatType");
        String dateTime = req.getParameter("dateTime");
        String totalTicket = req.getParameter("totalTicket");


        int totalTicketQuantity = Integer.parseInt(totalTicket);


        MovieTicketDTO movieTicket = new MovieTicketDTO(theatreName, seatType, dateTime, totalTicketQuantity);


        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();


        out.println("<html><body>");
        out.println("<h2>Ticket Booking Confirmed</h2>");
        out.println("<p>Theatre: " + movieTicket.getTheatreName() + "</p>");
        out.println("<p>Seat Type: " + movieTicket.getSeatType() + "</p>");
        out.println("<p>Date & Time: " + movieTicket.getDateTime() + "</p>");
        out.println("<p>Total Ticket Quantity: " + movieTicket.getTotalTicketQuantity() + "</p>");
        out.println("</body></html>");
    }
}
