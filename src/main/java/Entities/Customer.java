package Entities;

import Abstract.IEntity;
import java.time.LocalDate;

public class Customer implements IEntity
{
    public Customer (int id, String firstName, String lastName, LocalDate dateOfBirth)
    {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth =dateOfBirth;

    }
    public int Id;
    public String FirstName;
    public String LastName;
    public LocalDate DateOfBirth;
    public String NationalityId;

}
