/*  1<=a<=5  
	3<=b<=6
求a+b=7的所有可能 (二元一次方程组)
*/	
public class TextFor17{
	public static void main(String[] args){
		for(int a = 1;a<=5;a++){
			for(int b = 3;b<=6;b++){
				if(a+b==7){
					System.out.println("a为："+a+"\tb为："+b);
				}
			}
		}
	}
}