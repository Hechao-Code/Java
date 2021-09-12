//¡¾1¡¿1+2+3+4+5+¡£¡£¡£¡£+100
public class TextWhile02{
	public static void main(String[] args){
		int num = 1;
		int sum = 0;
		while(num<=100){
			sum += num;
			num++;
		}
		System.out.println("ºÍÎª£º"+sum);
	}
}