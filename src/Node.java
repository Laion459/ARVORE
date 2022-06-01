public class Node {
    private Integer element;
    private Node left;
    private Node right;

    public Node(Integer element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
