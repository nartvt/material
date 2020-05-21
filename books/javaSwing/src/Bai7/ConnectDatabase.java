/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class ConnectDatabase {
 
    
    public static final String JDBC_USERNAME="root";
    public static final String JDBC_PASSWORD="";
    public static final String JDBC_SQL="cosodulieu";
    public static final String JDBC_DRIVER_CLASS="com.mysql.jdbc.Driver";
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/"+JDBC_SQL+"?useUnicode=true&characterEncoding=utf8";
   public Connection connect () throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER_CLASS);
        Connection conn=DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        return conn;
    }    

    public boolean timUser(String username, String password) throws ClassNotFoundException, SQLException{
        boolean tim = false;
        Connection conn = this.connect();
        Statement statement = conn.createStatement();
       // String sql = "SELECT* FROM user WHERE username = '" + username + "' and password = '"+password+"'";
        String sql="SELECT * FROM user WHERE username like'" + username + "' and password like'" + password + "'";
        ResultSet resultSet = statement.executeQuery(sql);
        if(resultSet.next())
        {
            tim=true;
        }
        return tim;
    }
    public void addnewAccount(Login login) throws ClassNotFoundException, SQLException
    {
        Connection conn = this.connect();
        Statement statement = conn.createStatement();
        String sql="INSERT INTO user(username,password) VALUES('"+login.userName+"','"+login.passsWord+"')";
        statement.executeUpdate(sql);
    }
    public void addnewProduct(Product product) throws ClassNotFoundException, SQLException
    {
        Connection conn = this.connect();
        Statement statement = conn.createStatement();
        String sql="INSERT INTO product(Name,Price,Amount)VALUES('"+product.productName+"',"+product.productPrice+","+product.amount+")";
        statement.executeUpdate(sql);
    }
    public List<Product>SearchProduct(String productName) throws ClassNotFoundException, SQLException
    {
        List<Product> listProduct=new ArrayList<>();
        Connection conn = this.connect();
        Statement statement = conn.createStatement();
        String sql="SELECT * FROM product WHERE Name like '%"+productName+"%'";
        ResultSet resultset=statement.executeQuery(sql);
        while(resultset.next())
        {
            Product pro=new Product(resultset.getString("Name"), resultset.getDouble("Price"),resultset.getInt("Amount"));
            listProduct.add(pro);
        }
        return listProduct;
        
    }
    public boolean SearchDelete(String productName) throws ClassNotFoundException, SQLException{
        boolean tim = false;
        Connection conn = this.connect();
        Statement statement = conn.createStatement();
       // String sql = "SELECT* FROM user WHERE username = '" + username + "' and password = '"+password+"'";
        String sql="SELECT * FROM product WHERE Name ='" + productName + "'";
        ResultSet resultSet = statement.executeQuery(sql);
        if(resultSet.next())
        {
            tim=true;
        }
        return tim;
    }
    public void DeleteProduct(String productName) throws ClassNotFoundException, SQLException
    {
         Connection conn = this.connect();
         Statement statement = conn.createStatement();
         String sql="DELETE FROM product WHERE Name='"+productName+"'";
         statement.executeUpdate(sql);
    }
    public void closeConnect() throws ClassNotFoundException, SQLException
    {
        Connection conn=this.connect();
        conn.close();
    }
}
