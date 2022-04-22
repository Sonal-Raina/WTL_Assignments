package com.ebookshop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

public class servlet extends HttpServlet {
    static Connection con;
    static Statement st;

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html; charset-UTF-8");
        PrintWriter out = response.getWriter();

        try {
            String url = "jdbc:mysql://127.0.0.1:3306/wtl5";
            String uname = "root";
            String pass = "4749274";
            out.println("<html>");
            out.println("<body>");
            String user = request.getParameter("user");
            out.println("<h2> Welcome " + user + "</h2>");
            out.println("<h3>connecting to database</h3>");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, uname, pass);
            out.println("<h3>connection successful</h3>");

            st = con.createStatement();
            String statement = "select * from ebookshop";
            ResultSet state = st.executeQuery(statement);

            out.println("<table><tr><th>Id\t</th><th>Title\t</th><th>Author\t</th><th>Price\t</th><th>Quantity\t</th></tr>");

            while (state.next()) {
                out.println("<tr><td>" + state.getInt(1) + "\t</td>" + "<td>" + state.getString(2) + "\t</td>" + "<td>" + state.getString(3) + "\t</td>" + "<td>" + state.getInt(4) + "\t</td>" + "<td>" + state.getInt(5) + "\t</td></tr>");
            }

            out.println("</table></body></html>");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
