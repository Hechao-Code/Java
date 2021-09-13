//功能：输出1-100中被6整除的数：
public class TextFor5{
	public static void main(String[] args){
	/*	for(int i = 1;i<=100;i++){			
			if(i%6==0){
				System.out.println(i);
			}
		}*/
		
	/*	for(int i = 1;i<=100;i++){			
			if(i%6!=0){
				continue;
			}
			System.out.println(i);
		}*/
		
	/*	for(int i = 1;i<=100;i++){			
			if(i==36){
				continue;
			}
			System.out.println(i); //1-100没有36
		}*/
		
	/*	for(int i = 1;i<=100;i++){			
			while(i==36){
				continue;
			}
			System.out.println(i); //1-35+死循环
		}*/
		outer:
		for(int i = 1;i<=100;i++){			
			while(i==36){
				continue outer;
			}
			System.out.println(i); //1-100没有36
		}
	}
}