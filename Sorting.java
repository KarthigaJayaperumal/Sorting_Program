package april_program;

public class Sorting {
	//Sorting in Ascending Order

	public static void main(String[] args) {
		int[] array= {23,42,15,30,54,20,5};
		int temp=0;
			System.out.println("Numbers Before Sorting");
			for(int i=0;i<array.length;i++) {
			System.out.println(" "+array[i]);					
			}
		for(int j=1;j<array.length;j++) {
		  for(int i=0;i<array.length-j;i++) 
			{
		  if(array[i]>array[i+1]) {
			temp=array[i];
			array[i]=array[i+1];
			array[i+1]=temp;
		    }}
		
	     }
		System.out.println("Numbers After Sorting");
		for(int i=0;i<array.length;i++) {
		
		System.out.println(" "+array[i]);}
		}}
	


