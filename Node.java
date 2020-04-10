package Tree;

public class Node {

	public Node left;
	public Node right;
	public Object data;
	
	public Node(Object data) {
		left = null;
		right = null;
		this.data = data;
	}
	
	// ���� �ڽ� ���� �������ִ� �޼ҵ�
	public void makeLeftSubTree(Node sub) {
		if(this.left != null) {
			this.left = null;
		}
		this.left = sub;
	}
	
	// ������ �ڽ� ���� �������ִ� �޼ҵ�
	public void makeRightSubTree(Node sub) {
		if(this.right != null) {
			this.right = null;
		}
		this.right = sub;
	}
	
	public Object getData() {
		return this.data;
	}
	
	public Node getLeftSubTree() {
		return this.left;
	}
	
	public Node getRightSubTree() {
		return this.right;
	}
	
	

}
