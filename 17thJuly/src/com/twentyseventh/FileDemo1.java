package com.twentyseventh;

import java.io.*;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("src/newfile.txt");

		boolean created = f.createNewFile();

		if (created)
			System.out.println("FileCreated");
		else
			System.out.println("Creation failed.");

		File f1 = new File("src/newfolder");
		boolean status = f1.mkdir();
		if (status)
			System.out.println("FolderCreated");
		else
			System.out.println("Folder Creation failed.");

		File f2 = new File("src/newfolder");

		if (f2.isFile()) {
			System.out.println("it is a file");
		} else
			System.out.println("It is not a file.");

		if (f2.isDirectory()) {
			System.out.println("it is a directory");
		} else
			System.out.println("It is not a directory");

		boolean deletestatus = f2.delete();
		if (deletestatus)
			System.out.println("FolderDeleted");
		else
			System.out.println("Folder Deletion failed.");

		File ff = new File("C:/");
		String a[] = ff.list();
		for (int x = 0; x < a.length; x++) {
			System.out.println(a[x]);
		}
	}

}
