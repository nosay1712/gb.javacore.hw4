package homework4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] arrayWords = new String[]{"potato", "cucumber", "tomato", "onion", "garlic", "carrot", "onion", "garlic", "mushrooms", "tomato", "tomato", "cucumber", "carrot", "pepper", "cabbage", "pumpkin", "squash", "pepper", "pumpkin", "cucumber"};
        ArrayList listWords = new ArrayList<>(Arrays.asList(arrayWords));

        Set<String> unique = new HashSet<>();

        Iterator<String> iteration = listWords.iterator();
        while (iteration.hasNext()) {
            String s = iteration.next();
            unique.add(s);
        }

        System.out.println("ex.1");
        System.out.println();
        System.out.println("Unique values:");
        System.out.println(unique);
        System.out.println();

        HashMap<String, Integer> countWords = new HashMap<>();
        System.out.println("Duplicate values:");
        for (String word : arrayWords) {
            if (!countWords.containsKey(word)) {
                countWords.put(word, 0);
            }

            countWords.put(word, countWords.get(word) + 1);
        }

        for (String word : countWords.keySet()) {
            System.out.println(word + " " + countWords.get(word));
        }

        System.out.println();
        System.out.println("ex. 2");
        System.out.println();

        Telephone.addDefault();
        Telephone.add("Kukushkin 96959");
        Telephone.listAll();
        Telephone.get("Abromovich");
        Telephone.get("Usmanov");
        Telephone.get("Pupkin");
        Telephone.get("Kotov");

    }

}

