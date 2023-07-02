package TestFinal.ClaseDerivate;

import TestFinal.ClaseDeBaza.Employee;

public class Cashier extends Employee {

   private boolean canOperateComputer;
   private final int price = 50;

    public Cashier(String name, String jobName, int age, boolean canOperateComputer) {
        super(name, jobName, age);
        this.canOperateComputer = canOperateComputer;
    }

    public String cashedMoney(int numberOfclients){
        int result = numberOfclients * price;
        return "Today, the cashier cashed " + result + " dollars. ";
    }

    @Override
    public void feedsAnimals() {

    }

    @Override
    public String toString() {
        return "Cashier{" +
                "canOperateComputer=" + canOperateComputer +
                ", price=" + price +
                '}';
    }

    public boolean isCanOperateComputer() {
        return canOperateComputer;
    }

    public void setCanOperateComputer(boolean canOperateComputer) {
        this.canOperateComputer = canOperateComputer;
    }

    public int getPrice() {
        return price;
    }
}
