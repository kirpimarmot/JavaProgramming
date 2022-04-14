package day31_Cunstructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon", "SDET", 90000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("------------------------------------");
        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p->  !p.isFullTime);// removes if the offer is NOT fullTime

        System.out.println("Number of Full-time Offers : "+fullTimeOffers.size());

        ArrayList<Offer> localOffers =new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("VA"));// you live in VA and this removes the offer if the offer is NOT from local area

        System.out.println("Number of Offers from local Area : "+ localOffers.size());

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p-> !p.hasBenefit || !p.hasPTO );

        System.out.println("Number of offers does not have benefits and PTO : " + offersWithBenefits.size());

        ArrayList<Offer> JobSDETOffers = new ArrayList<>(Arrays.asList(myOffers));
        JobSDETOffers.removeIf(p-> !p.jobTitle.equals("SDET"));

        System.out.println("Number of offers for SDET : " + JobSDETOffers.size());

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));
        offersWith100K.removeIf(p-> p.salary < 100000);

        System.out.println("Number of offers less then $100000 salary: "+offersWith100K.size());








    }


}
/*
2. Create a class named MyOffers:
				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */