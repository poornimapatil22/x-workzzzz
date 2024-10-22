package com.xworkz.Servlets;

import com.xworkz.DTO.FeedBackDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 5, urlPatterns = "/feedback")
public class FeedbackServlet extends HttpServlet {

    public FeedbackServlet() {
        System.out.println("Feedback servlet created!");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Fetching the form parameters
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String comments = req.getParameter("comments");


        FeedBackDTO feedbackDTO = new FeedBackDTO();


        feedbackDTO.setName(name);
        feedbackDTO.setEmail(email);
        feedbackDTO.setComments(comments);


        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();


        out.println("<html><body>");
        out.println("<h2>Feedback Submitted Successfully</h2>");
        out.println("<p>Name: " + feedbackDTO.getName() + "</p>");
        out.println("<p>Email: " + feedbackDTO.getEmail() + "</p>");
        out.println("<p>Comments: " + feedbackDTO.getComments() + "</p>");
        out.println("</body></html>");
    }
}

