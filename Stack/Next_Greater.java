import java.util.*;

public class Next_Greater {

  public static void main(String args[]) {
    int arr[] = { 6, 8, 0, 1, 3 };
    int nxt_grt[] = new int[arr.length];
    Stack<Integer> s = new Stack<>();

    for (int i = arr.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        s.pop();
      }

      if (s.isEmpty()) {
        nxt_grt[i] = -1;
      } else {
        nxt_grt[i] = arr[s.peek()];
      }
      s.push(i);
    }

    for (int j = 0; j < nxt_grt.length; j++) {
      System.out.print(" " + nxt_grt[j]);
    }
    System.out.println();
  }
}
