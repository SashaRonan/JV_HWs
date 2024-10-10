import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        MyStack stack = new MyStack();
//        if (args.length == 0) {
//            stack.push("apple");
//            stack.push("banana");
//            stack.push("pear");
//            stack.push("grape");
//        } else {
//            for (String arg : args) {
//                stack.push(arg);
//            }
//        }
//        System.out.println(stack.getElements());
//        System.out.println(stack.pop());
//        System.out.println(stack.getElements());
//        System.out.println(stack.peek());

        LinkedList<String> list = new LinkedList<>();

        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("pear");
        list.add("banana");
        String str = "apple";

        ListUtils strCounter = new ListUtils();
        System.out.println("Occurrences of \"" + str + "\": "
                + strCounter.countOccurrences(list, str));
    }
}