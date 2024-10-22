package com.xworkz.Servlets;

import com.xworkz.DTO.CricketTicketDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 5, urlPatterns = "/bookCricketTicket")
public class CricketTicketServlet extends HttpServlet {

    public CricketTicketServlet() {
        System.out.println("Cricket Ticket servlet created!");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String groundName = req.getParameter("groundName");
        String customerName = req.getParameter("customerName");
        String customerEmail = req.getParameter("customerEmail");
        String seatType = req.getParameter("seatType");
        String numberOfTickets = req.getParameter("numberOfTickets");


        int tickets = Integer.parseInt(numberOfTickets);


        CricketTicketDTO cricketTicketDTO = new CricketTicketDTO();


        cricketTicketDTO.setGroundName(groundName);
        cricketTicketDTO.setCustomerName(customerName);
        cricketTicketDTO.setCustomerEmail(customerEmail);
        cricketTicketDTO.setSeatType(seatType);
        cricketTicketDTO.setNumberOfTickets(tickets);


        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();


        out.println("<html><body>");
        out.println("<h2>Cricket Ticket Booking Confirmed</h2>");
        out.println("<p>Ground Name: " + cricketTicketDTO.getGroundName() + "</p>");
        out.println("<p>Customer Name: " + cricketTicketDTO.getCustomerName() + "</p>");
        out.println("<p>Customer Email: " + cricketTicketDTO.getCustomerEmail() + "</p>");
        out.println("<p>Seat Type: " + cricketTicketDTO.getSeatType() + "</p>");
        out.println("<p>Number of Tickets: " + cricketTicketDTO.getNumberOfTickets() + "</p>");
        out.println("</body></html>");
    }
}

