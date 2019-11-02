public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(32);
        linkedList.add(93);
        linkedList.add(64);
        linkedList.add(3);

        System.out.println("Number of elements: " + linkedList.size());
        System.out.println("Element with index 2: " + linkedList.get(2));
        System.out.println("Delete element with index 2: " + linkedList.delete(2));
        System.out.println("Element with index 2: " + linkedList.get(2));
        System.out.println("Number of elements: " + linkedList.size());
    }
}
