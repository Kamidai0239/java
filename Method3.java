public class Method3{
	public static void main(String[] args){
		hello("山田");
		hello("田中");
		hello("佐藤");
		add(3,5);
		add(10,20);
		add(100,500);
		timesword("Hello",3);
		timesword("Peace",5);
		timesword("Happy",10);
	}
	public static void hello(String name){
		System.out.println(name + "さん、こんにちは！");
	}
	public static void add(int x,int y){
		System.out.printf("%dと%dの和は%dです%n",x,y,x+y);
	}
	public static void timesword(String word,int count){
		for(int i=0;i<count;i++){
			System.out.print(word);
		}
		System.out.println();
	}
}
