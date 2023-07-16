
public class MyBinaryTree
{
    private static Node root;
    public static void main(String[] args)
    {
        Node temp = new Node(50);
        root = temp;
        System.out.println(root.getData());
        temp = new Node(40);
        root.setLchild(temp);
        temp = new Node(75);
        root.setRchild(temp);
        System.out.println(root.getdata + " " + root.getRchild() + " " + root.getLchild());
        //root.insert(50);
        //root.insert(40);
        //root.insert(75);
        displaytree(root);
    }
}
public class Node
{
    private int data;
    private Node lchild;
    private Node rchild;
    public Node(int e)
    {
        this.data = e;
        this.lchild = null;
        this.rchild = null;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public int getData()
    {
        return this.data;
    }
    public void setLchild(int data)
    {
        this.lchild = lchild;
    }
    public int getLchild()
    {
        return this.lchild;
    }
    public void setRchild(int data)
    {
        this.rchild = rchild;
    }
    public int getRchild()
    {
        return this.rchild;
    }
    public static void displayTree(Node node)
    {
        if (node != null)
        {
            displayTree(node.lchild);
            System.out.println(node.data + ", ");
            displayTree(node.rchild);
        }
    }
}
