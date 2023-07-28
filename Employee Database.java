import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int data = 0, data2 = 0, data3 = 0;

		// Contract Employee Database
		ArrayList <String> cname = new ArrayList <String>();
		ArrayList <Double> cdays = new ArrayList <Double>();
		ArrayList <Double> crate = new ArrayList <Double>();
		ArrayList <Double> cdeduction = new ArrayList <Double>();
		ArrayList <Double> csalary = new ArrayList <Double>();

		// Regular Employee Database
		ArrayList <String> rname = new ArrayList <String>();
		ArrayList <Double> rdays = new ArrayList <Double>();
		ArrayList <Double> rrate = new ArrayList <Double>();
		ArrayList <Double> rdeduction = new ArrayList <Double>();
		ArrayList <Double> benefits = new ArrayList <Double>();
		ArrayList <Double> rsalary = new ArrayList <Double>();

		// Job Offer Employee Database
		ArrayList <String> jname = new ArrayList <String>();
		ArrayList <Double> jdays = new ArrayList <Double>();
		ArrayList <Double> jrate = new ArrayList <Double>();
		ArrayList <Double> jdeduction = new ArrayList <Double>();
		ArrayList <Double> jsalary = new ArrayList <Double>();

		while (true) {
			String n = " ";
			double d = 0, r = 0, de = 0, b = 0;
			int modify = 0;

			seperate();
			System.out.println("\t   ************Employee CRUD************");
			seperate();
			Space();

			seperate();
			System.out.print("Select an Option \n1 - Add Employee \n2 - Edit Employee \n3 - Delete Person \n4 - Print Report \nInput: ");
			String option = scan.next();
			seperate();

			System.out.println();

			//Checks the database and average age
			if (option.equals("4")) {
				/*=============Calculate the Contracts============================*/
				double csum = 0, csum2 = 0, csum3 = 0, csum4 = 0;
				double cdavg = 0, cravg = 0, cdeavg = 0, csavg = 0;
				/*=========================================================*/

				/*=============Calculate the Regulars============================*/
				double rsum = 0, rsum2 = 0, rsum3 = 0, rsum4 = 0;
				double rdavg = 0, rravg = 0, rdeavg = 0, rsavg = 0;
				/*=========================================================*/

				/*=============Calculate the J.O's============================*/
				double jsum = 0, jsum2 = 0, jsum3 = 0, jsum4 = 0;
				double jdavg = 0, jravg = 0, jdeavg = 0, jsavg = 0;
				/*=========================================================*/


				/*====================Display Final Contract Employee==================*/
				seperate();
				System.out.println("\t   ************Final Database Employee************");
				seperate();
				Space();
				
				Space();
				seperate();
				for (int i = data; i <= data; i++) {
					System.out.println("The Contract Employees data");
					seperate();
					System.out.println("No.    |     Name     |     Days     |     Rate     |     Deduction");
					for (int j = 1; j <= i; j++) {
						System.out.print(j + "     |     " + cname.get(j - 1) + "     |     " + cdays.get(j - 1) + "     |     " + crate.get(j - 1) + "     |     " + cdeduction.get(j - 1) +  "\n");
					}
				}
				seperate();
				/*=========================================================*/


				/*====================Display Final Regular Employee=================*/
				Space();
				seperate();
				for (int i = data2; i <= data2; i++) {
					System.out.println("The Regular Employees data");
					seperate();
					System.out.println("No.  |   Name   |   Days   |   Rate   |   Deduction  |  Benefits ");
					for (int j = 1; j <= i; j++) {
						System.out.print(j + "   |   " + rname.get(j - 1) + "   |   " + rdays.get(j - 1) + "   |   " + rrate.get(j - 1) + "   |   " + rdeduction.get(j - 1) + "   |   " + benefits.get(j - 1) + "\n");
					}
				}
				seperate();
				/*=========================================================*/


				/*===================Display Final J.O Employee===================*/
				Space();
				seperate();
				for (int i = data3; i <= data3; i++) {
					System.out.println("The Job Offer Employee data (Tax higher by 30%)");
					seperate();
					System.out.println("No.    |     Name     |     Days     |     Rate     |     Deduction");
					for (int j = 1; j <= i; j++) {
						System.out.print(j + "     |     " + jname.get(j - 1) + "     |     " + jdays.get(j - 1) + "     |     " + jrate.get(j - 1) + "     |     " + jdeduction.get(j - 1) +  "\n");
					}
				}
				seperate();
				/*=========================================================*/

				/*=================Compute Average on Contract================*/

				//If the data of the dattabase is not empty or zero
				if (data != 0) {

					//Adds all the age in the Arraylist
					for (int i = 1; i <= data; i++) {
						csum += cdays.get(i - 1);
						csum2 += crate.get(i - 1);
						csum3 += cdeduction.get(i - 1);
						csum4 += csalary.get(i - 1);

					}


					//Gets all average from the databases
					cdavg = csum / cdays.size();
					cravg = csum2 / crate.size();
					cdeavg = csum3 / cdeduction.size();
					csavg = csum4 / csalary.size();

					//If there is no data
				} else {
					cdavg = 0;
					cravg = 0;
					cdeavg = 0;
					csavg = 0;
				}
				/*=========================================================*/

				/*==================Calculate Average on Regular====================*/

				//If the data of the dattabase is not empty or zero
				if (data2 != 0) {

					//Adds all the age in the Arraylist
					for (int i = 1; i <= data2; i++) {
						rsum += rdays.get(i - 1);
						rsum2 += rrate.get(i - 1);
						rsum3 += rdeduction.get(i - 1);
						rsum4 += rsalary.get(i - 1);

					}


					//Gets all average from the databases
					rdavg = rsum / rdays.size();
					rravg = rsum2 / rrate.size();
					rdeavg = rsum3 / rdeduction.size();
					rsavg = rsum4 / rsalary.size();

					//If there is no data
				} else {
					rdavg = 0;
					rravg = 0;
					rdeavg = 0;
					rsavg = 0;
				}
				/*=========================================================*/

				/*==================Calculate Average on J.O====================*/

				//If the data of the dattabase is not empty or zero
				if (data3 != 0) {

					//Adds all the age in the Arraylist
					for (int i = 1; i <= data3; i++) {
						jsum += jdays.get(i - 1);
						jsum2 += jrate.get(i - 1);
						jsum3 += jdeduction.get(i - 1);
						jsum4 += jsalary.get(i - 1);

					}


					//Gets all average from the databases
					jdavg = jsum / rdays.size();
					jravg = jsum2 / rrate.size();
					jdeavg = jsum3 / rdeduction.size();
					jsavg = jsum4 / jsalary.size();

					//If there is no data
				} else {
					jdavg = 0;
					jravg = 0;
					jdeavg = 0;
					jsavg = 0;
				}
				/*=========================================================*/

				/*==================Round Up All Values===========================*/

				df.setRoundingMode(RoundingMode.UP);
				/*=========================================================*/


				/*================Display All Averages=======================*/
				Space();
				seperate();
				System.out.println("\t   ************Final Report************");
				seperate();
				Space();

				Space();
				seperate();
				System.out.println("Contract Employee Average Data \n\nAverage Days Worked: " + df.format(cdavg) + "\nAverage Rate: " + df.format(cravg) + "\nAverage Deduction: " + df.format(cdeavg));
				seperate();
				System.out.println("Total Contract Employee are " + data + " The average salary is " + df.format(csavg));
				seperate();

				Space();
				seperate();
				System.out.println("Regular Employee Average Data \n\nAverage Days Worked: " + df.format(rdavg) + "\nAverage Rate: " + df.format(rravg) + "\nAverage Deduction: " + df.format(rdeavg));
				seperate();
				System.out.println("Total Regular Employee are " + data2 + " The average salary is " + df.format(rsavg));
				seperate();

				Space();
				seperate();
				System.out.println("J.O Employee Average Data \n\nAverage Days Worked: " + df.format(jdavg) + "\nAverage Rate: " + df.format(jravg) + "\nAverage Deduction: " + df.format(jdeavg));
				seperate();
				System.out.println("Total J.O Employee are " + data3 + " The average salary is " + df.format(jsavg));
				seperate();
				/*=========================================================*/


				//Ends the loop or terminate the program
				break;

			}

			seperate();
			System.out.print("Employee Type \nC = Contract \nR = Regular \nJ = J.O \nInput: ");
			String option2 = scan.next();

			seperate();
			if ((option.equals("1") && option2.equals("C")) || (option.equals("1") && option2.equals("c"))) {
				Space();
				System.out.print("Name of employee: ");
				n  = scan.next();
				System.out.print("Days of work: ");
				d  = scan.nextDouble();
				System.out.print("Salary per day: ");
				r  = scan.nextDouble();
				System.out.print("Deduction of salary: ");
				de = scan.nextDouble();

				cname.add(n);
				cdays.add(d);
				crate.add(r);
				cdeduction.add(de);
				data++;
				Space();

				seperate();
				System.out.println("Added Successfully!");
				seperate();

			}

			else if ((option.equals("2") && option2.equals("C")) || (option.equals("2") && option2.equals("c"))) {

				if (data != 0) {

					System.out.print("Enter number want to update: ");
					int update = scan.nextInt();

					if (update <= data && update > 0) {
						Space();

						System.out.print("Name of employee: ");
						n = scan.next();
						System.out.print("Days of work: ");
						d  = scan.nextDouble();
						System.out.print("Salary per day: ");
						r  = scan.nextDouble();
						System.out.print("Deduction of salary: ");
						de = scan.nextDouble();
						Space();

						modify = update - 1;

						cname.set(modify, n);
						cdays.set(modify, d);
						crate.set(modify, r);
						cdeduction.set(modify, de);

						seperate();
						System.out.println("Employee Number " + update + " Updated Successfully!");
						seperate();

					} else {
						Space();
						seperate();
						System.out.println("No data exist on that number");
						seperate();
					}

				} else {
					Space();
					seperate();
					System.out.println("There is no data in the array please Add data");
					seperate();
				}
			}

			else if ((option.equals("3") && option2.equals("C")) || (option.equals("3") && option2.equals("c"))) {

				//If the data of the database is not empty
				if (data != 0) {

					//Selects the employee number you want to delete or remove
					Space();
					seperate();
					System.out.print("Enter number you want to delete: ");
					int delete = scan.nextInt();
					seperate();
					Space();

					//If the chosen delete data is on the range of the database
					if (delete <= data && delete > 0) {

						modify = delete - 1;

						//The Data will be deleted or removed in the Arraylist or Database
						cname.remove(modify);
						cdays.remove(modify);
						crate.remove(modify);
						cdeduction.remove(modify);
						data--;

						seperate();
						System.out.println("Employee Number " + delete + " Deleted Successfully!");
						seperate();
					}

					//If the number chosen is not existed
					else {
						Space();
						seperate();
						System.out.println("Sorry that data or number dosen't exist!");
						seperate();
					}

				}

				//If there is no data in your database or array
				else {
					Space();
					seperate();
					System.out.println("There is no data in the array please Add data");
					seperate();
				}

			}


			else if ((option.equals("1") && option2.equals("R")) || (option.equals("1") && option2.equals("r"))) {

				Space();

				System.out.print("Name of employee: ");
				n  = scan.next();
				System.out.print("Days of work: ");
				d  = scan.nextDouble();
				System.out.print("Salary per day: ");
				r  = scan.nextDouble();
				System.out.print("Deduction of salary: ");
				de = scan.nextDouble();
				System.out.print("Benefits: ");
				b = scan.nextDouble();

				rname.add(n);
				rdays.add(d);
				rrate.add(r);
				rdeduction.add(de);
				benefits.add(b);
				data2++;

				seperate();
				System.out.println("Added Successfully!");
				seperate();

			}

			else if ((option.equals("2") && option2.equals("R")) || (option.equals("2") && option2.equals("r"))) {

				if (data2 != 0) {

					seperate();
					System.out.print("Enter number want to update: ");
					int update = scan.nextInt();
					seperate();

					if (update <= data2 && update > 0) {
						Space();


						System.out.print("Name of employee: ");
						n = scan.next();
						System.out.print("Days of work: ");
						d  = scan.nextDouble();
						System.out.print("Salary per day: ");
						r  = scan.nextDouble();
						System.out.print("Deduction of salary: ");
						de = scan.nextDouble();
						System.out.print("Benefits: ");
						b = scan.nextDouble();
						Space();

						modify = update - 1;

						rname.set(modify, n);
						rdays.set(modify, d);
						rrate.set(modify, r);
						rdeduction.set(modify, de);
						benefits.set(modify, b);

						seperate();
						System.out.println("Employee Number " + update + " Updated Successfully!");
						seperate();
					}


					else {
						seperate();
						System.out.println("No data exist on that number");
						seperate();
					}

				} else {
					Space();
					seperate();
					System.out.println("There is no data in the array please Add data");
					seperate();
				}
			}

			else if ((option.equals("3") && option2.equals("R")) || (option.equals("3") && option2.equals("r"))) {

				//If the data of the database is not empty
				if (data2 != 0) {

					//Selects the employee number you want to delete or remove
					seperate();
					System.out.print("Enter number you want to delete: ");
					int delete = scan.nextInt();
					seperate();
					Space();

					//If the chosen delete data is on the range of the database
					if (delete <= data2 && delete > 0) {

						modify = delete - 1;

						//The Data will be deleted or removed in the Arraylist or Database
						rname.remove(modify);
						rdays.remove(modify);
						rrate.remove(modify);
						rdeduction.remove(modify);
						benefits.remove(modify);
						data2--;

						seperate();
						System.out.println("Employee Number " + delete + " Deleted Successfully!");
						seperate();
					}

					//If the number chosen is not existed
					else {
						Space();
						seperate();
						System.out.println("Sorry that data or number dosen't exist!");
						seperate();
					}

				}

				//If there is no data in your database or array
				else {
					Space();
					seperate();
					System.out.println("There is no data in the array please Add data");
					seperate();
				}

			}

			else if ((option.equals("1") && option2.equals("J")) || (option.equals("1") && option2.equals("j"))) {
				Space();

				System.out.print("Name of employee: ");
				n  = scan.next();
				System.out.print("Days of work: ");
				d  = scan.nextDouble();
				System.out.print("Salary per day: ");
				r  = scan.nextDouble();
				System.out.print("Deduction of salary: ");
				de = scan.nextDouble();

				jname.add(n);
				jdays.add(d);
				jrate.add(r);
				jdeduction.add(de);
				data3++;

				Space();
				seperate();
				System.out.println("Added Successfully!");
				seperate();

			}

			else if ((option.equals("2") && option2.equals("J")) || (option.equals("2") && option2.equals("j"))) {

				if (data3 != 0) {

					Space();
					seperate();
					System.out.print("Enter number want to update: ");
					int update = scan.nextInt();
					seperate();

					if (update <= data3 && update > 0) {
						Space();


						System.out.print("Name of employee: ");
						n = scan.next();
						System.out.print("Days of work: ");
						d  = scan.nextDouble();
						System.out.print("Salary per day: ");
						r  = scan.nextDouble();
						System.out.print("Deduction of salary: ");
						de = scan.nextDouble();
						Space();

						modify = update - 1;

						jname.set(modify, n);
						jdays.set(modify, d);
						jrate.set(modify, r);
						jdeduction.set(modify, de);

						seperate();
						System.out.println("Employee Number " + update + " Updated Successfully!");
						seperate();
					}


					else {
						Space();
						seperate();
						System.out.println("No data exist on that number");
						seperate();
					}

				} else {
					Space();
					seperate();
					System.out.println("There is no data in the array please Add data");
					seperate();
				}
			}

			else if ((option.equals("3") && option2.equals("J")) || (option.equals("3") && option2.equals("j"))) {

				//If the data of the database is not empty
				if (data3 != 0) {

					//Selects the employee number you want to delete or remove
					Space();
					seperate();
					System.out.print("Enter number you want to delete: ");
					int delete = scan.nextInt();
					seperate();

					//If the chosen delete data is on the range of the database
					if (delete <= data3 && delete > 0) {

						modify = delete - 1;

						//The Data will be deleted or removed in the Arraylist or Database
						jname.remove(modify);
						jdays.remove(modify);
						jrate.remove(modify);
						jdeduction.remove(modify);
						data3--;
						Space();

						seperate();
						System.out.println("Employee Number " + delete + " Deleted Successfully!");
						seperate();
					}

					//If the number chosen is not existed
					else {
						Space();
						seperate();
						System.out.println("Sorry that data or number dosen't exist!");
						seperate();
					}

				}

				//If there is no data in your database or array
				else {
					Space();
					seperate();
					System.out.println("There is no data in the array please Add data");
					seperate();
				}

			}

			//If no conditions have met
			else {
				System.out.println("Invalid");
			}

			Space();
			seperate();
			System.out.println("\t   ************Data Stored************");
			seperate();
			Space();


			seperate();
			//Contract Employee Database Show
			if (option2.equals("C") || option2.equals("c")) {
				eCont cemp = new eCont(n, d, r, de);
				if (option.equals("1")) {
					csalary.add(cemp.compute());
				}
				if (option.equals("2")) {
					if (data != 0)
						csalary.set(modify, cemp.compute());
				}
				if (option.equals("3")) {
					if (data != 0)
						csalary.remove(modify);
				}
				for (int i = data; i <= data; i++) {
					System.out.println("The Contract Employees data");
					seperate();
					System.out.println("No.    |     Name     |     Days     |     Rate     |     Deduction");
					for (int j = 1; j <= i; j++) {
						System.out.print(j + "     |     " + cname.get(j - 1) + "     |     " + cdays.get(j - 1) + "     |     " + crate.get(j - 1) + "     |     " + cdeduction.get(j - 1) +  "\n");
					}
				}
			}

			//Regular Employee Database Show
			if (option2.equals("R") || option2.equals("r")) {
				eReg remp = new eReg(n, d, r, de, b);
				if (option.equals("1")) {
					rsalary.add(remp.compute());
				}
				if (option.equals("2")) {
					if (data2 != 0)
						rsalary.set(modify, remp.compute());
				}
				if (option.equals("3")) {
					if (data3 != 0)
						rsalary.remove(modify);
				}
				for (int i = data2; i <= data2; i++) {
					System.out.println("The Regular Employees data");
					seperate();
					System.out.println("No.  |   Name   |   Days   |   Rate   |   Deduction  |  Benefits ");
					for (int j = 1; j <= i; j++) {
						System.out.print(j + "   |   " + rname.get(j - 1) + "   |   " + rdays.get(j - 1) + "   |   " + rrate.get(j - 1) + "   |   " + rdeduction.get(j - 1) + "   |   " + benefits.get(j - 1) + "\n");
					}
				}
			}

			//Job Offer Employee Database Show
			if (option2.equals("J") || option2.equals("j")) {
				JO jemp = new JO(n, d, r, de);
				if (option.equals("1")) {
					jsalary.add(jemp.compute());
				}
				if (option.equals("2")) {
					if (data2 != 0)
						jsalary.set(modify, jemp.compute());
				}
				if (option.equals("3")) {
					if (data3 != 0)
						jsalary.remove(modify);
				}
				for (int i = data3; i <= data3; i++) {
					System.out.println("The Job Offer Employee data (Tax higher by 30%)");
					seperate();
					System.out.println("No.    |     Name     |     Days     |     Rate     |     Deduction");
					for (int j = 1; j <= i; j++) {
						System.out.print(j + "     |     " + jname.get(j - 1) + "     |     " + jdays.get(j - 1) + "     |     " + jrate.get(j - 1) + "     |     " + jdeduction.get(j - 1) +  "\n");
					}
				}
			}
			seperate();
			Space();

		}
	}
	public static void seperate() {
		System.out.println("======================================================================");
	}

	public static void Space() {
		System.out.println();
	}
}


class EmpData {
	String name;
	double days;
	double rate;
	double deduction;

	EmpData(String n, double d, double r, double de) {
		this.name = n;
		this.days = d;
		this.rate = r;
		this.deduction = de;
	}
}

class eCont extends EmpData {
	eCont(String n, double d, double r, double de) {
		super(n, d, r, de);
	}

	public double compute() {
		double salary = ((days * rate) - deduction) * 0.8;
		return salary;
	}
}

class eReg extends EmpData {
	double benefit;
	eReg(String n, double d, double r, double de, double be) {
		super(n, d, r, de);
		this.benefit = be;
	}

	public double compute() {
		double salary = ((days * rate + benefit) - deduction) * 0.8;
		return salary;
	}
}

class JO extends EmpData {
	double tax = 0.7;
	JO(String n, double d, double  r, double de) {
		super(n, d, r, de);
	}

	public double compute() {
		double salary = ((days * rate) - deduction) * tax;
		return salary;
	}
}