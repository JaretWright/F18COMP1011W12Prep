import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExperiment {

    public static void main(String[] args)
    {
        Customer customer1 = new Customer(1,"Anita","Job");
        Customer customer2 = new Customer(2,"Fred","Flintstone");

        HashMap<Customer, ArrayList<Order>> orders = new HashMap<>();

        orders.put(customer1, new ArrayList<Order>());
        orders.get(customer1).add(new Order(59.99, 2, "Windex"));
        orders.get(customer1).add(new Order(16.99, 5, "Kleenex"));
        orders.get(customer1).add(new Order(100.99,1, "TV"));
        orders.put(customer2, new ArrayList<Order>());
        orders.get(customer2).add(new Order(100.87, 1, "power supply"));

        Customer topCustomer = getTopCustomer(orders);
        System.out.printf("The top customer is: %s, they spent $%.2f%n", topCustomer,
                                                getTotalSpent(topCustomer, orders));
    }

    public static Customer getTopCustomer(HashMap<Customer, ArrayList<Order>> orderHashMap)
    {
        if (orderHashMap.size() == 0)
            return null;

        Customer topCustomer = (Customer) orderHashMap.keySet().toArray()[0];
        double topSpend = getTotalSpent(topCustomer, orderHashMap);

        for (Customer customer:orderHashMap.keySet())
        {
            double customerSpend = getTotalSpent(customer, orderHashMap);
            if (topSpend < customerSpend)
            {
                topCustomer = customer;
                topSpend = customerSpend;
            }
        }
        return topCustomer;
    }

    public static double getTotalSpent(Customer customer, HashMap<Customer, ArrayList<Order>> hashMap)
    {
        double total = 0;

        for (Order order: hashMap.get(customer))
        {
            total += order.getPrice()*order.getUnitsSold();
        }
        return total;
    }

    public static double getTotalSpent2(Customer customer, HashMap<Customer, ArrayList<Order>> hashMap)
    {
        return hashMap.get(customer).stream()
                .mapToDouble(order -> order.getPrice()*order.getUnitsSold())
                .sum();

//        return hashMap.get(customer).stream()
//                .mapToDouble( Order::getPrice)
//                .sum();
    }

}
