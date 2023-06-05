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
    public BTNode getright(){ return right;}
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
        //아니라면 자기자신을 지우고 right를 대체 -> 자기자신 제거
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

}

public class BinaryTree {
    public static void main(String[] args) {

    }
}
