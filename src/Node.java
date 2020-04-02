public class Node<T> {

    private Node<T> left;
    private Node<T> right;
    private T data;

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean equals(Node<T> root1, Node<T> root2) {
        boolean rootEqual = false;
        boolean lEqual = false;
        boolean rEqual = false;

        if (root1 != null && root2 != null) {
            rootEqual = root1.getData().equals(root2.getData());

            if (root1.getLeft()!=null && root2.getLeft() != null) {
                // compare the left
                lEqual = equals(root1.getLeft(), root2.getLeft());
            }
                else if (root1.getLeft() == null && root2.getLeft() == null) {
                    lEqual = true;
                }
            if (root1.getRight() != null && root2.getRight() != null) {
                // compare the right
                rEqual = equals(root1.getRight(), root2.getRight());
            }
            else if (root1.getRight() == null && root2.getRight() == null) {
                rEqual = true;
            }

            return (rootEqual && lEqual && rEqual);
        }
        return false;
    }


    public static boolean treeEquals(Node a, Node b) {
        // check for reference equality and nulls
        if (a == b) return true; // note this picks up case of two nulls
        if (a == null) return false;
        if (b == null) return false;

        // check for data inequality
        if (a.data != b.data) {
            if ((a.data == null) || (b.data == null)) return false;
            if (!(a.data.equals(b.data))) return false;
        }

        // recursively check branches
        if (!treeEquals(a.left, b.left)) return false;
        if (!treeEquals(a.right, b.right)) return false;

        // we've eliminated all possibilities for non-equality, so trees must be equal
        return true;
    }






//    public MiiANA (String[] args) {
//        Node node = new Node();
//        node.equals(node.left);
//    }

}
