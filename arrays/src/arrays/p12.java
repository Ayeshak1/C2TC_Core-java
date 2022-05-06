package arrays;

public class p12 {
	public static void main(String[] args) {

		int arr[]= {1,0,1,1,1,0,0};

		int sum=0;

		for(int i=0;i<arr.length;i++)

		{

		if(arr[i]==1)

		sum=sum+3;

		else

		sum=sum-1;

		}

		System.out.println("Total Marks Obtained :"+ sum);

		} 
}
