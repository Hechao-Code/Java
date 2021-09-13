/*打印距离前面有一定空隙的长方形
    *********
	*********
	*********
	*********
	*/
public class TextFor12{
	public static void main(String[] args){
		for(int j = 1;j<=4;j++){ 			//控制行数
			for(int i = 1;i<=4;i++){    	//控制空格数
				System.out.print(" ");
			}   
											
			for(int i = 1;i<=9;i++){ 		//控制列数
			System.out.print("*");
		    }	
			
			System.out.println();
		}
		
	}
}
	