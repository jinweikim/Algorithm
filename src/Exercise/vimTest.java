package Exercise;

import java.util.LinkedList;

public class vimTest {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null) {
            return false;
        }
        if (B == null) {
            return false;
        }
        return (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    public boolean recur(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (A.val != B.val) {
            return false;
        }
        return recur(A.left, B.left) && recur(A.right, B.right);
    }

    public TreeNode serialize(TreeNode root, StringBuilder str) {
        if (root == null) {
            str.append("#");
            return null;
        }
        str.append(root.val);
        root.left = serialize(root.left, str);
        root.right = serialize(root.right, str);
        return root;
    }

    public String removeNull(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int j = stringBuilder.length() - 1; j > 0; j--) {
            if (stringBuilder.charAt(j) == '#') {
                stringBuilder.delete(j, j + 1);
            } else {
                break;
            }
        }
        LinkedList<String> list = new LinkedList<>();
        int[] nums =new int[90];
        return stringBuilder.toString();
    }
}
