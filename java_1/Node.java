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
	
	// 왼쪽 자식 노드와 연결해주는 메소드
	public void makeLeftSubTree(Node sub) {
		if(this.left != null) {
			this.left = null;
		}
		this.left = sub;
	}
	
	// 오른쪽 자식 노드와 연결해주는 메소드
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
