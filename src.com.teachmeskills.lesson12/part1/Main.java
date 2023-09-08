package part1;

import part1.model.Client;
import part1.model.Order;
import part1.util.UTIL;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static part1.util.UTIL.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Vladislav", CLIENT_1_PN, 24, LocalDate.of(2014,9,29));
        Client client2 = new Client("Artem", CLIENT_2_PN, 18, LocalDate.of(2018,6,13));
        Client client3 = new Client("Denis", CLIENT_3_PN, 24, LocalDate.of(2014,9,23));
        Client client4 = new Client("Vladimir", CLIENT_4_PN, 23, LocalDate.of(2015,4,14));

        Order order1 = new Order("phone", 1500.50, "Description 1");
        Order order2 = new Order("car", 7000.200, "Description 2");
        Order order3 = new Order("bike", 1400.5, "Description 3");
        Order order4 = new Order("notebook", 800.3, "Description 4");

        client1.addOrder(order1);
        client1.addOrder(order2);
        client2.addOrder(order2);
        client3.addOrder(order3);
        client4.addOrder(order4);

        Map<String, Client> map = new HashMap<>();
        map.put(CLIENT_1_PN, client1);
        map.put(CLIENT_2_PN,client2);
        map.put(CLIENT_3_PN,client3);
        map.put(CLIENT_4_PN,client4);
        for(Map.Entry<String, Client> entry : map.entrySet()){
            System.out.println("Client data" + "\n");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getName());
            System.out.println(entry.getValue().getAge());
            System.out.println(entry.getValue().getRegistrationDate());
            System.out.println( "\n" + "customer orders" + "\n");
            for(Order order: entry.getValue().getListOrder()){
                System.out.println(order.getName());
                System.out.println(order.getPrice());
                System.out.println(order.getDescription());
                System.out.println("___________");
            }
        }
        System.out.println(map.values());
        System.out.println(map.keySet());

        Iterator<Map.Entry<String, Client>>iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("Client data" + "\n");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getName());
            System.out.println(entry.getValue().getAge());
            System.out.println(entry.getValue().getRegistrationDate());
            System.out.println( "\n" + "customer orders" + "\n");
            for(Order order: entry.getValue().getListOrder()){
                System.out.println(order.getName());
                System.out.println(order.getPrice());
                System.out.println(order.getDescription());
                System.out.println("___________");
            }
        }
    }
}
