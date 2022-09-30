package Week5;

public class Ex93 {

    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 15, 2, 1993);
        Person thomas = new Person("Thomas", 1, 3, 1955);
        Person tanel = new Person("Tanel", 29, 8, 1995);

        System.out.println( thomas.getName() + " age " + thomas.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");
        System.out.println( tanel.getName() + " age " + tanel.age() + " years");

        System.out.println( thomas.getName() + " is older than " +  pekka.getName() + ": "+ thomas.olderThan(pekka) );
        System.out.println( pekka.getName() + " is older than " +  thomas.getName() + ": "+ pekka.olderThan(thomas) );
    }
}