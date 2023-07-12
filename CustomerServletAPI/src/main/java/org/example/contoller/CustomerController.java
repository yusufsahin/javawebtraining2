package org.example.contoller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.jetty.servlet.ServletHolder;
import org.example.dao.CustomerDao;
import org.example.model.Customer;
import org.postgresql.jdbc.PreferQueryMode;

import java.io.IOException;

public class CustomerController extends HttpServlet {

    private CustomerDao customerDao= new CustomerDao();
    private ObjectMapper mapper= new ObjectMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
       // res.getWriter().write("Hello Web");
        res.setContentType("application/json");
        int id= extractIdFromPath(req);

        if(id==-1)
        {
            res.getWriter().write(mapper.writeValueAsString(customerDao.getCustomers()));
        }else {
           Customer customer= customerDao.getCustomerById(id);
           if(customer==null)
           {
               res.sendError(HttpServletResponse.SC_NOT_FOUND,"No customer found with id: "+id);
           }else
           {
               res.getWriter().write(mapper.writeValueAsString(customer));
           }
        }
    }
    @Override
    protected  void  doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        Customer newCustomer= mapper.readValue(req.getReader(),Customer.class);
        newCustomer=customerDao.createCustomer(newCustomer);
        res.setContentType("application/json");
        res.setStatus(HttpServletResponse.SC_OK);
    }
    @Override
    protected void doPut(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        int id= extractIdFromPath(req);
        if (id==-1){
            res.sendError(HttpServletResponse.SC_BAD_REQUEST,"No Customer id Provided");
            return;
        }

        Customer existingCustomer= mapper.readValue(req.getReader(),Customer.class);
        customerDao.updateCustomer(existingCustomer);
        res.setStatus(HttpServletResponse.SC_OK);
    }

    @Override
    protected void doDelete(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
        int id= extractIdFromPath(req);
        if (id==-1){
            res.sendError(HttpServletResponse.SC_BAD_REQUEST,"No customer id provided");
            return;
        }
        customerDao.deleteCustomer(id);
        res.setStatus(HttpServletResponse.SC_OK);

    }

    private int extractIdFromPath(HttpServletRequest req) {
        String path = req.getPathInfo();
        if (path == null || path.equals("/")) {
            return -1;
        } else {
            try {
                return Integer.parseInt(path.substring(1));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid customer id: " + path.substring(1));
            }
        }
    }
}
