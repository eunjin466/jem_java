package collection6;

import java.util.TreeSet;

public class TreeMain {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(35);	tree.add(41);		tree.add(29);
		tree.add(9);	tree.add(15);		tree.add(20);
		tree.add(56);	tree.add(49);		tree.add(11);
		tree.add(17);	tree.add(89);		tree.add(39);
		
		System.out.println( tree );
		
		System.out.println(tree.headSet(20));
		System.out.println(tree.tailSet(31));
		
		System.out.println(tree.first());
		System.out.println(tree.last());
		
		
		System.out.println(tree.higher(29));
		//higher  - 해당값보다 큰 값중에 가장 가까운거 찾기
		System.out.println(tree.higher(100));
		
		System.out.println( tree.lower(30));
		System.out.println(tree.ceiling(39));
		
		System.out.println(tree.floor(17));
		
		System.out.println(tree.subSet(17, 41));
		
	}

}
