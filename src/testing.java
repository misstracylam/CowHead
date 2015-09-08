
public class testing {

	public static CardInfo[][] tableCards;
	
	public testing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tableCards = new CardInfo[4][6];
		CardInfo[] tempArray = new CardInfo[6];
		
		CardInfo cardInfo00 = new CardInfo(0,1);
		CardInfo cardInfo01 = new CardInfo(1,1);
		CardInfo cardInfo02 = new CardInfo(2,1);
		CardInfo cardInfo03 = new CardInfo(3,1);
		CardInfo cardInfo04 = new CardInfo(4,1);
		CardInfo cardInfo05 = new CardInfo(5,1);
		CardInfo cardInfo06 = new CardInfo(6,1);
		CardInfo cardInfo07 = new CardInfo(7,1);
		CardInfo cardInfo08 = new CardInfo(8,1);
		CardInfo cardInfo09 = new CardInfo(9,1);
		
		tableCards[0][0] = cardInfo00;
		tableCards[0][1] = cardInfo01;
		tableCards[0][2] = cardInfo09;
		
		
		tableCards[1][0] = cardInfo02;
		tableCards[1][1] = cardInfo03;
		tableCards[1][2] = cardInfo08;
		
		tableCards[2][0] = cardInfo04;
		tableCards[2][1] = cardInfo05;

		
		tableCards[3][0] = cardInfo06;
		tableCards[3][1] = cardInfo07;
		
		showAllTableCards();
		
		//----------------------------------------Line1[0]-------------------------------------------//
		// vs Line2[1]
			// 1. copy 1st row to tempArray
			// 2. make 1st row to be null
			// 3. copy 2nd row to 1st row
			// 4. make 2nd row to be null
			// 5. copy tempArray to 2nd row
		if(tableCards[0][findLastIndex(0)].getCardNum()>tableCards[1][findLastIndex(1)].getCardNum()){
			// 1. copy 1st row to tempArray
			for(int k=0;k<6;k++){
				tempArray[k] = tableCards[0][k];
			}
			
			// 2. make 1st row to be null
			for(int k=0;k<6;k++){
				tableCards[0][k] = null;
			}
			
			// 3. copy 2nd row to 1st row
			for(int k=0;k<findLastIndex(1)+1;k++){
				tableCards[0][k] = tableCards[1][k];
			}
			
			// 4. make 2nd row to be null
			for(int k=0;k<6;k++){
				tableCards[1][k] = null;
			}
			
			int tempArrayLength = 0;
			while(tempArray[tempArrayLength]!=null){
				tempArrayLength++;
			}
			
			// 5. copy tempArray to 2nd row
			for(int k=0;k<tempArrayLength;k++){
				tableCards[1][k] = tempArray[k];
			}
		}
		
		
		
		// vs Line3[2]
			// 1. copy 1st row to tempArray
			// 2. make 1st row to be null
			// 3. copy 3rd row to 1st row
			// 4. make 3rd row to be null
			// 5. copy tempArray to 3rd row
		if(tableCards[0][findLastIndex(0)].getCardNum()>tableCards[2][findLastIndex(2)].getCardNum()){
			// 1. copy 1st row to tempArray
			for(int k=0;k<6;k++){
				tempArray[k] = tableCards[0][k];
			}
			
			// 2. make 1st row to be null
			for(int k=0;k<6;k++){
				tableCards[0][k] = null;
			}
			
			// 3. copy 3rd row to 1st row
			for(int k=0;k<findLastIndex(2)+1;k++){
				tableCards[0][k] = tableCards[2][k];
			}
			
			// 4. make 3rd row to be null
			for(int k=0;k<6;k++){
				tableCards[2][k] = null;
			}
			
			int tempArrayLength = 0;
			while(tempArray[tempArrayLength]!=null){
				tempArrayLength++;
			}
			
			// 5. copy tempArray to 3rd row
			for(int k=0;k<tempArrayLength;k++){
				tableCards[2][k] = tempArray[k];
			}
		}
		
