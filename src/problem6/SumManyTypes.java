package problem6;

public class SumManyTypes {
	// 3���� 91������ �ڿ����� ���ϴ� �޼���
	public static int sumNaturalNum(int numFrom, int numTo) {
		int n = numTo - numFrom + 1;
		int res = ((numFrom + numTo) * n) / 2; // ���������� �� ������ �̿��Ͽ� �ð����⵵ O(1)
		return res;
	}

	// 1�� 1�� ���ϴ� �޼���
	public static int sumTwoSameNum(int num) {
		if (num == 0) {
			return 0;
		}
		int res = num << 1; // ���ϱ� 2�� �� �� ���� ����Ʈ ������ ���� �ӵ��� ���� ����
		return res;
	}

	// 1���� 100������ �Ҽ�(decimal) ���θ� ���ϴ� �޼���
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
