package it.develhope;

import java.util.Objects;

public class Smartphone implements Cloneable{

    public String brandName;
    public String modelName;
    /**
     * Battery of the smartphone [mAh]
     */
    public int batterymAh;
    /**
     * Price of the smartphone at a producer [€]
     */
    SmartphonePrice producerPrice;
    /**
     * Price of the smartphone at a retailer [€]
     */
    SmartphonePrice retailPrice;

    public Smartphone(String brand, String model, int battery, SmartphonePrice producerPrice, SmartphonePrice retailPrice){
        this.brandName = brand;
        this.modelName = model;
        this.batterymAh = battery;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "Smartphone { " +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice€=" + producerPrice.priceInEuros +
                ", retailPrice€=" + retailPrice.priceInEuros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone)super.clone();
        clonedSmartphone.retailPrice = this.retailPrice;
        clonedSmartphone.producerPrice = this.producerPrice;
        return clonedSmartphone;
    }
}
