public class TestMyHashTable {
    public static void main(String[] args) {
        System.out.println("Testing Hash Table");
        TestingMyHashTable();
    }
    public static void TestingMyHashTable() {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(10);

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(
                    (int) (Math.random() * 10000),
                    "Name" + (int) (Math.random() * 100)
            );
            Student value = new Student(
                    "Student" + i,
                    (int) (Math.random() * 30) + 18
            );
            table.put(key, value);
        }

        table.printBucketSizes();

    }
}
