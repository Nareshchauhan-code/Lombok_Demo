package com.lombok;

public class CustomerTest {

    public static void main(String[] args) {

        Customer_Demo customer_demo=
                new Customer_Demo("Naresh",30,"Ghaziabad",true,"10-09-1990");

        System.out.println(customer_demo);

        System.out.println(customer_demo.getAge()+"  "+ customer_demo.getCity());

       customer_demo.setAge(30);

        System.out.println(customer_demo.getAge());

    }

}
