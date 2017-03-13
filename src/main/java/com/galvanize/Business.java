package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NABIHAMAKARIM.YUSUF on 3/13/2017.
 */
public class Business implements Addressable {
    private ArrayList<Address>  addresses = new ArrayList<Address>();

    public String getName() {
        return name;
    }

    private String name;

    public Business(String name){
        this.name = name;
    }

    public List<Address> getAddresses() {

        return addresses;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }
}
