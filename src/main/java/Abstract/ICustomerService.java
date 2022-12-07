package Abstract;

import Entities.Customer;

public interface ICustomerService
{
    void Save(Customer customer) throws Exception;



    void StarPoint(Customer customer);
}
