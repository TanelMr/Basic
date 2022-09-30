package Week5;

import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    public Person(String name) {
        int pp = Calendar.getInstance().get(Calendar.DATE);
        int kk = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int vv = Calendar.getInstance().get(Calendar.YEAR);
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public int age() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int givenYear = birthday.setYear() ;
        return currentYear-givenYear;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday;
    }

    public boolean olderThan(Person compared) {

       return this.birthday.setYear()>compared.birthday.setYear();

    }

}
