package miniTest2;

public class EmployeePartTime extends Employee{
    private double workingHours;

    public EmployeePartTime(int code, String name, int age, String phone, String email, double workingHours) {
        super(code, name, age, phone, email);
        this.workingHours = workingHours;
    }
    public String toString(){
        return super.toString()+" "+ workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    public double getNetSalary(double rates){
        return workingHours *rates;
    }
}
