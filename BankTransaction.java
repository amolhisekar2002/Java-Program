import java.util.Scanner;
import java.util.ArrayList;

class BankTransaction {
    static String name;
    static String address;
    static long contact;
    static long adhar;
    static String pancard;
    static double balance;
    static int pin;
	static ArrayList<String> transaction = new ArrayList<String>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        welcomeLoop:
        for (;;) {

            System.out.println("\n WELCOME ");
            System.out.println(" **** LAXMI CHIT FUND **** \n");
            System.out.print("1.CREATE ACCOUNT \n2.LOGIN\n");
            System.out.print("Enter your resp : ");
            int resp = sc.nextInt();

            switch (resp) {

                // ================= CREATE ACCOUNT =================
                case 1: {
                    if (name != null) {
                        System.out.println("\n ACCOUNT ALREADY EXIST \n");
                        continue;
                    }

                    System.out.println("\n ACCOUNT CREATION PAGE \n");

                    System.out.print("Name : ");
                    name = new Scanner(System.in).nextLine();

                    System.out.print("Address : ");
                    address = new Scanner(System.in).nextLine();

                    System.out.print("Contact : ");
                    contact = new Scanner(System.in).nextLong();

                    System.out.print("Adhar : ");
                    adhar = new Scanner(System.in).nextLong();

                    System.out.print("Pancard : ");
                    pancard = new Scanner(System.in).next();

                    System.out.print("Enter an amount : ");
                    balance = new Scanner(System.in).nextDouble();

					
					transaction.add("DEPOSIT (Creation) :"+balance);

                    System.out.print("Pin : ");
                    pin = new Scanner(System.in).nextInt();

                    System.out.println("\n *** ACCOUNT CREATED SUCCESSFULLY \n");
                    break;
                }

                // ================= LOGIN =================
                case 2: {
                    if (name == null) {
                        System.out.println("\n CREATE YOUR ACCOUNT FIRST \n");
                        continue;
                    }

                    System.out.println("\n LOGIN MODULE \n");
                    System.out.print("Contact : ");
                    long userContact = new Scanner(System.in).nextLong();

                    System.out.print("PIN : ");
                    int userPin = new Scanner(System.in).nextInt();

                    if (contact == userContact && pin == userPin) {

                        System.out.println("\n LOGIN SUCCESSFULLY \n");

                        // ========== FEATURES MENU ==========
                        features:
                        for (;;) {
                            System.out.println("\n **** FEATURES **** \n");
                            System.out.println("1.DEPOSIT \n2.WITHDRAW \n3.CHECK BALANCE \n4.TRANSACTION \n5.LOGOUT");
                            System.out.print("\nEnter your option : ");
                            int opt = sc.nextInt();

                            switch (opt) {

                                // ===== DEPOSIT =====
                                case 1: {
                                    System.out.println("\n DEPOSIT AMOUNT MODULE \n");
                                    System.out.print("Enter deposit amount : ");
                                    double deptAmt = new Scanner(System.in).nextDouble();
                                    balance += deptAmt;
									transaction.add("DEPOSIT :"+deptAmt);
                                    System.out.println("\n AMOUNT DEPOSITED SUCCESSFULLY \n");
                                    break;
                                }

                                // ===== WITHDRAW =====
                                case 2: {
                                    System.out.println("\n WITHDRAW AMOUNT MODULE \n");
                                    System.out.print("Enter an amount : ");
                                    double wdrwAmt = new Scanner(System.in).nextDouble();

                                    System.out.print("Enter your pin : ");
                                    int pin2 = new Scanner(System.in).nextInt();

                                    if (pin2 == pin) {
                                        if (wdrwAmt <= balance) {
                                            balance -= wdrwAmt;
											transaction.add("WITHDRAW :"+wdrwAmt);
                                            System.out.println("\n AMOUNT DEBITED SUCCESSFULLY \n");
                                        } else {
                                            System.out.println("\n INSUFFICIENT FUNDS \n");
                                        }
                                    } else {
                                        System.out.println("\n INVALID PIN \n");
                                    }
                                    break;
                                }

                                // ===== CHECK BALANCE =====
                                case 3: {
                                    System.out.println("\n CHECK BALANCE MODULE \n");
                                    System.out.print("Enter your pin : ");
                                    int pin2 = new Scanner(System.in).nextInt();

                                    if (pin2 == pin) {
                                        System.out.println("Your account balance is : " + balance + " rs.");
                                    } else {
                                        System.out.println("\n INVALID PIN \n");
                                    }
                                    break;
                                }

                                // ===== LOGOUT =====
                                case 4: {
                                    System.out.println("\n *******TRANSACTION******* \n");
									for (String ele : transaction ){
										System.out.println(ele);
									}
									System.out.println();
									break;
              
                                }
								case 5: {
									System.out.println("\n THANK U & VISIT AGAIN \n");
                                    continue welcomeLoop;
								}

                                default: {
                                    System.out.println("\n INVALID RESPONSE \n");
                                }
                            }
                        }

                    } else {
                        System.out.println("\n INVALID CRED \n");
                    }
                    break;
                }

                default: {
                    System.out.println("\n INVALID RESPONSE \n");
                }
            }
        }
    }
}
