package arrays;

import java.util.Scanner;

public class p9 {
	public static void main(String args[])

	{

	try (Scanner sc = new Scanner(System.in)) {
		int arr_size = sc.nextInt();

		int arr[] = new int[arr_size];

		int i;

		for(i = 0; i < arr_size; i++)

		{

		arr[i] = sc.nextInt();

		}

		int search_elem = sc.nextInt();

		int count =0;
		for(i = 0; i < arr_size; i++)

		{

		if(arr[i] == search_elem)

		{

		count++;

		}

		}

		System.out.print(count);
	}

	}

}
