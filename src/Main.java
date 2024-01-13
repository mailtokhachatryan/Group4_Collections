import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        Set<String> strings = new TreeSet<>();
//
//        strings.add("Aghasi");
//        strings.add("Sargis");
//        strings.add("Astghik");
//
//        for (String string : strings) {
//            System.out.println(string);
//        }


//        Set<Integer> integers = new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//
//        integers.add(5);
//        integers.add(66);
//        integers.add(1);
//        integers.add(6);
//        integers.add(3);
//
//        System.out.println(integers);

//        Set<Human> humans = new TreeSet<>(new Comparator<Human>() {
//            @Override
//            public int compare(Human o1, Human o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//
//        humans.add(new Human("Aa", 5));
//        humans.add(new Human("Aaa", 3));
//        humans.add(new Human("Aaaa", 3));
//
//        System.out.println(humans);

//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(2, "erkus");
//        map.put(1, "mek");
//        map.put(4, "chors");
//        map.put(3, "ereq");
//
//
//        System.out.println(map);

        // [-1,69,2,4,8,42,85] k

        //[2,8]

//        int[] array = {2, 8, 4, 6, 5, 7, 9, 3, 21, 1};
//        int[] array2 = {1, 2, 3, 4, 6, 8, 9, 11, 88, 999};
//        System.out.println(findSumElements(array, 22));

        Human human = new Human("Agahsi", 25);
        Human human2 = new Human("Agahsi", 25);


        Map<Human, String> map = new HashMap<>();

        map.put(human, "");
        map.put(human2, "");

        System.out.println(map);

    }

    public static String findSumElements(int[] array, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (set.contains(k - array[i]))
                return "[" + (k - array[i]) + ", " + array[i] + "]";
            set.add(array[i]);
        }

        return "[]";
    }

}