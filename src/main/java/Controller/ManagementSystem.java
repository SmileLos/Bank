package Controller;

import java.sql.*;

import Model.entity.Account;
import Model.entity.container.AccountList;
import Model.entity.User;
import Model.entity.container.UserList;

public class ManagementSystem {
    private static Connection con;
    private static ManagementSystem instance;

    private ManagementSystem() throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            con = DriverManager.getConnection(url, "root", "ViewSonicVA2");
        } catch (ClassNotFoundException e) {
            throw new Exception(e);
        } catch (SQLException e){
            throw new Exception(e);
        }
    }
    
    public static synchronized ManagementSystem getInstance() throws Exception {
        if (instance == null){
            instance = new ManagementSystem();
        }
        return instance;
    }
    
    public static UserList getUsers() throws SQLException {
        UserList users = new UserList();

        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT userId, name,"
                    + " sureName FROM user");
            while (rs.next()) {
                User us = new User();
                us.setUserID(rs.getInt(1));
                us.setUserName(rs.getString(2));
                us.setUserSureName(rs.getString(3));

                users.add(us);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        }
        return users;
    }
    
    public static AccountList getAccounts() throws SQLException {
        AccountList accs = new AccountList();

        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT accountId, account," +
                    " userId FROM account");
            while (rs.next()) {
                Account acc = new Account();
                acc.setAccountID(rs.getInt(1));
                acc.setAccount(rs.getInt(2));
                acc.setUserID(rs.getInt(3));

                accs.add(acc);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        }
        return accs;
        
    }
}
