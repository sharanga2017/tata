package simplon.com.ponionz.domaine.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class DemandeCreate {

    private int period;

    private double interestRate;
    private double insuranceRate;
    private boolean jobLossInsuranceTaken;
    private int jobLossInsuranceRate;
    private LocalDate date;
    private LocalTime time;

    public DemandeCreate() {

    }

    @Override
    public String toString() {
	return "DemandeCreate [period=" + period + ", interestRate=" + interestRate + ", insuranceRate=" + insuranceRate
		+ ", jobLossInsuranceTaken=" + jobLossInsuranceTaken + ", tauxJobLossInsurance=" + jobLossInsuranceRate
		+ ", date=" + date + ", time=" + time + ", getDate()=" + getDate() + ", getTime()=" + getTime()
		+ ", getPeriod()=" + getPeriod() + ", getInterestRate()=" + getInterestRate() + ", getInsuranceRate()="
		+ getInsuranceRate() + ", isJobLossInsuranceTaken()=" + isJobLossInsuranceTaken()
		+ ", getTauxJobLossInsurance()=" + getTauxJobLossInsurance() + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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

    public int getTauxJobLossInsurance() {
	return jobLossInsuranceRate;
    }

    public void setTauxJobLossInsurance(int tauxJobLossInsurance) {
	this.jobLossInsuranceRate = tauxJobLossInsurance;
    }
}
