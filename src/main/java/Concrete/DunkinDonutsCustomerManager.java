package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;


public class DunkinDonutsCustomerManager extends BaseCustomerManager {
    @Override
    public void Save(Customer customer) throws Exception
    {
        super.Save(customer);
    }
}
