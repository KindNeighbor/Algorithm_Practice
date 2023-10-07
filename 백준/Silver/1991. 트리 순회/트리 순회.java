import java.io.*;
import java.util.*;

public class Main {
    
    static Node first = new Node('A', null, null);
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            
            insert(first, root, left, right);
        }
        
        preOrder(first);
        System.out.println();
        inOrder(first);
        System.out.println();
        postOrder(first);
        System.out.println();
    }
    
    public static void insert(Node temp, char root, char left, char right) {
        if (temp.c == root) {
            if (left == '.') temp.left = null;
            else temp.left = new Node(left, null, null);
            if (right == '.') temp.right = null;
            else temp.right = new Node(right, null, null);
        } else {
            if (temp.left != null) insert(temp.left, root, left, right);
            if (temp.right != null) insert(temp.right, root, left, right);
        }
    }
    
    public static void preOrder(Node n) {
        if (n == null) return;
        System.out.print(n.c);
        preOrder(n.left);
        preOrder(n.right);
    }
    
    public static void inOrder(Node n) {
        if (n == null) return;
        inOrder(n.left);
        System.out.print(n.c);
        inOrder(n.right);
    }
    
    public static void postOrder(Node n) {
        if (n == null) return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.c);
    }
    
    public static class Node {
        char c;
        Node left;
        Node right;
        
        public Node(char c, Node left, Node right) {
            this.c = c;
            this.left = left;
            this.right = right;
        }
    }
}