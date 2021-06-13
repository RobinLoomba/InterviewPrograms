package com.testing;

public  class UpcastingConcept {

    float rateOfInterest;
    float rateOfInterest()
    {
        return 0;
    }
     static class IciciBank extends UpcastingConcept
    {
        float rateOfInterest()
        {
            return 10.0F;
        }
        void displayBankName()
        {
            System.out.println("Bank Name is Icici Bank");
        }

    }
    static class Axis extends UpcastingConcept
    {
        float rateOfInterest()
        {
            return 12.5F;
        }
    }

    public static void main(String[] args) {
        UpcastingConcept up;
        up = new IciciBank();
       System.out.println("Rate of interest of Icici bank is "+ up.rateOfInterest());

    }
}
