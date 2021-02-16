package homework4;

import java.util.ArrayList;

public class Telephone {

    public static ArrayList<String> arListPhone = new ArrayList<>();

    public static void addDefault() {
        arListPhone.add("Ivanov 11223");
        arListPhone.add("Petrov 21212");
        arListPhone.add("Sidorov 32323");
        arListPhone.add("Pupkin 65956");
        arListPhone.add("Smirnov 48796");
        arListPhone.add("Kuznetcov 54545");
        arListPhone.add("Abromovich 89852");
        arListPhone.add("Usmanov 77777");
        arListPhone.add("Volkov 85696");
    }

    public static void add(String arListPhone) {
        Telephone.arListPhone.add(arListPhone);
    }

    public static void listAll() {
        System.out.println("Phonebook:");
        for (int i = 0; i < arListPhone.size(); i++) {
            System.out.println(arListPhone.get(i));
        }
    }


    public static void get(String surname) {
        boolean res = false;
        System.out.println();
        System.out.println("Search name \"" + surname + "\": ");
        for (int i = 0; i < arListPhone.size(); i++) {
            if (arListPhone.get(i).lastIndexOf(surname) != -1) {
                System.out.println(arListPhone.get(i));
                res = true;
            }
        }
        if (!res) {
            System.out.println("Not found!");
        }

    }
}
