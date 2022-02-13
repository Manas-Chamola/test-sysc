package com.example.servingwebcontent;


import java.util.ArrayList;
import java.util.List;


public class AddressBook {

    private List<BuddyInfo> buds = new ArrayList<>();

    public void setBuds(List<BuddyInfo> buds) {
        this.buds = buds;
    }

    public void addBuddy(BuddyInfo bud) {
        buds.add(bud);
    }

    public void addBuddy(String name) {
        BuddyInfo bud = new BuddyInfo();
        bud.setName(name);
        buds.add(bud);
    }

    public boolean delBuddy(BuddyInfo bud) {
        return buds.remove(bud);
    }

    public List<BuddyInfo> getBuds() {
        return buds;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "addresses=" + buds +
                '}';
    }
}
