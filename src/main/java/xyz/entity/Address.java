package xyz.entity;

import java.util.Date;

public class Address {
    private String uuid;
    private Date date;
    private double salary;

    public Address() {
    }

    public Address(String uuid, Date date, double salary) {
        this.uuid = uuid;
        this.date = date;
        this.salary = salary;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Address{" +
                "uuid='" + uuid + '\'' +
                ", date=" + date +
                ", salary=" + salary +
                '}';
    }
}
