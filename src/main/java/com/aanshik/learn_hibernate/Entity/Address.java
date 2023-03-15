package com.aanshik.learn_hibernate.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;


    @Column(length = 50)
    private String street;

    private String city;

    private boolean isOpen;

    @Transient
    private double x;

    @Temporal(TemporalType.DATE)
    private Date addedDate;


    @Lob
    private byte[] image;

    public Address() {
    }

    public Address(int address_id, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
        this.addressId = address_id;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }


    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", isOpen=" + isOpen +
                ", addedDate=" + addedDate +
                '}';
    }

    public int getAddress_id() {
        return addressId;
    }

    public void setAddress_id(int address_id) {
        this.addressId = address_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
