package no.hvl.dat100.javel.oppgave1;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave1.DailyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        DailyPower.printPowerPrices(powerprices_day);
        System.out.println("==============");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println("==============");
        double dayPowerUsage = DailyPower.computePowerUsage(powerusage_day);
        System.out.println(dayPowerUsage);
        System.out.println("==============");
        double computeSpotPrice = DailyPower.computeSpotPrice(powerusage_day,  powerprices_day);
        System.out.println(computeSpotPrice);
        System.out.println("==============");

        double support = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.println(support);

        System.out.println("==============");
        double norgesPris = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.println(norgesPris);

        System.out.println("==============");
        double peakUsage = DailyPower.findPeakUsage(powerusage_day);
        System.out.println(peakUsage);

        System.out.println("==============");
        double avrPwr = DailyPower.findAvgPower(powerusage_day);
        System.out.println(avrPwr);

    }
}
