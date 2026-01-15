package sorting_searching;

public class Theory{
    public static void main(String[] args) {
        System.out.println("hello");
    }
}

/*
TreeMap:
- Stores key–value pairs in sorted order of keys
- Implemented using Red-Black Tree
- All operations take O(log n) time

Useful methods:
- floorKey(x): largest key <= x
- ceilingKey(x): smallest key >= x
- lowerKey(x): largest key < x
- higherKey(x): smallest key > x
- containsKey() : O(log n)
- get() : O(log n)

TreeMap is used when we need ordered keys and closest-value queries in O(log n)
*/

/*
Arrays.sort(in, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });
this tie breaking statement in sorting can be very crucial to algorithm
 */