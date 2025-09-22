public class ConvertSortedArrayToBinarySearchTree {

        public TreeNode sortedArrayToBST(int[] nums) {
            return helper(nums,0,nums.length-1);
        }
        //-10,-3,0,5,9
        public TreeNode helper(int[] nums, int left, int right){
            if(left > right){
                return null;
            }
            int mid = (left + right) /2; //first fine middle index
            TreeNode root = new TreeNode(nums[mid]); //create root
            root.left = helper(nums,left,mid-1); //now recall the helper function  and pass in the left hand side of the array before the middle index
            //then assign it to root's left and keep repeating the process until left > right (in this case would be mid -1)
            root.right = helper(nums,mid+1,right); //same process as above but start from mid as left and right which is arr.length -1

            return root;
        }

}
