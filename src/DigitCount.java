import java.util.Arrays;

public class DigitCount {
	public static void main(String[] args) {
		int arr[]={5,10,15,20,25,30,35,40};
		System.out.println(Arrays.toString(arr));
		arr=move(arr,5,2);
		System.out.println(Arrays.toString(arr));
	}

	private static int countOnes(int n) {
		return getCount(n, 0);
	}

	private static int getCount(int n, int c) {
		if (n == 0)
			return c;
		if (n % 10 == 1)
			c++;
		return getCount(n / 10, c);
	}

	static int maxRun(int nums[]) {
		int res = -1, max = 0;
		for (int i = 0; i < nums.length; i++) {
			max = 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					max++;
			}
			if (res < max)
				res = max;
		}

		return res;
	}
static int [] move(int []nums,int startingLocation,int finalLocation){
	
	int temp=nums[startingLocation];
	for(int i=startingLocation-1;i>=finalLocation;i--){
		nums[i+1]=nums[i];
	}
	nums[finalLocation]=temp;
	return nums;
}
}
