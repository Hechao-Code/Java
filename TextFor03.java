//功能：输出1-100中被6整除的数：
public class TextFor03{
	public static void main(String[] args){
	/*方式一	for(int num = 1;num<=100;num++){			
			if(num%6==0){
				System.out.println(num);
			}
		}*/
	/*方式二	for(int num = 1;num<=100;num++){
			if(num%6 != 0){
				continue;
			}
			System.out.println(num);
		}}*/
		
		for(int num = 1;num<=100;num++){
			while(num%6 != 0){
				continue;
			}
			System.out.println(num);
		}
	}
}