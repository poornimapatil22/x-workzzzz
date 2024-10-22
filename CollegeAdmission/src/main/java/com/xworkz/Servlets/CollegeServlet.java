package com.xworkz.Servlets;

import com.xworkz.DTO.CollegeDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 4,urlPatterns = "/join")
public class CollegeServlet extends HttpServlet {

    public CollegeServlet(){
        System.out.println("college servlet created!!");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CollegeDTO collegeDTO=new CollegeDTO();
        collegeDTO.setName(req.getParameter("name"));
        collegeDTO.setEmail(req.getParameter("email"));
        collegeDTO.setMobNo(Double.valueOf(req.getParameter("mobNo")));
        collegeDTO.setAdress(req.getParameter("adress"));
        collegeDTO.setMotherName(req.getParameter("motherName"));
        collegeDTO.setFatherName( req.getParameter("fatherName"));
        collegeDTO.setPercentage(Double.parseDouble(req.getParameter("percentage")));
        collegeDTO.setCourse(req.getParameter("course"));
        collegeDTO.setAge(Integer.parseInt(req.getParameter("age")));

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        out.println("<h2>College Registration Successful</h2>");
        out.println("<p>Name: " + collegeDTO.getName() + "</p>");
        out.println("<p>Email: " + collegeDTO.getEmail() + "</p>");
        out.println("<p>Mobile No: " + collegeDTO.getMobNo() + "</p>");
        out.println("<p>Address: " + collegeDTO.getAdress() + "</p>");
        out.println("<p>Mother's Name: " + collegeDTO.getMotherName() + "</p>");
        out.println("<p>Father's Name: " + collegeDTO.getFatherName() + "</p>");
        out.println("<p>Percentage: " + collegeDTO.getPercentage() + "</p>");
        out.println("<p>Course: " + collegeDTO.getCourse() + "</p>");
        out.println("<p>Age: " + collegeDTO.getAge() + "</p>");
        out.println("</body></html>");


    }
}
