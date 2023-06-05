class BSTNode {
    private BSTNode root;
    private int data;
    private BSTNode left;
    private BSTNode right;

    public BSTNode(int data, BSTNode left, BSTNode right) {
        this.data = data;
        this.left = left;
        this.right = right;

    }

    public int getData() {
        return data;
    }

    public BSTNode getLeft() {
        return left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public BSTNode getLeftmostNode() {
        if (left == null) return right;
        else {
            left = left.getLeftmostNode();
            return this;
        }
    }

    public BSTNode getRightmostNode() {
        if (right == null) return left;
        else {
            right = right.getRightmostNode();
            return this;
        }
    }

    public void insert(int data) {
        if (this.data >= data) {
            if (left == null) setLeft(new BSTNode(data, null, null));
            else left.insert(data);
        } else if (this.data <= data) {
            if (right == null) setRight(new BSTNode(data, null, null));
            else right.insert(data);
        }
    }

    public BSTNode remove(BSTNode ParentCursor, BSTNode Cursor, int data) {
        BSTNode child;

        if (this.data != data) {
            if (this.data > data) left.remove(this, getLeft(), data);
            else right.remove(this, getRight(), data);
        } else {
            //this.data == data
            if(Cursor.left==null && Cursor.right==null){
             if(Cursor == ParentCursor.getRight()) ParentCursor.setRight(null);
             else ParentCursor.setLeft(null);
            }
            else if(Cursor.left==null){
                child = Cursor.getRight();

                if(Cursor == ParentCursor.getRight())
                ParentCursor.setRight(child);
                else ParentCursor.setLeft(child);
            }
            else if(Cursor.right == null){
                child = Cursor.getLeft();

                if(Cursor==ParentCursor.getRight())
                    ParentCursor.setRight(child);
                else ParentCursor.setLeft(child);
            }
            else {
                BSTNode leftmost = Cursor.getRight(), leftmost_Parent = null;
                while(leftmost.getLeft()!=null){
                    leftmost_Parent = leftmost;
                    leftmost = leftmost.getLeft();
                }

                Cursor.setData(leftmost.getData());
                if(leftmost_Parent.getLeft() == leftmost) leftmost_Parent.setLeft(leftmost.getRight());
                else leftmost_Parent.setRight(leftmost.getRight());

            }

        }
        return this;
    }

    public void preOrder() {
        System.out.print(data + " ");
        if (left != null) left.preOrder();
        if (right != null) right.preOrder();
    }


}

public class BinarySearchTree {
    public static void main(String[] args) {
        BSTNode root = new BSTNode(20, null, null);
        root.insert(3);
        root.insert(15);
        root.insert(23);
        root.insert(16);
        root.insert(7);
        root.preOrder(); //20 3 15 7 16 23

        root.remove(null, root, 3);
        root.preOrder();

    }
}
