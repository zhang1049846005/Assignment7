
public class Node {
	private int id;
	private Object data;
	private Node parent;
	private Node[] children = new Node[2];
	private int lSubTreeHeight;
	private int rSubTreeHeight;
	private int balanceFactor;
	
	public int getId() {
		return id;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public Node[] getChildren() {
		return children;
	}
	public void setChildren(Node[] children) {
		this.children = children;
	}
	public void setChild(Node child, int id){
		this.children[id] = child;
	}
	public int getlSubTreeHeight() {
		//TODO calculate the left sub tree height
		return lSubTreeHeight;
	}
	public int getrSubTreeHeight() {
		//TODO calculate the right sub tree height
		return rSubTreeHeight;
	}
	public int getBalanceFactor() {
		//TODO calculate the balance factor
		return balanceFactor;
	}
	

}
