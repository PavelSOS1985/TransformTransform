import java.util.*;

public class Level1 {
    public static boolean TransformTransform(int[] A, int N) {
        LinkedList<Integer> newA = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            newA.add(A[i]);
        }
        LinkedList<Integer> B = toB(newA, N);
        LinkedList<Integer> B2 = toB(B, B.size());
        for (Integer i :
                B2) {
            sum += i;
        }
        return sum % 2 == 0;
    }

    public static LinkedList<Integer> toB(LinkedList<Integer> A, int N) {
        LinkedList<Integer> B = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - (i - 1); j++) {
                int k = i + j;
                try {
                    B.addLast(Collections.max(A.subList(j, k + 1)));
                } catch (Exception e) {

                }
            }
        }
        return B;
    }

}