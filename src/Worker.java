public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hourlyPayRate * hoursWorked;
        } else {
            return (40 * hourlyPayRate) + ((hoursWorked - 40) * hourlyPayRate * 1.5);
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return "Regular Pay (" + hoursWorked + " hrs): $" + calculateWeeklyPay(hoursWorked);
        } else {
            double regularPay = 40 * hourlyPayRate;
            double overtimePay = (hoursWorked - 40) * hourlyPayRate * 1.5;
            return "Regular Pay (40 hrs): $" + regularPay + ", Overtime Pay (" + (hoursWorked - 40) + " hrs): $" + overtimePay + ", Total: $" + (regularPay + overtimePay);
        }
    }
}
