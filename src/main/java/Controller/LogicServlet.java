package Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import Model.logic.CountRichestUser;
import Model.logic.CountSumOfAccounts;
import Model.logic.FindUserByID;

import Model.entity.container.AccountList;
import Model.entity.container.UserList;

import Controller.ManagementSystem;

public class LogicServlet extends HttpServlet{
    protected void processRequest (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception{
        ManagementSystem.getInstance();

        AccountList accountList = ManagementSystem.getAccounts();
        UserList userList = ManagementSystem.getUsers();

        if (request.getParameter("richestUser") != null){
            int richUserID = CountRichestUser.calculateRichestUser(accountList);
            String userName = FindUserByID.getUserName(richUserID, userList);

            request.setAttribute("richUser", userName);
        }
        if (request.getParameter("sumAccs") != null){
            int sumAccs = CountSumOfAccounts.calculateTotalAccount(accountList);
            request.setAttribute("totalSum", sumAccs);
        }
        this.getServletContext().getRequestDispatcher("index.jsp").forward(request, response);

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
