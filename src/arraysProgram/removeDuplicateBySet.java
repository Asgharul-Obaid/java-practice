package arraysProgram;

import java.util.HashSet;
import java.util.Set;
public class removeDuplicateBySet {

public static void main(String[] args) {
	int[] n= {1,5,2,4,3,1,2};
	HashSet<Integer> set = new HashSet<>();
	for (int i = 0; i < n.length; i++) {
		set.add(n[i]);
	}
	for (Integer integer : set) {
		System.out.print(integer);
	}
}
}
