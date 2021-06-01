import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.lang.Exception;

class Main {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
    int[] sol = twoSum(arr, 18);

    System.out.println("Solution: " + sol[0] + " " + sol[1]);
  }

  public static int[] twoSum(int[] arr, int target) {
    Map<Integer, Integer> seen = new HashMap<Integer, Integer>();

    for (int i = 0; i < arr.length; ++i) {
      seen.put(arr[i], i);
    }

    for (int i = 0; i < arr.length; ++i) {
      int complement = target - arr[i];
      if (seen.containsKey(complement) && seen.get(complement) != i) {
        return new int[] { i, seen.get(complement) };
      }
    }

    throw new IllegalArgumentException("No solution found");
  }

}