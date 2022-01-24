import java.io.*;
import java.util.*;

public class BinaryTrees
{


    public static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class Pair
    {
        Node node;
        int state;

        Pair(Node node, int state)
        {
            this.node = node;
            this.state = state;
        }
    }
    public static Node construct(Integer[] arr)
    {
        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0], null, null);
        Pair rp = new Pair(root, 1);
        st.push(rp);

        // 1 for left child, 2 for right and 3 for poping the node
        int idx = 0; // for reading the elements in the array
        while( st.size() > 0)
        {
            Pair top = st.peek();

            if( top.state == 1)
            {
                idx++;  // incrementing index for accessing the next element
                if( arr[idx] != null)
                {
                    Node ln = new Node(arr[idx], null, null);
                    top.node.left = ln;

                    Pair le = new Pair(ln, 1);
                    st.push(le);
                }
                else
                {
                    top.node.left = null;
                }
                top.state++;
            }
            else if( top.state == 2)
            {
                idx++;  // incrementing index for accessing the next element
                if( arr[idx] != null)
                {
                    Node rn = new Node(arr[idx], null, null);
                    top.node.right = rn;

                    Pair re = new Pair(rn, 1);
                    st.push(re);
                }
                else
                {
                    top.node.right = null;
                }
                top.state++;
            }
            else
            {
                st.pop();
            }
        }
        return root;
    }
    public static void levelordertraversal(Node node) {
        Queue<Node> q = new ArrayDeque<>();

        q.add(node);
        while( q.size() > 0){
            
            int count = q.size();
            for( int i = 0 ; i < count ; i++) {
               node = q.remove();                    //remove
               System.out.print(node.data + " ");    //print
               if(node.left != null) q.add(node.left);
               if(node.right != null) q.add(node.right); //add

            }
            System.out.println();
        }
    }
    // Iterative Pre and Post and Inorder

    // Hint : State pair game


    public static void Iterativetraversal(Node node)
    {
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(node, 1));

        String pre = "";
        String in = "";
        String post = "";
        while(st.size() > 0)
        {

            Pair top = st.peek();

            if( top.state == 1)
            {
                pre += top.node.data + " ";
                top.state++;

                if( top.node.left != null)
                {
                    Pair ln = new Pair(top.node.left, 1);
                    st.push(ln);
                }

            }
            else if(top.state == 2)
            {
                in += top.node.data + " ";
                top.state++;
                if( top.node.right != null)
                {
                    Pair rn = new Pair(top.node.right, 1);
                    st.push(rn);
                }
            }
            else
            {
                post += node.data + " ";
                st.pop();
            }
        }

        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
    public static void display(Node root)
    {
        if(root == null)
        {
            return ;
        }
        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }
    public static void main(String[] args)
    {
        // try
        // {
        //     System.setIn(new FileInputStream("input.txt"));
        //     System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        // }
        // catch (Exception e)
        // {
        //     System.err.println("Error");
        // }
        Scanner sc = new Scanner(System.in);

        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = construct(arr);
        // display(root);
        // Iterativetraversal(root); 
        // levelordertraversal(root);
        System.out.println("Hello");

    }
}



