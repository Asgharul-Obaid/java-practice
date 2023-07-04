package arraysProgram;
class RotationArray {
	public void rotate(int[] nums, int k) {
		for (int i = 0; i <= k; i++) {
			leftsSwapOfElement(nums);
		}	
	}
	public void leftsSwapOfElement(int[] nums) {
		int temp = nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];
		}
		nums[nums.length - 1] = temp;
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		RotationArray objArray = new RotationArray();
		objArray.leftsSwapOfElement(a);
		System.out.println();
		objArray.rotate(a, 0);

	}
}
