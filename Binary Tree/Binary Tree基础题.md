**Binary Tree基础题：前序/中序/后序遍历**

---

**144.Binary Tree Preorder Traversal**
```java
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorderResult = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = root;

        int nodeLeft = 10000;
        int nodeRight = 2000;
        int nodeUp = 3000;

        int nodeState = nodeLeft;

        while(node != null){
            if(nodeState == nodeLeft){
                preorderResult.add(node.val);
                if(node.left != null){
                    stack.push(node);
                    node = node.left;
                }else{
                    nodeState= nodeRight;
                }
            }else if(nodeState == nodeRight){
                if(node.right != null){
                    stack.push(node);
                    node = node.right;
                    nodeState = nodeLeft;
                }else{
                    nodeState = nodeUp;
                }
            }else if(nodeState == nodeUp){
                TreeNode parent = null;
                if(!stack.isEmpty()){
                    parent = stack.pop();
                    if(parent.left == node){
                        nodeState = nodeRight;
                    }
                }
                node = parent;
            }
        }
        return preorderResult;
    }
}

```

---

**Binary Tree Inorder Traversal**

```java
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderResult = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = root;

        int nodeLeft = 10000;
        int nodeRight = 2000;
        int nodeUp = 3000;

        int nodeState = nodeLeft;

        while(node != null){
            if(nodeState == nodeLeft){
                if(node.left != null){
                    stack.push(node);
                    node = node.left;
                }else{
                    nodeState= nodeRight;
                }
            }else if(nodeState == nodeRight){
                inorderResult.add(node.val);
                if(node.right != null){
                    stack.push(node);
                    node = node.right;
                    nodeState = nodeLeft;
                }else{
                    nodeState = nodeUp;
                }
            }else if(nodeState == nodeUp){
                TreeNode parent = null;
                if(!stack.isEmpty()){
                    parent = stack.pop();
                    if(parent.left == node){
                        nodeState = nodeRight;
                    }
                }
                node = parent;
            }
        }
        return inorderResult;
    }
}

```

---

**Binary tree Postorder Traversal**

```java
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorderResult = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = root;

        int nodeLeft = 10000;
        int nodeRight = 2000;
        int nodeUp = 3000;

        int nodeState = nodeLeft;

        while(node != null){
            if(nodeState == nodeLeft){
                if(node.left != null){
                    stack.push(node);
                    node = node.left;
                }else{
                    nodeState= nodeRight;
                }
            }else if(nodeState == nodeRight){
                if(node.right != null){
                    stack.push(node);
                    node = node.right;
                    nodeState = nodeLeft;
                }else{
                    nodeState = nodeUp;
                }
            }else if(nodeState == nodeUp){
                postorderResult.add(node.val);
                TreeNode parent = null;
                if(!stack.isEmpty()){
                    parent = stack.pop();
                    if(parent.left == node){
                        nodeState = nodeRight;
                    }
                }
                node = parent;
            }
        }
        return postorderResult;
    }
}

```