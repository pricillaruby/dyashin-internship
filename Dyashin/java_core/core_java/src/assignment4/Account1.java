package assignment4;

import java.util.Scanner;

public class Account1 {
	String accountName;
	double accountPrincipal;
	double accountRate;
	int accountTime;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 account1 = new Account1();
		Account1 account2 = new Account1();
		Account1 account3 = new Account1();
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("Enter Account"+i);
			String name = sc.next();
			System.out.println("Enter Account"+i+" Principal");
			double principal = sc.nextDouble();
			System.out.println("Enter Account"+i+" Rate");
			double rate = sc.nextDouble();
			System.out.println("Enter Account"+i+" Time");
			int time = sc.nextInt();
			switch(i) {
			case 1:
				account1.accountName = name;
				account1.accountPrincipal = principal;
				account1.accountRate = rate;
				account1.accountTime = time;
				System.out.println("Account 1 Interest:"+((account1.accountPrincipal*account1.accountRate*account1.accountTime)/100)); 
				break;
			case 2:
				account2.accountName = name;
				account2.accountPrincipal = principal;
				account2.accountRate = rate;
				account2.accountTime = time;
				System.out.println("Account 2 Interest:"+((account2.accountPrincipal*account2.accountRate*account2.accountTime)/100)); 
				break;
			case 3:
				account3.accountName = name;
				account3.accountPrincipal = principal;
				account3.accountRate = rate;
				account3.accountTime = time;
				System.out.println("Account 3 Interest:"+((account2.accountPrincipal*account2.accountRate*account2.accountTime)/100));
				break;
			}
		}
	}

}
