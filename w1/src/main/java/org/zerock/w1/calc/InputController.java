package org.zerock.w1.calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "inputController", value = "/calc/input")
public class InputController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("InputController의 doGet 메소드 실행");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/calc/input.jsp");

        dispatcher.forward(request, response);
    }
}