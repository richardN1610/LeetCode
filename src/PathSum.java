public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        int remainder = targetSum - root.val;
        if (root.left == null && root.right == null && remainder == 0) return true;
        return hasPathSum(root.left, remainder) || hasPathSum(root.right, remainder);
    }
//    call hasPathSum(5,22)
//    call hasPathSum(4,17)
//    call hasPathSum(11,13)
//    call hasPathSum(7,2) → false
//    call hasPathSum(3,2) → false
//            return false to 4
//    call hasPathSum(1,13) → false
//            return false to 5
//    call hasPathSum(8,17) → ...
//target = 22
//                 5
//                / \
//               4   8
//              / \ / \
//             11 1 13  4
//            /  \       \
//           7    3       5
//root call (5)
//├─ left call (4)
//│  ├─ left call (11)
//│  │  ├─ left call (7) → returns false (back to 11)
//            │  │  └─ right call (3) → returns false (back to 11)
//            │  └─ right call (1) → returns false (back to 4)
//            └─ right call (8) → eventually returns true
//}

}
