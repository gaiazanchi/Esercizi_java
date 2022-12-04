package it.develhope;

public class Start {

    public static void main(String[] args) {

        SmartphonePrice priceRetailer1 = new SmartphonePrice("retailer", 1233.8);
        SmartphonePrice priceRetailer2 = new SmartphonePrice("retailer", 877.9);

        SmartphonePrice priceProducer1 = new SmartphonePrice("producer", 1117.8);
        SmartphonePrice priceProducer2 = new SmartphonePrice("producer", 667.9);

        Smartphone smartphone1 = new Smartphone("Apple", "iPhone 11", 3110, priceProducer1, priceRetailer1);
        String smartphone1Details = smartphone1.toString();
        System.out.println(smartphone1Details);

        Smartphone smartphone2 = new Smartphone("Samsung", "A12", 2367, priceProducer2, priceRetailer2);
        String smartphone2Details = smartphone2.toString();
        System.out.println(smartphone2Details);

        boolean out = smartphone1.equals(smartphone2);
        System.out.println("Is smartphone1 equal to smartphone2? " + out);

        try{
            Smartphone clonedSmartphone = smartphone2.clone();
            clonedSmartphone.toString();
            boolean out2 = smartphone2.equals(clonedSmartphone);
            System.out.println("Is smartphone2 equal to clonedSmartphone? " + out2);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error");
        }

    }

}
