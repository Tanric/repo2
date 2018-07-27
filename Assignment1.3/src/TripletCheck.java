import java.util.Scanner;

public class TripletCheck  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the size array:");
		int size=sc.nextInt();
		int[] elements= new int[size];
		//System.out.println("Enter array elements:");
		for(int j=0;j<size;j++){
			elements[j]=sc.nextInt();
		}
		UserMainCode obj=new UserMainCode();
		obj.checkTripplets(elements);		
	}

}
