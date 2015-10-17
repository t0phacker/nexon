package problem6;

public class SumManyTypes {
	// 3에서 91까지의 자연수를 더하는 메서드
	public static int sumNaturalNum(int numFrom, int numTo) {
		int n = numTo - numFrom + 1;
		int res = ((numFrom + numTo) * n) / 2; // 등차수열의 합 공식을 이용하여 시간복잡도 O(1)
		return res;
	}

	// 1에 1을 더하는 메서드
	public static int sumTwoSameNum(int num) {
		if (num == 0) {
			return 0;
		}
		int res = num << 1; // 곱하기 2를 할 때 좌측 쉬프트 연산의 수행 속도가 가장 빠름
		return res;
	}

	// 1에서 100까지의 소수(decimal) 전부를 더하는 메서드
	public static int sumPrimeNum(int numFrom, int numTo) {
		int n = numTo - numFrom + 1;
		int sum = ((numFrom + numTo) * n) / 2;
		int[] arr = new int[n];
		int startNum = numFrom;

		for (int i = 0; i < n; i++) {
			arr[i] = startNum++;
		}

		for (int denom = 2; denom <= n; denom++) {
			for (int numerator = 0; numerator < n; numerator++) {
				if (arr[numerator] != denom && arr[numerator] % denom == 0
						&& arr[numerator] != 0) {
					sum -= arr[numerator];
					arr[numerator] = 0;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int resSum3To91 = sumNaturalNum(3, 91);
		int resSum1And1 = sumTwoSameNum(1);
		int resSumPrimeNum = sumPrimeNum(1, 100);
	}
}
