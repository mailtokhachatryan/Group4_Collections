package myList;

public class TestLinkedList {

    public static void main(String[] args) {
        MyList myList = new MyCustomLinkedList();

        myList.add("barev");
        myList.add("barev2");
        myList.add("barev3");
        myList.add("barev4");
        myList.add("barev5");
        myList.add("barev5");
        myList.add("barev5");
        myList.add("barev5");
        myList.add("barev5");
        myList.add("barev6");

        for (Object o : myList) {
            System.out.println(o);
        }
    }
}
