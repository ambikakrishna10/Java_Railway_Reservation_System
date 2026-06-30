package com.logicalStatements;

import java.util.Scanner;

public class RailwayReservationSystem {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Railway Reservation System..");
			System.out.println("------------------------------");
			System.out.println("1.Passenger");
			System.out.println("2.Express");
			System.out.println("3.Super Fast Express");
			System.out.println("4.Exit !");
			System.out.println("--------------------------------------");
			System.out.print("Enter the type of train you want to book : ");
			
			String passengerName;
			int age, passengerCount, coachChoice;
			double fare = 0;
			String trainType = "";
			String coachClass = "";
			
			int trainChoice = sc.nextInt();
			
			if(trainChoice == 4) {
				System.out.println("Thank You !");
				return;
			}
			
			switch(trainChoice) {
			case 1:
				trainType = "Passenger";
				System.out.println("1.General");
				System.out.println("2.Sleeper");
				System.out.println("3.AC Sleeper");
				System.out.println("------------------------------");
				System.out.print("Select coach choice type: ");
				
				coachChoice = sc.nextInt();
				
				switch(coachChoice) {
				case 1:
					coachClass = "General";
					fare = 30;
					break;
				case 2:
					coachClass = "Sleeper";
					fare = 70;
					break;
				case 3:
					coachClass = "AC Slepper";
					fare = 190;
					break;
				default:
					System.out.println("Invalid class selection !");
					return;
				}
				break;
				
			case 2:
				trainType = "Express";
				System.out.println("1.General");
				System.out.println("2.Sleeper");
				System.out.println("3.AC Sleeper");
				System.out.println("------------------------------");
				System.out.print("Select coach choice type: ");
				
				coachChoice = sc.nextInt();
				
				switch(coachChoice) {
				case 1:
					coachClass = "General";
					fare = 90;
					break;
				case 2:
					coachClass = "Sleeper";
					fare = 200;
					break;
				case 3:
					coachClass = "AC Sleeper";
					fare = 350;
					break;
				default:
					System.out.println("Invalid class selection !");
					return;
				}
				break;
				
			case 3:
				trainType = "Super Fast Express";
				System.out.println("1.General");
				System.out.println("2.Sleeper");
				System.out.println("3.AC Sleeper");
				System.out.println("------------------------------");
				System.out.print("Select coach choice type: ");
				
				coachChoice = sc.nextInt();
				
				switch(coachChoice) {
				case 1:
					coachClass = "General";
					fare = 140;
					break;
				case 2:
					coachClass = "Sleeper";
					fare = 300;
					break;
				case 3:
					coachClass = "AC Sleeper";
					fare = 550;
					break;
				default:
					System.out.println("Invalid class selection !");
					return;
				}
				break;
				
			default:
				System.out.println("Invalid train selection !");
			}
			
			sc.nextLine();
			
			System.out.print("Enter passenger name : ");
			passengerName = sc.nextLine();
			System.out.print("Enter age : ");
			age = sc.nextInt();
			System.out.print("Enter no of passengeres : ");
			passengerCount = sc.nextInt();

			double totalFare = fare * passengerCount;
			
			System.out.println("------------Ticket------------");
			System.out.println("Passenger name : " + passengerName);
			System.out.println("Age : " + age);
			System.out.println("No of passengers : " + passengerCount);
			System.out.println("Train type : " + trainType);
			System.out.println("Coach type : " + coachClass);
			System.out.println("Total amount is : " + totalFare);
			System.out.println("------------------------------");
	}

}
