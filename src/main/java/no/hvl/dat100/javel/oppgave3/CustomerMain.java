package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer kunde = new Customer("Knut", "knut@knutsen.no", 1337, PowerAgreementType.NORGESPRICE);
        System.out.println(kunde.toString());

        kunde.customer_id = 1001;
        kunde.agreement = PowerAgreementType.NORGESPRICE;
        kunde.email = "Knut1@knutsen.no";
        kunde.name = "Knut1";
        System.out.println(kunde.toString());
    }
}
