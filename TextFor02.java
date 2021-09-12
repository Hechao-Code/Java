//功能：求1-100的和，当和第一次超过300的时候，停止程序
public class TextFor02{
	public static void main(String[] args){
		int sum = 0;
		outer:
		for(int num = 1;num<=100;num++){
			sum +=num;			
			while(sum>300){
				break outer;
			}
			System.out.println(sum);
		}
	}
}