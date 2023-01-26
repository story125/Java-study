import java.util.Random;

public class javaday_6_2 {

	public static void main(String[] args) {
		
		String number[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		char symbol[] = {'¢¼','¡Þ','¢¾','¢¿'};
		int card[] = new int[52];
		for(int i =0;i<card.length;i++) {
			card[i] = i;
		}
		for(int i =0;i<card.length;i++) {
			System.out.printf("%2c ",symbol[card[i]/13]);	// ¹«´Ì¸¸
			System.out.printf("%s ",number[card[i]%13]);	// ¼ýÀÚ¸¸
			if((i+1)%13 == 0) {
				System.out.println();
			}
		}
		System.out.printf("===========================¼¯±âÀü=======================\n");
		
		Random random = new Random();
		for(int i =0;i<10000;i++) {
			int r = random.nextInt(51)+1;
			int temp = card[0];
			card[0] = card[r];
			card[r] = temp;	
		}
		for(int i =0;i<card.length;i++) {
			System.out.printf("%2c ",symbol[card[i]/13]);	
			System.out.printf("%s ",number[card[i]%13]);	
			if((i+1)%13 == 0) {
				System.out.println();
			}
		}
		System.out.printf("===========================¼¯ÀºÈÄ=======================\n");
		
		
		
	}
}
