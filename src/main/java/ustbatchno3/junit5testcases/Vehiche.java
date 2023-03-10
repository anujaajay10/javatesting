package ustbatchno3.junit5testcases;

import java.util.Scanner;

public class Vehiche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String state = "KL";
		String district;
		System.out.println("Enter the sub number : ");
		int dis = sc.nextInt();
		switch(dis) {
		case 1: district = "Thiruvananthapuram";
				break;
		case 2: district = "Kollam";
				break;
		case 3: district = "Pathanamthitta";
				break;
		case 4: district = "Alapuzha";
				break;
		case 5: district = "Kottayam";
				break;
		case 6: district = "Idukki";
				break;
		case 7: district = "Ernakulam";
				break;
		case 8: district = "Thrissur";
				break;
		default: System.out.println("invalid code");
		        break;
		}
		System.out.println("The remaining numbers");
		int n2=sc.nextInt();
		System.out.println("District");
		String dist=sc.next();
		System.out.println("State:Kerala"+dist+n2);
	}

}


