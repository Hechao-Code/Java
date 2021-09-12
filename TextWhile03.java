//¡¾2¡¿2+4+6+8+¡£¡£¡£¡£+998+1000
public class TextWhile03{
	public static void main(String[] args){
		int num = 2;
		int sum = 0;
		while(num<=1000){
			sum +=num;
			num +=2;
		}
		System.out.println("ºÍÎª£º"+sum);
	}
}