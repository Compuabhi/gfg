package com.array.gfg;
//create AVL tree using rotation 
public class sort_avltree {

	static class node {

		int data;
		int count;
		node right;
		node left;

		node(int data) {
			this.data = data;
			this.count = 1;
			this.right = null;
			this.left = null;
		}

	}
	private static sort_avltree s1=new sort_avltree();
	public static void sort(node root1){
		if(root1!=null){
			sort(root1.left);
			{
				while(root1.count-->0){
					System.out.print(root1.data+ " ");
				}
			}
			sort(root1.right);
			
			
		}
		
		
	}

	public static void createTree(int[] arr) {
		node root = null;
		for (int x : arr)
			root = insert(x, root);
		sort(root);
	}

	public static node insert(int x, node root) {
		node temp = root;

		if (temp == null) 
			return new node(x);

		else if (temp.data == x)
			{temp.count++;
				return temp;
			}
		else if (temp.data < x)
			temp.right = insert(x, temp.right);
		
		else
			temp.left = insert(x, temp.left);

		return temp;
	}

	public static node found(int x, node root) {
		node temp = root;
		if (temp == null)
			return temp;
		else if (temp.data == x)
			return temp;
		else {
			if (temp.data > x)
				return found(x, temp.left);
			else
				return found(x, temp.right);

		}
	}

	public static void main(String[] args) {

		int arr[] = { 100, 12, 100, 1, 1, 12, 100, 1, 12, 100, 1, 1 };
		createTree(arr);

	}

}
