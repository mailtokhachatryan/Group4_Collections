package myList;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//
//
//        List<Human> list = new ArrayList<>();
//
//        Human raz = new Human("Raz", 21);
//        Human asthgik = new Human("Asthgik", 37);
//        Human sargis = new Human("Sargis", 21);
//        Human aghasi = new Human("Aghasi", 27);
//
//
////        System.out.println(raz.compareTo(aghasi));
//
//
//        list.add(raz);
//        list.add(asthgik);
//        list.add(sargis);
//        list.add(aghasi);
//
////        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 98, 65, 65, 765, 4, 411, 1, 56, 65, 32, 1));
//
//        Collections.sort(list, new Comparator<Human>() {
//            @Override
//            public int compare(Human o1, Human o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
//
//        System.out.println(list);

//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(4);
//        linkedList.add(5);
//
//
//
//        System.out.println(linkedList);


        MyList myList = new MyCustomArrayList();

        myList.add(8);
        myList.add(456);
        myList.add("456");

        for (int i = 0; i < myList.size(); i++) {
            Integer o = (Integer) myList.get(i);
            int i1 = o.intValue();
            System.out.println(i1);
        }

//        Stack<Integer> integers = new Stack<>();
//
//        integers.push(8);
//        integers.push(5);
//        integers.push(11);
//        integers.push(66);
//
//        System.out.println(integers);
//
//
//        Integer pop = integers.pop();
//
//        System.out.println(pop);
//
//
//        System.out.println(integers);

        System.out.println(isValid("sadsad{sdd}as(asdasd[aasd545(asd{}6854)])sad{548445}"));

    }

    // {} () []   (){}[]   ({})

    // sadsad{sdd}as(asdasd[aasd545(asd{}6854)]])sad{548445}
    public static boolean isValid(String string) {

        char[] charArray = string.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : charArray) {
            if (c == '(' || c == '{' || c == '[')
                stack.add(c);

            switch (c){
                case ')': if (stack.isEmpty() || stack.pop() != '(') return false; break;
                case '}': if (stack.isEmpty() || stack.pop() != '{') return false; break;
                case ']': if (stack.isEmpty() || stack.pop() != '[') return false; break;
            }
        }

        return stack.isEmpty();
    }


}
