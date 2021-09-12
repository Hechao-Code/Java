//1+2+3+4+5.....200
public class TextWhile07{
	public static void main(String[] args){
		int num = 201;
		int sum = 0;
		while(num<=200){
			sum += num;
			num++;
		}
		System.out.println(num);//201
		System.out.println(sum);//0
	}
}

class TextDowhile01{
	public static void main(String[] args){
		int num = 201;
		int sum = 0;
		do{
			sum += num;
			num++;
		}while(num<=200);
		System.out.println(num);//202
		System.out.println(sum);//201
	}
}