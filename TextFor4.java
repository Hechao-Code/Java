 //功能：求1-100的和，当和第一次超过300的时候，停止程序
public class TextFor4{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1;i<=100;i++){
			sum += i;
			System.out.println(sum);
			if(sum>300){
				break;
			}
		}
		
	}
}