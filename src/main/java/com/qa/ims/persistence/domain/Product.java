package com.qa.ims.persistence.domain;


public class Product {

    private Long id;
    private String productName;
    private Double productPrice;

    public Product (String productName, Double productPrice) {
        this.setProductName(productName);
        this.setProductPrice(productPrice);
        }

    public Product (Long id, String productName, String productPrice) {
        this.setId(id);
        this.setProductName(productName);
        this.setProductPrice(productPrice);
    }
    //	Zero argument constructor
    public product() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Id:" + id + " Product Name:" + productName + " Last Name:" + lastName + " Email:" + email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productName == null) ? 0 : productName.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false; product
                other = (product
                ) obj;
        if (getproductName() == null) {
            if (other.getProductName() != null)
                return false;
        } else if (!getproductName().equals(other.getProductName()))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }

}
