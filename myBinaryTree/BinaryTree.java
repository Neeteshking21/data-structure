package myBinaryTree;
import java.util.*;

public class BinaryTree{
    static Scanner sc = null;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        Node root = CreateTree();

        System.out.println("Your input(InOrder):-");
        inOrder(root);
        System.out.println();
        // preOrder(root);
        /*System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println("Level Order Traversal ");
        levelOrderTraverse(root);
        System.out.println("mirrorTree is ");
        inOrder(mirrorTree(root));
        System.out.println();
        System.out.println("Iterable InOrder");
        IterateinOrder(root);
        System.out.println();
        System.out.println("Iterable PreOrder");
        IteratepreOrder(root);
        System.out.println();
        System.out.println("Iterable PostOrder");
        IteratePostOrder(root);
        // sc.close();
        System.out.println();
        System.out.println("Left view by recursion: ");
        LeftViewRecursive(root, 1);
        System.out.println();
        System.out.println("Left view by Itration: ");
        ArrayList<Integer> arr = LeftView(root);
        System.out.println(arr);
        System.out.println();*/
        System.out.println("zigzag view by Itration: ");
        zigzagIteration(root);
    }		
    static Node CreateTree(){
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if(data == -1) return null;
        root = new Node(data);
        System.out.println("Enter left data for: " + data);
        root.left = CreateTree();
        System.out.println("Enter right data for: "+ data);
        root.right = CreateTree();
        return root;
    }
    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.err.print(root.data + " ");
        inOrder(root.right);
    }
/*
    static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
        
    }
    static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.err.print(root.data + " ");      
    }

    static void levelOrderTraverse(Node root){
    	ArrayList<Integer> arr = new ArrayList<>();
    	if(root == null) return;

    	Queue<Node> myq = new LinkedList<>();
    	myq.add(root);

    	while(!myq.isEmpty()){
    		Node temp = myq.peek();
    		// System.out.println("temp" + temp.data);
    		arr.add(temp.data);
    		if(temp.left != null){
    			myq.add(temp.left);	
    		}

    		if(temp.right != null){
    			myq.add(temp.right);	
    		}
    		
    		myq.remove();
    		
    	}

    	// for(int x: arr) System.out.print(x +" ");
    	System.out.println(arr);

    }

    static void IterateinOrder(Node root){
    	Stack<Node> stk = new Stack<>();
    	Node temp = root;
    	
    	while(!stk.isEmpty() || temp!=null){
    		if(temp != null){
    			stk.push(temp);
    			temp = temp.left;
    		}
    		else{
    			temp = stk.pop();
    			System.out.print(temp.data + " ");
    			temp = temp.right;
    		}
    	}
    }

   static void IteratepreOrder(Node root){
   Stack<Node> stk = new Stack<>();
    stk.push(root);

    while(!stk.isEmpty()){
        Node temp = stk.pop();

        System.out.print(temp.data + " ");
        if(temp.right!=null)
            stk.push(temp.right);
        
        if(temp.left!=null)
            stk.push(temp.left);
        
    }

   }

   static void IteratePostOrder(Node root){
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        Node temp = root;
        while(!stk.isEmpty()){
            temp = stk.pop();
            System.out.print(temp.data + " ");
            
            if(temp.left!=null){
                stk.push(temp.left);
            }
            if(temp.right!=null){
                stk.push(temp.right);
            }
        }
   }

    static Node mirrorTree(Node root){
    	if(root == null) return root;
    	Node ldata = mirrorTree(root.left);
    	Node rdata = mirrorTree(root.right);
    	root.left = rdata;
    	root.right = ldata;
    	return root;
    }
    static int max_level = 0;
    static void LeftViewRecursive(Node root, int level){
       if(root == null) return; 

       if(max_level < level){
        System.out.println(root.data + " ");
        max_level = level;
       }
       LeftViewRecursive(root.left, ++level);
       LeftViewRecursive(root.right, ++level);
    }

    static ArrayList<Integer> LeftView(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        if(root == null) return arr;
        Queue<Node> que = new LinkedList<Node>();
        que.add(root);
        while(!que.isEmpty()){
            for(int i=1 ; i<= que.size(); i++){
                Node temp = que.poll();
                if(i==1)
                    arr.add(temp.data);
                if(temp.left!=null)
                    que.add(temp.left);
                if(temp.right!=null)
                    que.add(temp.right);
            }    
        }
        return arr;
    }
*/
    static void zigzagIteration(Node root){
        Queue<Node> que = new LinkedList<>();
        ArrayList<Integer> stk = new ArrayList<>();
        if(root == null) return;
        que.add(root);

        while(!que.isEmpty()){
            Node temp = que.poll();
            stk.add(temp.data);
            
            if(temp.right!=null)
                que.add(temp.right);
            if(temp.left!=null)
                que.add(temp.left);
        }
        System.out.print(stk);
    }

    static int height(Node root){
    	if(root == null) return 0;
    	int ldepth = height(root.left);	// return 0 if node is null 
    	int rdepth = height(root.right); // return 0 id right is null

    	return Math.max(ldepth,  rdepth) +1;
    }
}

class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}



