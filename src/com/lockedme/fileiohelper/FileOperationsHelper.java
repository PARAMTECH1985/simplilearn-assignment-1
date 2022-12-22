package com.lockedme.fileiohelper;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperationsHelper {
	public boolean addUserSpecifiedFile(String fileName) {
		File file = new File(fileName); // initialize File object and passing path as argument
		boolean result;
		try {
			result = file.createNewFile(); // creates a new file
			if (result) // test if successfully created a new file
			{
				System.out.println("file created " + file.getCanonicalPath()); // returns the path string
			} else {
				System.out.println("File already exist at location: " + file.getCanonicalPath());
			}
		} catch (IOException e) {
			e.printStackTrace(); // prints exception if any
		}
		return false;

	}

	public void writeContentToFile(String fileName) {
		FileOutputStream fos = null;
		char ch;
		DataInputStream dis = new DataInputStream(System.in);
		try {
			fos = new FileOutputStream(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while ((ch = (char) dis.read()) != '@') {
				fos.write((int) ch);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public boolean deleteUserSpecifiedFile(String fileName) {
		File file = new File(fileName);
		if (file.delete()) {
			System.out.println("File deleted successfully");
		} else {
			System.out.println("Failed to delete the file");
		}
		return false;
	}

	public boolean searchUserSpecifiedFile() {
		return false;

	}

	public void searchUserSpecifiedFile(File file, String file_to_search) {
		try {
			if (file_to_search != null && !file_to_search.isEmpty()) {
				if (file != null) {
					if (file.isDirectory()) {
						// do you have permission to read this directory?
						if (file.canRead()) {
//                            System.out.println("Searching in : "+file.getAbsoluteFile());
							for (File sub_directory : file.listFiles()) {
								if (sub_directory.isDirectory()) {
									searchUserSpecifiedFile(sub_directory, file_to_search);
								} else {
									if (file_to_search.equalsIgnoreCase(sub_directory.getName().toLowerCase())) {
										System.out.println(
												"File Found @ : " + sub_directory.getAbsoluteFile().toString());
									}
								}
							}
						} else {
							System.out.println(file.getAbsoluteFile() + " Permission Denied");
						}
					} else {
						System.out.println(file.getAbsoluteFile() + " is not a directory!");
					}
				} else {
					file = new File("/");
					searchUserSpecifiedFile(file, file_to_search);
				}
			} else {
				System.out.println("The file given to search ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean closeCurrentContext() {
		return false;

	}

}
