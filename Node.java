package Tree;

public class Node {

	private Node left;
	private Node right;
	private Object data;
	public boolean option; //추가로 만든것 꼭 필요 x 
	 					   // 이값을 정답으로 쓸지말지
	
	public Node(Object data) {
		left = null;
		right = null;
		this.data = data;
	}
	
	public Node(Object data ,boolean a) {
		left = null;
		right = null;
		this.data = data;
		option = a;
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
