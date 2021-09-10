public class TextVar7{
	public static void main(String[] args){
		char ch1='ÖÐ';
		System.out.println(ch1);
		System.out.println(ch1+70); //20083
		System.out.println(20083-ch1); //70
		
		//×ª»»£»
		int num1=(int)ch1;
		System.out.println(num1); //20013
		
		char ch2=(char)20013;
		System.out.println(ch2);
		
		int num2='ÖÐ';
		System.out.println(num2);
		
		char ch3=20013;
		System.out.println(ch3);
		
		char ch4='2'+2;
		System.out.println(ch4); //4
		
		
	}
}