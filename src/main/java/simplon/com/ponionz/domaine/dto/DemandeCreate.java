package simplon.com.ponionz.domaine.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class DemandeCreate {

    private long amount;
    private long apport;

    private int period;

    private double interestRate;
    private double insuranceRate;
    private boolean jobLossInsuranceTaken;
    private int jobLossInsuranceRate;
    private LocalDate date;
    private LocalTime time;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getApport() {
        return apport;
    }

    public void setApport(long apport) {
        this.apport = apport;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    public boolean isJobLossInsuranceTaken() {
        return jobLossInsuranceTaken;
    }

    public void setJobLossInsuranceTaken(boolean jobLossInsuranceTaken) {
        this.jobLossInsuranceTaken = jobLossInsuranceTaken;
    }

    public int getJobLossInsuranceRate() {
        return jobLossInsuranceRate;
    }

    public void setJobLossInsuranceRate(int jobLossInsuranceRate) {
        this.jobLossInsuranceRate = jobLossInsuranceRate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public DemandeCreate() {

    }




}
