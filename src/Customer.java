public class Customer {
    private int customerID;
    private String firstName, lastName;
    //normally you also add email, phone, birthday, etc...


    public Customer(int customerID, String firstName, String lastName) {
        setCustomerID(customerID);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return String.format("customer %d is %s %s", customerID, firstName, lastName);
    }
}


