package Home_work_3;

import java.*;

public class Main {
    public static <Integer> void main(String[] args) {
        LinkedListContainer<String> stringLinkedNames = new LinkedListContainer<>();
        stringLinkedNames.addLast("Masha");
        stringLinkedNames.addFirst("Misha");
        stringLinkedNames.addLast("Vova");
        System.out.println(stringLinkedNames.size());
        System.out.println("Первое имя в списке: " + stringLinkedNames.getElementByIndex(0));


        for (String item: stringLinkedNames) {
            System.out.println(item);
        }
        LinkedListContainer<Integer> integerLinkedGrades = new LinkedListContainer<>();
        integerLinkedGrades.addLast(9);
        integerLinkedGrades.addFirst(7);
        integerLinkedGrades.addLast(2);
        integerLinkedGrades.addLast(10);

        Iterator iterator = integerLinkedGrades.descendingIteratror();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


