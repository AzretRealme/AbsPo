public class Specialist extends Employee{

    int levels;

    public Specialist(String name, int age, double salary) {
        super(name, age, salary);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public void workWithClients(){
        //super.Work();
        System.out.println(" Specialist - awesome speak English. " + " -workWithClients. ---" + getName() + ", РАНГ СПЕЦИАЛИСТА: " + getLevels() +
                ", ЗАРПЛАТА: " + getSalary() + ", ВОЗРАСТ: " + getAge());
    }

    public void goToVacation(){
        System.out.println("Specialist say: I am go to Stanbul");
    }
    public void goToDayOff(){
        System.out.println("Специалисты, Прогуляйтесь в эти выходные!");
    }
}
