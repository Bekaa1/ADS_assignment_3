
public class Main {
    public static void main(String[] args) {
        MyHashTable<String, Integer> hashTable = new MyHashTable<>(5);
        hashTable.put("four", 4);
        hashTable.put("five", 5);
        hashTable.put("six", 6);


        System.out.println(hashTable.get("five"));

        System.out.println(hashTable.contains(5));
        System.out.println(hashTable.contains(2));

        System.out.println(hashTable.remove("five"));

        System.out.println(hashTable.getKey(3));


        BST<Integer, String> tree = new BST<>();
        tree.put(5, "cucumber");
        tree.put(2, "peach");
        tree.put(8, "melon");
        tree.put(1, "pear");
        tree.put(4, "apple");

        for (BST.Node node : tree) {
            System.out.println("key is " + node.getKey() + " and value is " + node.getValue());
        }

    }
}