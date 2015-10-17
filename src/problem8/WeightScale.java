package problem8;

public class WeightScale {
	public static double scaleByLttd(double mass, double lttd) {
		final double GRVT_ACC_EQUATOR = 9.78;
		final double GRVT_ACC_POLE = 9.982;
		final double GRVT_ACC_DIFF = GRVT_ACC_POLE - GRVT_ACC_EQUATOR;

		double grvtAccPlus = GRVT_ACC_DIFF * (lttd / 90);
		double grvtByLttd = GRVT_ACC_EQUATOR + grvtAccPlus;
		double weight = mass * grvtByLttd;

		return weight;
	}

	public static void main(String[] args) {
		double res = scaleByLttd(70, 38);
	}
}
