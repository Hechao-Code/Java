//¡¾5¡¿1*3*5*7*9*11*13
public class TextWhile06{
	public static void main(String[] args){
		int num = 1;
		int sum = 1;
		while(num<=13){
			sum *=num;
			num +=2;
		}
		System.out.println("ºÍÎª£º"+sum);
	}
}