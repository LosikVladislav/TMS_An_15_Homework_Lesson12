package part1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Objects;

public class Client {
    private String name;
    private String passportNumber;
    private long age;
    private LocalDate registrationDate;
    private ArrayList<Order> listOrder;

    public Client(String name, String passportNumber, long age, LocalDate registrationDate) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.age = age;
        this.registrationDate = registrationDate;
        listOrder = new ArrayList<>();
    }

    public void addOrder(Order order){
        listOrder.add(order);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", age=" + age +
                ", registrationDate=" + registrationDate +
                ", listOrder=" + listOrder +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name) && Objects.equals(passportNumber, client.passportNumber) && Objects.equals(registrationDate, client.registrationDate) && Objects.equals(listOrder, client.listOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passportNumber, age, registrationDate, listOrder);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public ArrayList<Order> getListOrder() {
        return listOrder;
    }

    public void setListOrder(ArrayList<Order> listOrder) {
        this.listOrder = listOrder;
    }
}
