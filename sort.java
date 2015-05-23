/*u10316035
 * Lin Tz Hau
 */
public class sort {
	//NO-ARG constructor
	sort(){
	
	}
	//method to sort two-di array
	public static void sortArray(int m[][]){
		//temp array to store
		int temp[][] = new int[1][1];
		//bubble sort
		for(int i = 0;i < m.length; i++){
			for(int j = 0;j < m.length - 1; j++){
				//compare first element first
				if(m[i][0] < m[j][0]){
					temp[0] = m[i];
					m[i] = m[j];
					m[j] = temp[0];
				}
				//if the first element equals to each, compare second element
				if(m[i][0] == m[j][0]){
					if(m[i][1] < m[j][1]){
						temp[0] = m[i];
						m[i] = m[j];
						m[j] = temp[0];
					}
				}
			}
		}
	}
}


