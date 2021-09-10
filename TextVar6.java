public class TextVar6{
	public static void main(String[] args){
		//定义字符类型的常量
		char ch1='a';
		System.out.println(ch1);
		char ch2='?';
		System.out.println(ch2);
		char ch3='@';
		System.out.println(ch3);
		char ch4='<';
		System.out.println(ch4);
		//字符型常量都占用两个字节
		System.out.println("--------------------------------");
		char ch5='\n';
		System.out.println("aaa"+ch5+"bbb");
		System.out.println("");
		System.out.println("aaa\nbbb");  //换行
		System.out.println("aaaa\tbbb"); 	//制表符
		System.out.println("aaac\bbbb");    //向前退一格
		System.out.println("aaac\rddd");	//将光标移到本行开头，回车
		System.out.println("\"HELLO JAVA\""); 	//  \"原样输出"
		System.out.println("\'HELLO Python\'"); //  \'原样输出
		System.out.println("\\HELLO C\\");  //  \\原样输出\
		
	}
}