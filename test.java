/*u10316035
 * Lin Tz Hau
 */
 
 //test program to test sort code
public class test{
	//main method
	public static void main(String[] args){
		//example array that asked
		int[][] example = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		//print array before sorted
		System.out.println("Array before sorted : ");
		System.out.print("{");
		for(int i = 0;i < example.length;i++){
			System.out.print("{" + example[i][0] + ", " + example[i][1] + "}");
		}
		System.out.println("}");
		
		//create an object
		sort show = new sort();
		//sort the array
		show.sortArray(example);
		//print array after sorted
		System.out.println("Array after sorted : ");
		System.out.print("{");
		for(int i = 0;i < example.length;i++){
			System.out.print("{" + example[i][0] + ", " + example[i][1] + "}");
		}
		System.out.println("}");
		
	}
}