		// vs Line4[3]
			// 1. copy 1st row to tempArray
			// 2. make 1st row to be null
			// 3. copy 4th row to 1st row
			// 4. make 4th row to be null
			// 5. copy tempArray to 4th row
		if(tableCards[0][findLastIndex(0)].getCardNum()>tableCards[3][findLastIndex(3)].getCardNum()){
			// 1. copy 1st row to tempArray
			for(int k=0;k<6;k++){
				tempArray[k] = tableCards[0][k];
			}
			
			// 2. make 1st row to be null
			for(int k=0;k<6;k++){
				tableCards[0][k] = null;
			}
			
			// 3. copy 4th row to 1st row
			for(int k=0;k<findLastIndex(3)+1;k++){
				tableCards[0][k] = tableCards[3][k];
			}
			
			// 4. make 4th row to be null
			for(int k=0;k<6;k++){
				tableCards[3][k] = null;
			}
			
			int tempArrayLength = 0;
			while(tempArray[tempArrayLength]!=null){
				tempArrayLength++;
			}
			
			// 5. copy tempArray to 4th row
			for(int k=0;k<tempArrayLength;k++){
				tableCards[3][k] = tempArray[k];
			}
		}
		
		
		
		
		//----------------------------------------Line2[1]-------------------------------------------//
		// vs Line3[2]
			// 1. copy 2nd row to tempArray
			// 2. make 2nd row to be null
			// 3. copy 3rd row to 2nd row
			// 4. make 3rd row to be null
			// 5. copy tempArray to 3rd row
		if(tableCards[1][findLastIndex(1)].getCardNum()>tableCards[2][findLastIndex(2)].getCardNum()){
			// 1. copy 2nd row to tempArray
			for(int k=0;k<6;k++){
				tempArray[k] = tableCards[1][k];
			}
			
			// 2. make 2nd row to be null
			for(int k=0;k<6;k++){
				tableCards[1][k] = null;
			}
			
			// 3. copy 3rd row to 2nd row
			for(int k=0;k<findLastIndex(2)+1;k++){
				tableCards[1][k] = tableCards[2][k];
			}
			
			// 4. make 3rd row to be null
			for(int k=0;k<6;k++){
				tableCards[2][k] = null;
			}
			
			int tempArrayLength = 0;
			while(tempArray[tempArrayLength]!=null){
				tempArrayLength++;
			}
			
			// 5. copy tempArray to 3rd row
			for(int k=0;k<tempArrayLength;k++){
				tableCards[2][k] = tempArray[k];
			}
		}
		
		
		// vs Line4[3]
			// 1. copy 2nd row to tempArray
			// 2. make 2nd row to be null
			// 3. copy 4th row to 2nd row
			// 4. make 4th row to be null
			// 5. copy tempArray to 4th row
		if(tableCards[1][findLastIndex(1)].getCardNum()>tableCards[3][findLastIndex(3)].getCardNum()){
			// 1. copy 2nd row to tempArray
			for(int k=0;k<6;k++){
				tempArray[k] = tableCards[1][k];
			}
			
			// 2. make 2nd row to be null
			for(int k=0;k<6;k++){
				tableCards[1][k] = null;
			}
			
			// 3. copy 4th row to 2nd row
			for(int k=0;k<findLastIndex(3)+1;k++){
				tableCards[1][k] = tableCards[3][k];
			}
			
			// 4. make 4th row to be null
			for(int k=0;k<6;k++){
				tableCards[3][k] = null;
			}
			
			int tempArrayLength = 0;
			while(tempArray[tempArrayLength]!=null){
				tempArrayLength++;
			}
			
			// 5. copy tempArray to 4th row
			for(int k=0;k<tempArrayLength;k++){
				tableCards[3][k] = tempArray[k];
			}
		}
		
		//----------------------------------------Line3[2]-------------------------------------------//
		// vs Line4[3]
			// 1. copy 3rd row to tempArray
			// 2. make 3rd row to be null
			// 3. copy 4th row to 3rd row
			// 4. make 4th row to be null
			// 5. copy tempArray to 4th row
		if(tableCards[2][findLastIndex(2)].getCardNum()>tableCards[3][findLastIndex(3)].getCardNum()){
			// 1. copy 3rd row to tempArray
			for(int k=0;k<6;k++){
				tempArray[k] = tableCards[2][k];
			}
			
			// 2. make 3rd row to be null
			for(int k=0;k<6;k++){
				tableCards[2][k] = null;
			}
			
			// 3. copy 4th row to 3rd row
			for(int k=0;k<findLastIndex(3)+1;k++){
				tableCards[2][k] = tableCards[3][k];
			}
			
			// 4. make 4th row to be null
			for(int k=0;k<6;k++){
				tableCards[3][k] = null;
			}
			
			int tempArrayLength = 0;
			while(tempArray[tempArrayLength]!=null){
				tempArrayLength++;
			}
			
			// 5. copy tempArray to 4th row
			for(int k=0;k<tempArrayLength;k++){
				tableCards[3][k] = tempArray[k];
			}
		}
		
		
		
		
		/*
		// 0 vs 1 only
		if(tableCards[0][findLastIndex(0)].getCardNum()>tableCards[1][findLastIndex(1)].getCardNum()){
			for(int k=0;k<6;k++){
				tempArray[k] = tableCards[0][k];
			}
			
			for(int k=0;k<6;k++){
				tableCards[0][k] = null;
			}
			
			for(int k=0;k<findLastIndex(1)+1;k++){
				tableCards[0][k] = tableCards[1][k];
			}
			
			for(int k=0;k<6;k++){
				tableCards[1][k] = null;
			}
			
			int tempArrayLength = 0;
			while(tempArray[tempArrayLength]!=null){
				tempArrayLength++;
			}
			
			for(int k=0;k<tempArrayLength;k++){
				tableCards[1][k] = tempArray[k];
			}
		}
		*/
		
		System.out.println("");
		showAllTableCards();

	}

	private static int findLastIndex(int rowNum) {
		int columnNum=0;
		while(tableCards[rowNum][columnNum]!=null){
			columnNum++;
		}
		return columnNum-1;
	}
	
	private static void showAllTableCards() {
		System.out.println("Table cards: ");
		for(int i=0;i<4;i++){
			int a=0;
			while(tableCards[i][a]!=null){
				System.out.print(tableCards[i][a].getCardNum()+"("+tableCards[i][a].getCowHeadNum()+") ");
				a++;
			}
			System.out.println("");
		}
	}
}
