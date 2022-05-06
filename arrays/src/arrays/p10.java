package arrays;

public class p10 {
	public static void main(String[] args)

	{
	int[] a1d = {};
	int[] b1d = {1, 3};
	int[][] a2d = {};
	int[][] b2d = {{}};
	int[][] c2d = {{1, 2}, {5}};
	System.out.print(a1d.length + " " + b1d.length + "");
	System.out.print(a2d.length + " " + a2d[0].length + "" + b2d.length + " " + b2d[0].length + " ");
	System.out.print(c2d.length + " " + c2d[0].length + "" + c2d[1].length);
	}
	
}
