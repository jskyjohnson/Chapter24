// Chapter 24 Java Methods
//Sky Johnson
// Questions 1,2,3,6,7,8,10,12a,14a, 16, 17, 18, 19

/* Question 1
 * root = the current value of the tree, or highest value of the tree
 * child = one of the "branches" that extends from the root
 * leaf = the last node that is present in the tree, a child with no other children
 * parent = the node that the child is connected above too
 * ancestor = similar to parent, or parent of the parent
 * subtree = the "tree" that is created off of the current node. 
 */

/*
 * Question 2
 * 100,000 = 2^k - 1
 * log 2 of 100,001 is 17
 */

/* 
 * Question 3
 * a)
 * 4 layers for largest ( 8 leaves)
 * 16 layers of 1 ( 1 leaf)
 * b)
 * 8 leaves for largest
 * 1 leaf for smallest
 */

/*
 * Question 8
 * countSomething returns the amount of leaves on a tree
 */

/*
 * Question 16
 * a) True
 * b) True if the tree is allowed to compare negative numbers
 * c) True
 */

public class Chapter24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a1 = new TreeNode(1);
		TreeNode ar = new TreeNode(2);
		TreeNode al = new TreeNode(3);
		TreeNode arr = new TreeNode(4);
		TreeNode arl = new TreeNode(5);
		TreeNode alr = new TreeNode(6);
		TreeNode all = new TreeNode(7);
		TreeNode arrr = new TreeNode(8);
		TreeNode arrl = new TreeNode(9);
		TreeNode arlr = new TreeNode(10);
		TreeNode arll = new TreeNode(11);
		TreeNode alrr = new TreeNode(12);
		TreeNode alrl = new TreeNode(13);
		TreeNode allr = new TreeNode(14);
		TreeNode alll = new TreeNode(15);
		a1.setLeft(al);
		a1.setRight(ar);
		al.setLeft(all);
		al.setRight(alr);
		ar.setLeft(arl);
		ar.setRight(arr);
		all.setLeft(alll);
		all.setRight(allr);
		alr.setLeft(alrl);
		alr.setRight(alrr);
		arl.setLeft(arll);
		arl.setRight(arlr);
		arr.setLeft(arrl);
		arr.setRight(arrr);
		
		print(isLeaf(arrr));
		print(isLeaf(arr));
		
		print(sumTree(a1));
		print(sumTree(arl));
		
		print(depth(a1));
		print(depth(all));
		
		TreeNode k1 = copy(a1);
		print(sumTree(k1));
		
		buildFull(5);
	}
	// Question 6
	public static boolean isLeaf(TreeNode node){
		if (node.getLeft() == null && node.getRight() == null){
			return true;
		}
		return false;
	}
	// Question 7
	public static int sumTree(TreeNode root){
		if (root != null){
			return (int) root.getValue() + sumTree(root.getLeft()) + sumTree(root.getRight());
		}else{
			return 0;
		}
	}
	// Question 10
	public static int depth(TreeNode root){
		if(isLeaf(root)){
			return 1;
		}else{
			if (depth(root.getRight()) > depth(root.getLeft())){
				return depth(root.getRight()) + 1;
			}else{
				return depth(root.getLeft()) + 1;
			}
		}
	}
	// Question 12a
	public static TreeNode copy(TreeNode root){
		TreeNode a1 = new TreeNode(root.getValue());
		if(root.getLeft() != null){
			TreeNode al = copy(root.getLeft());
			a1.setLeft(al);
		}
		if(root.getRight() != null){
			TreeNode ar = copy(root.getRight());
			a1.setRight(ar);
		}
		return a1;
	}
	// Question 14a
	public static TreeNode buildFull(int h){
		TreeNode a1 = new TreeNode(null);
		if(h != 0){
			a1.setLeft(buildFull(h-1));
			a1.setRight(buildFull(h-1));
		}
		return a1;
	}
	
	public static void print(Object k){
		System.out.println(k.toString());
	}
}
