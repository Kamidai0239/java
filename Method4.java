import java.util.*;
public class Method4{
	public static void main(String [] args){
		System.out.print("top >>");
		int t = new Scanner(System.in).nextInt();
		System.out.print("bottom >>");
		int b = new Scanner(System.in).nextInt();
		System.out.print("height >>");
		int h = new Scanner(System.in).nextInt();
		calcArea(t,b,h);
	}
	public static void calcArea(int t,int b,int h){
			System.out.printf("TOPが%d,BOTTOMが%d,HEIGHTが%dの台形の面積は%dです%n",t,b,h,(t+b)*h/2);
		}
	}
