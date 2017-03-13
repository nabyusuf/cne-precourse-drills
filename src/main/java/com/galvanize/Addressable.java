package com.galvanize;

import java.util.List;

/**
 * Created by NABIHAMAKARIM.YUSUF on 3/13/2017.
 */
public interface Addressable {
    public List<Address> getAddresses();
    public void addAddress(Address address);
}
