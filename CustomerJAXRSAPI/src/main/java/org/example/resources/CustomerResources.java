package org.example.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.dao.CustomerDao;
import org.example.model.Customer;

import java.util.List;

@Path("/api/customers")
public class CustomerResources {

    private CustomerDao customerDao= new CustomerDao();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getAllCustomers()
    {
        return customerDao.getAllCustomers();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@PathParam("id") int id){
        return  customerDao.getCustomerById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Customer creatCustomer(Customer customer)
    {
       return customerDao.createCustomer(customer);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void  updateCustomer(@PathParam("id") int id,Customer customer){
        if(customerDao.getCustomerById(id)!=null)
        {
            customerDao.updateCustomer(customer);
        }
    }

    @DELETE
    @Path("/{id}")
    public  void deleteCustomer(@PathParam("id") int id)
    {
        customerDao.deleteCustomerById(id);
    }
}
