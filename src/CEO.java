public class CEO extends Employee{
    boolean hasCompanyCar;

    public CEO(String name, int age, double salary) {
        super(name, age, salary);
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public void goPublic(){
       // super.Work();
        System.out.println(" CEO - everyday work.  " + " -Work BMW Company.   ---" + " КОМПАНИЯ БМВ : " + isHasCompanyCar() + getName() +
                ", ЗАРПЛАТА ДИРЕКТОРА: " + getSalary() + ", ВОЗРАСТ: " + getAge());

    }

    public void goToVacation(){
        System.out.println(" CEO say: I am going to Havail!");
    }

    public void goToDayOff(){
        System.out.println("Директор, Вам нужен отгул!");
    }
}
