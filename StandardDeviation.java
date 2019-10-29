public class StandardDeviation{
	public static void main(String[] args){
		double[] arr={1,2,3,4,5,6,7,8,9,10};
		double sd= calculateSD(arr);
		double mean=calculatemean(arr);

		System.out.format("Standard Deviation= %.6f\n",sd);
		System.out.format("Mean = %.3f\n",mean);
		System.out.format("Variance = %.3f\n",Math.pow(sd,2));
	}
	public static double calculateSD(double arr[]){
		double sum = 0.0, standardDeviation = 0.0;
		int length = arr.length;

		for (double num : arr){
			sum+=num;
		}
		double mean = sum/length;

		for(double num : arr){
			standardDeviation += Math.pow(num-mean,2);
		}
		return Math.sqrt(standardDeviation/length);
	}
	public static double calculatemean(double arr[]){
		double sum = 0.0;
		int length = arr.length;

		for (double num : arr){
			sum+=num;
		}
		double mean = sum/length;
		return mean;
	}
}