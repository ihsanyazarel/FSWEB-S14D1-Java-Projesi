package com.workintech.company;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }
    public HRManager(int id, String name, int salary, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name, salary);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    public JuniorDeveloper[] getJuniors() {
        return juniors;
    }

    public MidDeveloper[] getMids() {
        return mids;
    }

    public SeniorDeveloper[] getSeniors() {
        return seniors;
    }

    public void work(){
        System.out.println("HRManager starts to working");
        super.setSalary(1000);
    }
    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            if (juniors[index] == null) {
                juniors[index] = developer;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index Error!..." + ex.getMessage());
        }
    }
    public void addEmployee(int index, MidDeveloper developer) {
        try {
            if (mids[index] == null) {
                mids[index] = developer;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index Error!..." + ex.getMessage());
        }
    }


    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            if (seniors[index] == null) {
                seniors[index] = developer;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index Error!..." + ex.getMessage());
        }
    }
}
