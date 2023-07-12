package org.example.dao;

import org.example.db.DbConnection;
import org.example.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

    public List<Customer> getCustomers(){
        List<Customer> customers= new ArrayList<>();
        Connection connection= DbConnection.getConnection();
        try
        {
            Statement stmt=connection.createStatement();
            ResultSet rs= stmt.executeQuery("SELECT * FROM customers");
            while (rs.next()){
                Customer customer= new Customer();
                customer.setId(rs.getInt("id"));
                customer.setFirstname(rs.getString("firstname"));
                customer.setLastname(rs.getString("lastname"));
                customer.setAge(rs.getInt("age"));
                customers.add(customer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customers;
    }

    public Customer createCustomer(Customer customer){
        Connection connection= DbConnection.getConnection();
        try {
            String query="INSERT INTO customers (firstname,lastname,age) VALUES (?,?,?)";
            PreparedStatement pstmt= connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1,customer.getFirstname());
            pstmt.setString(2, customer.getLastname());
            pstmt.setInt(3,customer.getAge());
            int affectedRows= pstmt.executeUpdate();
            if(affectedRows>0){
                try (ResultSet rs= pstmt.getGeneratedKeys()){
                    if(rs.next())
                    {
                        customer.setId(rs.getInt(1));
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customer;
    }

    public void  updateCustomer(Customer customer) {
        Connection connection = DbConnection.getConnection();

        try {
            String query = "UPDATE customers SET firstname=?, lastname=?,age=? WHERE id=?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, customer.getFirstname());
            pstmt.setString(2, customer.getLastname());
            pstmt.setInt(3, customer.getAge());
            pstmt.setInt(4, customer.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

     public  void deleteCustomer(int id){
        Connection connection=DbConnection.getConnection();
        try
        {
            String query= "DELETE FROM customers WHERE id=?";
            PreparedStatement pstmt=connection.prepareStatement(query);
            pstmt.setInt(1,id);
            pstmt.executeUpdate();

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
     }

     public Customer getCustomerById(int id) {
         Connection connection = DbConnection.getConnection();
         try {
             PreparedStatement pstmt = connection.prepareStatement("Select * FROM customers WHERE id=?");
             pstmt.setInt(1,id);
             ResultSet rs= pstmt.executeQuery();
             if (rs.next()){
                 return  new Customer(rs.getInt("id"),
                         rs.getString("firstname"),
                         rs.getString("lastname"),
                         rs.getInt("age"));
             }
             else {
                 return null;
             }

         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }
}
