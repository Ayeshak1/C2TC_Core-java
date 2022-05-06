package arrays;

import java.util.Scanner;

public class p7 {
	public static void main(String
			args[]){

			try (Scanner sc = new Scanner(System.in)) {
				int arr_size = sc.nextInt();

				int arr[] = new int[arr_size];

				int i;

				for(i = 0; i < arr_size; i++)

				{

				arr[i] = sc.nextInt();

				}

				int search_elem = sc.nextInt();

				int is_matched = 0;

				for(i = 0; i < arr_size; i++)

				{
					if(arr[i] == search_elem)

					{

					is_matched = 1;

					break;

					} }

					if(is_matched == 1)

					{
					System.out.print("Found");

					}

					else

					{

					System.out.print("Not Found");

					}
			}

				}

				
			}