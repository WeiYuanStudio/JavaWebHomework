package club.piclight.homework.javaweb.Model;

public class TaxBean {
    private Double income;
    private Double tax;

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
        double taxPart = income - 1600;
        if(taxPart <= 500){
            this.tax = taxPart * 0.05 - 0;
        } else if (taxPart <= 3000) {
            this.tax = taxPart * 0.1 - 25;
        } else if (taxPart <= 5000) {
            this.tax = taxPart * 0.15 - 125;
        } else {
            this.tax = -1D;
        }
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
