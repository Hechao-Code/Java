/* 输出1-100中被5整除的数,每行输出6个*/
public class ReviewFor01{
	public static void main(String[] args){
		int count = 0;
		for(int i = 1;i<=100;i++){
			if(i%5==0){
				System.out.print(i+"\t");
				count++;
				if(count%6==0){
					System.out.println();
				}
			}
			
		}
	}
}