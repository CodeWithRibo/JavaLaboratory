package PerformanceTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileInputOutput {

	public static void main(String[] args) throws IOException {

		// retrieve the file path
		Path file = Paths.get("C:\\Users\\riboluna\\Downloads\\iloveyouvirus.txt");

		try {
			boolean isExists = Files.exists(file);
			String message = isExists ? file.getFileName() + " file exist" : "";
			System.out.println(message + "\n");

			BasicFileAttributes attributes = Files.readAttributes(file, BasicFileAttributes.class);
			System.out.println("FILE NAME		: " + file.getFileName());
			System.out.println("PARENT DIRECTORY	: " + file.getParent());
			System.out.println("FILE SIZE  	     	: " + attributes.size() + " bytes");
			System.out.println("DATE CREATED 		: " + attributes.creationTime());
		} catch (IOException e) {
			throw new IOException("The file does not exist");

		} finally {
			System.out.println("\n");
			relativePath();
		}

	}

	public static void relativePath() throws IOException {
		Path relativePath = Paths.get("iloveyouvairus.txt");
		try {
			boolean isExist = Files.exists(relativePath);
			String message = isExist ? relativePath + " File is Exist" : relativePath + " file does not exist";
			System.out.println(message);
			BasicFileAttributes attributes = Files.readAttributes(relativePath, BasicFileAttributes.class);
		} catch (IOException e) {
			throw new IOException(e.getMessage());
		}

	}

}
