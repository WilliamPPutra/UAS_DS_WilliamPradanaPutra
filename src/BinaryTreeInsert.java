public class BinaryTreeInsert
{
    public static void main(String[] args)
    {
        new BinaryTreeInsert().run();
    }
    static class Node
    {
        Node left;
        Node right;
        int value;
        public Node(int value)
        {
            this.value = value;
        }
    }
    public void run()
    {
        Node rootnode = new Node(25);
        insert(rootnode, 15);
        insert(rootnode, 25);
        insert(rootnode, 35);
        insert(rootnode, 45);
        insert(rootnode, 55);
    }
    public void insert(Node node, int value)
    {
        if (value < node.value)
        {
            if (node.left != null)
            {
                insert(node.left, value);
            } else
            {
                System.out.println("  Terinput " + value + " ke Node kiri " + node.value);
                node.left = new Node(value);
            }
        }
        else if (value > node.value)
        {
            if (node.right != null)
            {
                insert(node.right, value);
            } else
            {
                System.out.println("  Terinput " + value + " ke Node kanan " + node.value);
                node.right = new Node(value);
            }
        }
    }
}