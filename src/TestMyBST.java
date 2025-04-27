public class TestMyBST {
    public static void main(String[] args) {
        System.out.println("Testing Binary Search Tree");
        TestingMyBST();
    }
    public static void TestingMyBST() {
        System.out.println("*** TEST 1: BASIC OPERATIONS ***");
        MyBST<String, Integer> tree = new MyBST<>();

        tree.put("D", 4);
        tree.put("B", 2);
        tree.put("F", 6);
        tree.put("A", 1);
        tree.put("C", 3);
        tree.put("E", 5);
        System.out.println("Size after insertions: " + tree.size());

        System.out.println("\nIn-order traversal:");
        for (var elem : tree.iterator()) {
            System.out.print(elem.getKey() + ":" + elem.getValue() + " ");
        }

        System.out.println("\n\n*** TEST 2: DELETION ***");
        tree.delete("B");
        tree.delete("D");
        System.out.println("Size after deletions: " + tree.size());

        System.out.println("\nIn-order after deletions:");
        for (var elem : tree.iterator()) {
            System.out.print(elem.getKey() + ":" + elem.getValue() + " ");
        }

        System.out.println("\n\n*** TEST 3: UPDATING ***");
        tree.put("C", 100);
        System.out.println("C = " + tree.get("C"));
        System.out.println("Size after update: " + tree.size());
    }
}