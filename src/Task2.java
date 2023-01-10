import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(scanner.nextInt());
        Set<Integer> set = new HashSet<Integer>(numbers);
        if (set.iterator() == numbers.iterator()) {
            numbers.clear();
        }
        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
//        for (HashSet.Entry<Integer> entry : number.entry()) {
//            if(weekDayInput.equals(entry.getKey())) {
//                System.out.println(entry.getValue());
//            }
//            else
//                System.out.println("Error");;
//        }

