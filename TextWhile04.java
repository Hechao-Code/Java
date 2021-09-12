//¡¾3¡¿5+10+15+20+¡£¡£¡£+100
public class TextWhile04{
	public static void main(String[] args){
		int num = 5;
		int sum = 0;
		while(num<=100){
			sum +=num;
			num +=5;
		}
		System.out.println("ºÍÎª£º"+sum);
	}
}