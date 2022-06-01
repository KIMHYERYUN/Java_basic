package gmail.jaydenkhr.fourth;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 각 열은 3개이고 행은 2개인 행렬 생성
		int [][] scores = {{10,20,30}, {40,50,60}};
		
		//모든 데이터를 접근
		int rows = scores.length;
		int cols = scores[0].length;
		
		//행을 순회
		for(int i=0; i<rows; i=i+1) {
			//각 행의 열을 순회
			for(int j=0; j<cols; j=j+1) {
				System.out.print(scores[i][j]+"\t");
            }
			System.out.println("");
		   }
		String [][] names = {{"가","나","다"},{"라","마","바"}};
		
		
		//열 먼저 순회
		int row1 = names.length;
		int col1 = names[0].length;
		
		for(int i=0; i<col1; i=i+1) {
			for(int j=0; j<row1; j=j+1) {
			System.out.print(names[j][i]+"\t");
		}
		System.out.println("");
	   }	
		
	}

}
