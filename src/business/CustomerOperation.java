package business;

import beans.Customer;

import java.util.ArrayList;

public class CustomerOperation {

    ArrayList<Customer> customerArrayList;

    public CustomerOperation(){
        customerArrayList = new ArrayList<Customer>();
    }
    public void addCustomer(Customer customer){
        customerArrayList.add(customer);
    }

    public void removeCustomer(int id){

        int idx = -1;
        for(int i = 0; i < customerArrayList.size() ; ++i){
            if(customerArrayList.get(i).getid()==id){
                idx = i;
            }
        }
        customerArrayList.remove(idx);
    }

    public void updateCustomer(Customer customer){

        for(int i = 0 ; i < customerArrayList.size() ; ++i){

            if(customerArrayList.get(i).getid()==customer.getid())
                customerArrayList.add(i , customer);
        }
    }
    public String getCustomerInfo(int id){

        for(Customer customer : customerArrayList){
            if(customer.getid()==id){
                return customer.toString();
            }
        }
        return "Customer with " + id + "not found .";
    }
}
