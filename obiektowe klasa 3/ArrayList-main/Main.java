import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tank> tanks = new ArrayList<>();

        ArrayList<Person> crew1 = new ArrayList<>();
        crew1.add(new Person("Wiktoria"));
        crew1.add(new Person("Igor"));
        crew1.add(new Person("Krystian"));

        ArrayList<Person> crew2 = new ArrayList<>();
        crew2.add(new Person("Filip"));
        crew2.add(new Person("Bartek"));
        crew2.add(new Person("Maciek"));

        ArrayList<Person> crew3 = new ArrayList<>();
        crew3.add(new Person("Adrian"));
        crew3.add(new Person("Wiktor"));
        crew3.add(new Person("Mateusz"));

        ArrayList<Person> crew4 = new ArrayList<>();
        crew4.add(new Person("Dawid"));
        crew4.add(new Person("Kacper"));
        crew4.add(new Person("Krzysztof"));

        Tank tank1 = new Tank(crew1);
        Tank tank2 = new Tank(crew2);
        Tank tank3 = new Tank(crew3);
        Tank tank4 = new Tank(crew4);

        tanks.add(tank1);
        tanks.add(tank2);
        tanks.add(tank3);
        tanks.add(tank4);


        for (Tank tank : tanks) {

            System.out.println(tank.crew.getFirst().name + " " + tank.crew.get(1).name + " " + tank.crew.get(2).name);
        }

        System.out.println();

        for (int i = 0; i < tanks.size(); i++) {
            System.out.println(tanks.get(i).crew.getFirst().name + " " + tanks.get(i).crew.get(1).name + " " + tanks.get(i).crew.get(2).name);
        }
        System.out.println();

        /* for (Tank tank : tanks){
            tank.crew.removeFirst();
            System.out.println(tank.crew.get(0).name  + " " + tank.crew.get(1).name);
        }*/

        ArrayList<Pocisk> pociski = new ArrayList<>();
        Pocisk pocisk = new Pocisk(5, 5, 5, 5, 5);
        pociski.ensureCapacity(100000);
        pociski.add(pocisk);


        for (Tank tank : tanks) {
            System.out.println(tank.crew.getFirst().name);
        }

        for (Tank tank : tanks) {
            tank.crew.removeFirst();
        }

        tank1.crew.set(0, new Person("Piotr"));
        tank2.crew.set(0, new Person("Jan"));
        tank3.crew.set(0, new Person("Grzegorz"));
        tank4.crew.set(0, new Person("Stanislaw"));
        System.out.println();

        for (Tank tank : tanks) {
            System.out.println(tank.crew.getFirst().name);
        }
        /* for (int d = 1; d <= 10; d++) {
            if (pociski.isEmpty()) {
                for (int i = 1; i <= 10; i++) {
                    pociski.add(pocisk);
                    System.out.println("Dodano pocisk");
                }

            }
                for (int j = 1; j <= 10; j++) {
                    pociski.remove(pocisk);
                    System.out.println("Usunieto amunicje");
                }
                System.out.println("Czy magazyn jest pusty " + pociski.isEmpty());
        } */
/*
        ArrayList<Pocisk> magazynek = new ArrayList<>();
        magazynek.add(new Pocisk(5,5,5,5,5));
        magazynek.add(new Pocisk(5,5,5,5,5));
        magazynek.add(new Pocisk(5,5,5,5,5));
        magazynek.add(new Pocisk(5,5,5,5,5));
        magazynek.add(new Pocisk(5,5,5,5,5));
        Iterator<Pocisk> iterator = magazynek.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().dlugosc);
            iterator.remove();
        }
        magazynek.add(new Pocisk(5,5,5,5,5));
        magazynek.add(new Pocisk(5,5,5,5,5));
        magazynek.add(new Pocisk(5,5,5,5,5));
        magazynek.add(new Pocisk(5,5,5,5,5));
        magazynek.add(new Pocisk(5,5,5,5,5));

        for (Pocisk pocisk2: magazynek){
            System.out.println(magazynek);
            magazynek.remove(pocisk2);
        }


        ArrayList<String> listaOsob = new ArrayList<>();

        listaOsob.add("Wiktoria");
        listaOsob.add("+Igor");
        listaOsob.add("Bartosz");
        listaOsob.add("Wiktor");
        listaOsob.add("Mateusz");
        listaOsob.add("Adrian");
        listaOsob.add("Tomasz");
        listaOsob.add("Ansh");
        listaOsob.add("Jakub");
        listaOsob.add("Maciej");
        listaOsob.add("Karol");
        listaOsob.add("Krystian");
        listaOsob.add("Krzysztof");
        listaOsob.add("Filip");

        System.out.println("Lista nieposortowana");
        System.out.println(listaOsob);
        Collections.sort(listaOsob);
        System.out.println("Posortowane");
        System.out.println(listaOsob);
        */

        Random random = new Random();


        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(random.nextInt(100));
        lista.add(random.nextInt(100));
        lista.add(random.nextInt(100));
        lista.add(random.nextInt(100));
        lista.add(random.nextInt(100));
        lista.add(random.nextInt(100));
        lista.add(random.nextInt(100));
        lista.add(random.nextInt(100));
        lista.add(random.nextInt(100));
        lista.add(random.nextInt(100));


        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(random.nextInt(100));
        lista2.add(random.nextInt(100));
        lista2.add(random.nextInt(100));
        lista2.add(random.nextInt(100));
        lista2.add(random.nextInt(100));
        lista2.add(random.nextInt(100));
        lista2.add(random.nextInt(100));
        lista2.add(random.nextInt(100));
        lista2.add(random.nextInt(100));
        lista2.add(random.nextInt(100));


        System.out.println("Lista 1");
        System.out.println(lista);
        System.out.println("Lista 2");
        System.out.println(lista2);

        lista.retainAll(lista2);
        System.out.println("Liczby wspolne to:");
        for(int i :lista){
            System.out.print(i+" ,");
        }
    }
}
