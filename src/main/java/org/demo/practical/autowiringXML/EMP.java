package org.demo.practical.autowiringXML;

import org.springframework.beans.factory.annotation.Autowired;

public class EMP {

    public Address address;

    public EMP(Address address) {
        this.address = address;
    }

    public Address getAdress() {
        return address;
    }

    public EMP() {
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EMP{" +
                "address=" + address +
                '}';
    }
}
