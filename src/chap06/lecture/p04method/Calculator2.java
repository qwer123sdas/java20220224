package chap06.lecture.p04method;

public class Calculator2 {
	
	// varargs (가변길이 매개변수)
	int sum(int...nums){ // 0개부터 무한대
		System.out.println("nums의 길이 : " + nums.length);
		int sum = 0;
		for(int num : nums) {
			sum +=num;
		}
		return sum;
	}
	
	// 가변길이 매개변수는 항상 마지막에 작성
	// int varSum(int...nums, String name) 이렇게 안됨
	int varSum(String name, int...nums) {
		return 0;
	}

	public void concat(String...strs) {
		// TODO Auto-generated method stub
		for(String str : strs) {
			System.out.print(str);
		}
		System.out.println();
	}
	
//	String concat(String...nums) {
//		String add = "";
//		for(int i=0; i<nums.length; i++) {
//			add += nums[i];
//		}
//		return add;
//	}
}
