package com.kodilla.exception.test;

public class Play {

    public static void main(String[] args) throws RouteNotFoundException {

        Flight polNiem = new Flight("Polska", "Niemcy");
        Flight angNiem = new Flight("Anglia", "Niemcy");
        Flight luksAng = new Flight("Luksemburg", "Anglia");
        Flight belAng = new Flight("Belgia", "Anglia");
        Flight belLuk = new Flight("Belgia", "Luksemburg");
        Flight lukNiem = new Flight("Luksemburg", "Niemcy");
        Flight grecLuk = new Flight("test-Exception", "Luksemburg");

       FlyingSearcher flyingSearcher = new FlyingSearcher();

       flyingSearcher.findFlight(polNiem);
       boolean availablePolNiem = flyingSearcher.findFlight(polNiem);
        System.out.println(polNiem + " Is available? - " + availablePolNiem);

        flyingSearcher.findFlight(angNiem);
        boolean availableAngNiem = flyingSearcher.findFlight(polNiem);
        System.out.println(angNiem + " Is available? - " + availableAngNiem);

        flyingSearcher.findFlight(luksAng);
        boolean availableLuksAng = flyingSearcher.findFlight(polNiem);
        System.out.println(luksAng + " Is available? - " + availableLuksAng);

        flyingSearcher.findFlight(belAng);
        boolean availableBelAng = flyingSearcher.findFlight(belAng);
        System.out.println(belAng + " Is available? - " + availableBelAng);

        flyingSearcher.findFlight(belLuk);
        boolean availableBelLuk = flyingSearcher.findFlight(belLuk);
        System.out.println(belLuk + " Is available? - " + availableBelLuk);

        flyingSearcher.findFlight(lukNiem);
        boolean availableLukNiem = flyingSearcher.findFlight(lukNiem);
        System.out.println(lukNiem + " Is available? - " + availableLukNiem);

        try {

            flyingSearcher.findFlight(grecLuk);
            boolean availableGrecLuk= flyingSearcher.findFlight(grecLuk);
            System.out.println(grecLuk + " Is available? - " + availableGrecLuk);

        }
        catch (RouteNotFoundException e){
            System.out.println("Airport does't exist, chose different! " + e);

        }
    }

}
