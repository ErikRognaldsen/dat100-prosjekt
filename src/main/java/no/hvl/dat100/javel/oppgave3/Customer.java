package no.hvl.dat100.javel.oppgave3;

public class Customer {

    // TODO - object variables (attributes)
    int customer_id;
    String name;
    String email;
    PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.customer_id = customer_id;
        this.name = name;
        this.email = email;
        this.agreement = agreement;
    }

    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public PowerAgreementType getAgreement() {
        return agreement;
    }
    public void setAgreement(PowerAgreementType agreement) {
        this.agreement = agreement;
    }

    @Override
    public String toString() {
        String result = "";

        result += "Customer: " + customer_id + "\n";
        result += "Name: " + name + "\n";
        result += "Email: " + email + "\n";
        result += "Agreement: " + agreement + "\n";

        return result;
    }
// TODO - toString method

}
