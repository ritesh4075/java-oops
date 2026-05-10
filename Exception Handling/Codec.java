import java.util.*;

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node == null) {
                res.append("x ");
            }else{
                res.append(node.val+" ");
                q.add(node.left);
                q.add(node.right);
            }
        }
        return res.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")) return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] value = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(value[0]));
        q.add(root);
        for(int i = 1;i < value.length;i++) {
            TreeNode node = q.poll();
            if(!value[i].equals("x")){
                TreeNode left2 = new TreeNode(Integer.parseInt(value[i]));
                node.left = left2;
                q.add(left2);
            }
            i++;
            if(i < value.length && !value[i].equals("x")){
                TreeNode right2 = new TreeNode(Integer.parseInt(value[i]));
                node.right = right2;
                q.add(right2);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Codec ser = new Codec();
        Codec deser = new Codec();
        // Creating Tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        //  Serialize : root to String
        String data = ser.serialize(root);
        System.out.println("Serialized: "+data);
         
        // Deserialize : String to root
        TreeNode ans = deser.deserialize(data);
        System.out.println("Deserialized: "+ans.left.val);
        System.out.println("Deserialized: "+ans.val);
        try{
            System.out.println("Deserialized: "+ans.right.right.val);
            
        }catch(Exception e){
            System.out.println("Aage kuchh nhi hai");
            // return null;
        }
        System.out.println("Deserialized: "+ans.right.val);
    }
}