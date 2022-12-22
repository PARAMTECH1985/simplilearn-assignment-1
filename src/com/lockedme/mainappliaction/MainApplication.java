package com.lockedme.mainappliaction;

import java.io.File;
import java.util.*;

import com.lockedme.fileiohelper.FileOperationsHelper;

public class MainApplication {
	public void startApplication() {
		String fileName = "";
		FileOperationsHelper fileOperationHelper = new FileOperationsHelper();
		System.out.println("Welcome to LockedMe.com Application");
		System.out.println("Please Enter the Below Choices for Using the Application");
		System.out.println("Please Enter 1:To Create the File");
		System.out.println("Please Enter 2:To Delete the File");
		System.out.println("Please Enter 3:To Search the Given File");
		System.out.println("Please Enter 4:To Exit From the Application");
		Scanner sc = new Scanner(System.in);
		int choice;
		choice = sc.nextInt();
		// switch statement to check size

		switch (choice) {
		case 1:
			System.out.println("Please Enter 1:To Create the File");
			System.out.println("Please Enter The File Name");
			fileName = sc.nextLine();
			fileOperationHelper.addUserSpecifiedFile(fileName);
			System.out.println("Please Write Content to File");
			fileOperationHelper.writeContentToFile(fileName);
			break;

		case 2:
			System.out.println("Please Enter 2:To Delete the File");
			System.out.println("Please Enter The File Name");
			fileName = sc.nextLine();
			fileOperationHelper.deleteUserSpecifiedFile(fileName);
			break;

		// match the value of week
		case 3:
			System.out.println("Please Enter 3:To Search the Given File");
			fileName = sc.nextLine();
			File file = new File(".");
			fileOperationHelper.searchUserSpecifiedFile(file, fileName);
			break;

		case 4:
			System.out.println("Please Enter 4:To Exit From the Application");
			System.exit(0);
			break;

		default:
			System.out.println("Default Choice");
			break;

		}
	}

	public static void main(String str[]) {
		String fileName = "";
		FileOperationsHelper fileOperationHelper = new FileOperationsHelper();
		System.out.println("Welcome to LockedMe.com Application");
		System.out.println("Please Enter the Below Choices for Using the Application");
		System.out.println("Please Enter 1:To Create the File");
		System.out.println("Please Enter 2:To Delete the File");
		System.out.println("Please Enter 3:To Search the Given File");
		System.out.println("Please Enter 4:To Exit From the Application");
		Scanner sc = new Scanner(System.in);
		int choice;
		choice = sc.nextInt();
		// switch statement to check size

		switch (choice) {
		case 1:
			System.out.println("Please Enter 1:To Create the File");
			System.out.println("Please Enter The File Name");
			fileName = sc.nextLine();
			fileOperationHelper.addUserSpecifiedFile(fileName);
			System.out.println("Please Write Content to File");
			fileOperationHelper.writeContentToFile(fileName);
			break;

		case 2:
			System.out.println("Please Enter 2:To Delete the File");
			System.out.println("Please Enter The File Name");
			fileName = sc.nextLine();
			fileOperationHelper.deleteUserSpecifiedFile(fileName);
			break;

		// match the value of week
		case 3:
			System.out.println("Please Enter 3:To Search the Given File");
			fileName = sc.nextLine();
			File file = new File(".");
			fileOperationHelper.searchUserSpecifiedFile(file, fileName);
			break;

		case 4:
			System.out.println("Please Enter 4:To Exit From the Application");
			System.exit(0);
			break;

		default:
			System.out.println("Default Choice");
			break;

		}

//		MainApplication mainApplication=new MainApplication();
//		boolean wantToContinue = true;
//
//		while (wantToContinue) {
//			
//			mainApplication.startApplication();
//			System.out.println("Please enter the choice that you want to continue with application");
//			wantToContinue=sc.nextBoolean();
//
//		}
//	}
	}
}