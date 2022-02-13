package com.example.servingwebcontent;

import java.util.Objects;

public class BuddyInfo {

    private String name = null;
    private String address = null;

    public BuddyInfo(){}

    public BuddyInfo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuddyInfo buddyInfo = (BuddyInfo) o;
        return name.equals(buddyInfo.name) && Objects.equals(address, buddyInfo.address);
    }

    @Override
    public String toString() {
        return "BuddyInfo{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
}
