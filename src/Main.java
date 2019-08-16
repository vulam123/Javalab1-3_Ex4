import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số điện: ");
		int kwh = sc.nextInt();
		if(kwh<0) {
			System.out.print("Undefined");
		}
		else if(kwh<=50) {
			System.out.print(1.678*kwh);
		}
		else if(kwh<=100) {
			System.out.print(1.678*50+(kwh-50)+1.734);
		}
		else if(kwh<=200) {
			System.out.print(1.678*50+50*1.734+2.014*(kwh-100));
		}
		else if(kwh<=300) {
			System.out.print(1.678*50+50*1.734+2.014*100+2.5368*(kwh-200));
		}
		else if(kwh<=400) {
			System.out.print(1.678*50+50*1.734+2.014*100+2.5368*100+(kwh-300)*2.834);
		}
		else  {
			System.out.print(1.678*50+50*1.734+2.014*100+2.5368*100+100*2.834+(kwh-400)*2.9237);
		}
		}
		catch(Exception ex) {
			System.out.print("pls try again");
		}
	}
}
