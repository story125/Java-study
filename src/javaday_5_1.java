
public class javaday_5_1 {
	 public static void main(String[] args) {
	       for(int i =1 ; i<=10;i++) {
	      System.out.println((int)(Math.random() * 6 + 1) );
	       }
	       
	       System.out.println("===============");
	       
	       Random random = new Random();
	       for(int i =0; i<=10;i++) {
	       System.out.println(random.nextInt(6)+1);
	   }
	       
	       
	       
	   }
}
