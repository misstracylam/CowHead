import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameEngine {
	
	public int playerNum;
	
	public CardInfo[] cards;
	
	public CardInfo[][] tableCards;
	
	public CardInfo[] cardsPlayedByPlayers;

	public GameEngine() {
		// TODO Auto-generated constructor stub
	}
	
	public void run(){
		
		// Make cards:
		cards = new CardInfo[104];
		
		int cowHead;
		for(int i=0; i<104; i++){
			if (i==4||i==14||i==24||i==34||i==44||i==64||i==74||i==84||i==94){
				cowHead = 2;
			}else if(i==9||i==19||i==29||i==39||i==49||i==59||i==69||i==79||i==89||i==99){
				cowHead = 3;
			}else if(i==10||i==21||i==32||i==43||i==65||i==76||i==87||i==98){
				cowHead = 5;
			}else if(i==54){
				cowHead = 7;
			}else{
				cowHead = 1;
			}
			cards[i] = new CardInfo(i+1,cowHead);
		} 
		
		System.out.println("Card info:");
		for(int i=0;i<104;i++){
			System.out.print(cards[i].getCardNum()+"("+cards[i].getCowHeadNum()+") ");
			if(i==9||i==19||i==29||i==39||i==49||i==59||i==69||i==79||i==89||i==99){
				System.out.println("");
			}
		}
		
//		System.arraycopy(cards, 0, washedCards, 103, 104);
//		
		
		// Wash cards:
		System.out.println("");
		Random ran = new Random();
		int randomPos;
		for(int i=0; i<cards.length; i++){
			do{
				randomPos = ran.nextInt(cards.length);
				CardInfo temp = cards[i];
				cards[i] = cards[randomPos];
				cards[randomPos] = temp;
			}while(randomPos==i);
		}
		
		System.out.println("");
		System.out.println("Washed card:");
		for(int i=0;i<104;i++){
			System.out.print(cards[i].getCardNum()+"("+cards[i].getCowHeadNum()+") ");
			if(i==9||i==19||i==29||i==39||i==49||i==59||i==69||i==79||i==89||i==99){
				System.out.println("");
			}
		}
		
		// How many players:
		System.out.println("");
		System.out.println("");
		System.out.print("How many players: ");
		Scanner input = new Scanner(System.in);
		playerNum = input.nextInt();
		System.out.println("Players number: "+playerNum+"");
		System.out.println("");
		
		// Order hand cards:
		for(int k=0;k<playerNum;k++){
			for(int i=(k*10);i<((k+1)*10)-1;i++){
				for(int j=0;j<((k+1)*10)-1-i;j++){
					CardInfo temp = cards[i];
					if(cards[i].getCardNum()>cards[i+1+j].getCardNum()){
						cards[i] = cards[i+1+j];
						cards[i+1+j] = temp;
					}
				}
			}
		}
		
		// Order table cards:
		for(int i=playerNum*10;i<((playerNum*10)+4)-1;i++){
			for(int j=0;j<((playerNum*10)+4)-1-i;j++){
				CardInfo temp = cards[i];
				if(cards[i].getCardNum()>cards[i+1+j].getCardNum()){
					cards[i] = cards[i+1+j];
					cards[i+1+j] = temp;
				}
			}
		}

		System.out.println("Ordered washed cards:");
		for(int i=0;i<104;i++){
			System.out.print(cards[i].getCardNum()+"("+cards[i].getCowHeadNum()+") ");
			if(i==9||i==19||i==29||i==39||i==49||i==59||i==69||i==79||i==89||i==99){
				System.out.println("");
			}
		}
		
		
		System.out.println("");
		System.out.println("");
		
		for(int i=0;i<playerNum;i++){
			System.out.println("Player "+(i+1)+" hand cards: ");
			for(int j=0;j<10;j++){
				System.out.print(cards[i*10+j].getCardNum()+"("+cards[i*10+j].getCowHeadNum()+") ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("Table cards: ");
		for(int i=playerNum*10;i<((playerNum*10)+4);i++){
			System.out.print(cards[i].getCardNum()+"("+cards[i].getCowHeadNum()+") ");
		}
		
		
		System.out.println("");
		
		tableCards = new CardInfo[4][6];
		
		for(int i=0;i<4;i++){
			tableCards[i][0] = cards[(playerNum*10)+i];
		}

		
		cardsPlayedByPlayers = new CardInfo[10];
		
		for(int l=0;l<10;l++){
		System.out.println("");
		System.out.println("****************Round "+(l+1)+"********************");
			
		// *********** player choose what card to place
		for(int i=0;i<playerNum;i++){
			cardsPlayedByPlayers[i] = cards[(i*10+(l))];
		}
		
		System.out.println("Cards played by players");
		for(int i=0;i<playerNum;i++){
			System.out.print(cardsPlayedByPlayers[i].getCardNum()+"("+cardsPlayedByPlayers[i].getCowHeadNum()+") ");
		}
		
		for(int i=0;i<playerNum-1;i++){
			for(int j=0;j<playerNum-1-i;j++){
				CardInfo temp = cardsPlayedByPlayers[i];
				if(cardsPlayedByPlayers[i].getCardNum()>cardsPlayedByPlayers[i+1+j].getCardNum()){
					cardsPlayedByPlayers[i] = cardsPlayedByPlayers[i+1+j];
					cardsPlayedByPlayers[i+1+j] = temp;
				}
			}
		}
		
		
		System.out.println("");
		System.out.println("Ordered Cards played by players");
		for(int i=0;i<playerNum;i++){
			System.out.print(cardsPlayedByPlayers[i].getCardNum()+"("+cardsPlayedByPlayers[i].getCowHeadNum()+") ");
		}
		
		System.out.println("");
		System.out.println("");
		
		
		// Let played card put into ordered table card
		for(int i=0;i<playerNum;i++){
			if(cardsPlayedByPlayers[i].getCardNum()<tableCards[0][findLastIndex(0)].getCardNum()){
				showAllTableCards();
				eatOneLine(i, 0);
			}else if(cardsPlayedByPlayers[i].getCardNum()<tableCards[1][findLastIndex(1)].getCardNum()){
				if((findLastIndex(0)+1)<5){
					tableCards[0][findLastIndex(0)+1] = cardsPlayedByPlayers[i];
					System.out.println("Put a value in line 1");
				}else{
					showAllTableCards();
					eatOneLine(i, 1);
				}
			}else if(cardsPlayedByPlayers[i].getCardNum()<tableCards[2][findLastIndex(2)].getCardNum()){
				if((findLastIndex(1)+1)<5){
					tableCards[1][findLastIndex(1)+1] = cardsPlayedByPlayers[i];
					System.out.println("Put a value in line 2");
				}else{
					showAllTableCards();
					eatOneLine(i, 2);
				}
			}else if(cardsPlayedByPlayers[i].getCardNum()<tableCards[3][findLastIndex(3)].getCardNum()){
				if((findLastIndex(2)+1)<5){
					tableCards[2][findLastIndex(2)+1] = cardsPlayedByPlayers[i];
					System.out.println("Put a value in line 3");
				}else{
					showAllTableCards();
					eatOneLine(i, 3);
				}
			}else{
				if((findLastIndex(3)+1)<5){
					tableCards[3][findLastIndex(3)+1] = cardsPlayedByPlayers[i];
					System.out.println("Put a value in line 4");
				}else{
					eatOneLine(i,4);
				}
			}
		}
		showAllTableCards();
	}
		
		System.out.println("\n\n****************End Game!********************");
	}
		
		private void showAllTableCards() {
			System.out.println("Table cards: ");
			for(int i=0;i<4;i++){
				int columnIndex = 0;
				System.out.print("Line"+(i+1)+": ");
				while(tableCards[i][columnIndex]!=null){
					System.out.print(tableCards[i][columnIndex].getCardNum()+"("+tableCards[i][columnIndex].getCowHeadNum()+") ");
					columnIndex++;
				}
				
				/*
				int cowHeadNum = 0;
				for(int j=0;j<columnIndex;j++){
					cowHeadNum = cowHeadNum + tableCards[i][columnIndex-1].getCowHeadNum();
				}
				System.out.print("Total cow head: "+cowHeadNum);
				//cowHeadNum = 0;
				//System.out.println(columnIndex);
				 */
				
				System.out.println("");
			}
		
	}

		private void eatOneLine(int playedCardsOrderNum, int eatWhichLine) {
			int eatLineNum;
			
			if(eatWhichLine==0){
				// 1. enter one line to eat
				System.out.println("Please eat a line!");
				Scanner input = new Scanner(System.in);
				eatLineNum = input.nextInt();
			}else{
				eatLineNum = eatWhichLine;
			}

			System.out.println("You eat line "+eatLineNum);
			
		// 2. count this line cow head number
			System.out.println("You eat XX CowHead!!");
			
		// 3. copy last -> temp
			CardInfo temp = cardsPlayedByPlayers[playedCardsOrderNum];
			
		// 4. empty this line
			for(int i=0;i<5;i++){
				tableCards[eatLineNum-1][i]=null;
			}
			
		// 5. temp -> 1
			tableCards[eatLineNum-1][0] = temp;
			
		// 6. order table cards
			orderTableCardsByLastCard();
			System.out.println("");
	}
	
	private void orderTableCardsByLastCard() {
		CardInfo[] tempArray = new CardInfo[6];
		
		for(int i=0;i<4-1;i++){
			for(int j=0;j<(4-(i+1));j++){
				if(tableCards[i][findLastIndex(i)].getCardNum()>tableCards[i+1+j][findLastIndex(i+1+j)].getCardNum()){
					for(int k=0;k<6;k++){
						tempArray[k] = tableCards[i][k];
					}
					
					for(int k=0;k<6;k++){
						tableCards[i][k] = null;
					}
					
					for(int k=0;k<findLastIndex(i+1+j)+1;k++){
						tableCards[i][k] = tableCards[i+1+j][k];
					}
					
					for(int k=0;k<6;k++){
						tableCards[i+1+j][k] = null;
					}
					
					int tempArrayLength = 0;
					while(tempArray[tempArrayLength]!=null){
						tempArrayLength++;
					}
					
					for(int k=0;k<tempArrayLength;k++){
						tableCards[i+1+j][k] = tempArray[k];
					}
				}
			}
		}
	}
	
	public int findLastIndex(int rowNum){
		int columnNum=0;
		while(tableCards[rowNum][columnNum]!=null){
			columnNum++;
		}
		return columnNum-1;
	}
}

/*
// order card
for(int i=0;i<cards.length-1;i++){
	for(int j=0;j<cards.length-1-i;j++){
		CardInfo temp = cards[i];
		if(cards[i].getCardNum()>cards[i+1+j].getCardNum()){
			cards[i] = cards[i+1+j];
			cards[i+1+j] = temp;
		}
		
	}
}
*/
