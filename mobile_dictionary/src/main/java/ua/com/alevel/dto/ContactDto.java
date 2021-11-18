package ua.com.alevel.dto;

import ua.com.alevel.entity.Address;
import ua.com.alevel.entity.Contact;
import ua.com.alevel.entity.Country;

public class ContactDto {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private Country country;
    private String city;

    public ContactDto() { }

    public ContactDto(Contact contact) {
        this.firstName = contact.getFirstName();
        this.lastName = contact.getLastName();
        this.mobileNumber = contact.getMobileNumber();
        Address address = contact.getAddress();
        if (address != null) {
            this.country = address.getCountry();
            this.city = address.getCity();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
