import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return IntStream.of(arr).filter(i->!IntStream.of(delete_list).anyMatch(a->a==i)).toArray();
    }
}