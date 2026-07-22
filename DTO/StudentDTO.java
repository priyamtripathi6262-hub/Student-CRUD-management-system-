package com.example.demo.DTO;

public class StudentDTO {

    private String name;
    private String email;
    private String mobileNumber;
    private String rollNumber;
    private String address;
    private String branch;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    public String getRollNumber() { return rollNumber; }
    public void setRollNumber(String rollNumber) { this.rollNumber = rollNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }
}