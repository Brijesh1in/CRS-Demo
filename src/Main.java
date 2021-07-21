import beans.Customer;
import business.CustomerOperation;

public class Main {

    public static void main(String [] args){

        CustomerOperation ops = new CustomerOperation();
        ops.addCustomer(new Customer(1 , "LOL" , "ROFL" , 83989));
        ops.addCustomer(new Customer(2 , "Sherlock" , "Baker Street" , 211233));
        System.out.println(ops.getCustomerInfo(2));
        ops.updateCustomer(new Customer(1 , "Testing" , "Home" , 9838928));
        System.out.println(ops.getCustomerInfo(1));
    }
}
