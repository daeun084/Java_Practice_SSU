class BTNode{
    private Object data;
    private BTNode left;
    private BTNode right;

    //생성자
    public BTNode(Object data, BTNode left, BTNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BTNode getLeft(){ return left;}
    public BTNode getRight(){ return right;}
    public Object getData(){return data;}
    public void setData(Object data){this.data = data;}
    public boolean isleaf(){
        return (left==null)&&(right==null);
    }
    public Object getLeftmostData(){
        if(left==null) return data;
        else  return left.getLeftmostData();
    }
    public Object getRightmostData(){
        if(right==null) return data;
        else return right.getRightmostData();
    }
    public BTNode removeLeftmost(){
        if(left==null) return right;
        //leaf node이면 null을 반환
        //아니라면 자기자신을 지우고 right를 대체 -> 자기자신 제거 후 right node를 위로 올림
        else {
            left = left.removeLeftmost();
            return this;
        }
    }
    public BTNode removeRightmost(){
        if(right==null) return left;
        else{
            right = right.removeRightmost();
            return this;
        }

    }
    public static BTNode treeCopy(BTNode node){
        BTNode leftnode, rightnode;

        if(node==null) return null;
        else{
            leftnode = treeCopy(node.left);
            rightnode = treeCopy(node.right);
            return new BTNode(node.data, leftnode, rightnode);
        }
    }

    public void preOrder(){
        System.out.print(data+" ");
        if(left!=null) left.preOrder();
        if(right!=null) right.preOrder();
    }
    public void inOrder(){
    if(left!=null) left.inOrder();
    System.out.print(data+" ");
    if(right!=null) right.inOrder();
    }
    public void postOrder(){
        if(left!=null) left.postOrder();
        if(right!=null) right.postOrder();
        System.out.print(data+" ");
    }

}

public class BinaryTree {
    public static void main(String[] args) {
        BTNode n31 = new BTNode(4, null, null);
        BTNode n32 = new BTNode(5, null, null);
        BTNode n33 = new BTNode(6, null, null);
        BTNode n34 = new BTNode(7, null, null);
        BTNode n21 = new BTNode(2, n31, n32);
        BTNode n22 = new BTNode(3, n33, n34);
        BTNode n1 = new BTNode(1, n21, n22);


        /*
        //Traversal
        n1.preOrder(); //1 2 4 5 3 6 7
        System.out.println();
        n1.inOrder(); //4 2 5 1 6 3 7
        System.out.println();
        n1.postOrder(); //4 5 2 6 7 3 1
        System.out.println();


         */


        System.out.println(n1.getLeftmostData());
        System.out.println(n1.getRightmostData());

        System.out.println(n1.getRight().getData());

        n1.removeLeftmost();
        n1.preOrder(); //1 2 5 3 6 7
        System.out.println();
        n1.removeLeftmost();
        n1.preOrder(); //1 5 3 6 7
        System.out.println();

        n1.removeRightmost();
        n1.removeRightmost();
        n1.preOrder(); // 1 5 6
        System.out.println();

        System.out.print("\n'5' is LeafNode? : "+n1.getLeft().isleaf());
        System.out.print("\n'6' is LeafNode? : "+n1.getRight().isleaf());


    }
}
