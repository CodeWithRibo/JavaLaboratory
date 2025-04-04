package PerformanceTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class NioFileInputandOutput {

	public static void main(String[] args) throws IOException {

		// ABSOLUTE PATH
		Path file = Paths.get("C:\\Users\\riboluna\\Downloads\\ilovAeyouvirus.txt");

		try {
			BasicFileAttributes attributes = Files.readAttributes(file, BasicFileAttributes.class);
			System.out.println("OUTPUT #1");
			System.out.println("Absolute path: " + file);
			boolean isExist = Files.exists(file);
			System.out.println("File Exist: " + isExist);
			System.out.println("File Name: " + file.getFileName());
			System.out.println("Parent Directory: " + file.getParent());
			System.out.println("File Size: " + attributes.size() + " bytes");
			System.out.println("Creation Time: " + attributes.creationTime());

		} catch (IOException e) {
			System.out.println("OUTPUT 2: File does not exist ");
			System.out.println("Absolute Path: " + file.toAbsolutePath());
			boolean isExist = Files.exists(file);
			System.out.println("File Exist: " + isExist);
			e.printStackTrace();
		} finally {
			System.out.println("");
			relativeFilePath();
		}
	}

	public static void relativeFilePath() throws IOException {
		System.out.println("OUTPUT #3");
		// RELATIVE PATH
		Path file = Paths.get("\\Users\\riboluna\\Downloads\\iloveyouvirus.txt");
		BasicFileAttributes attributes = Files.readAttributes(file, BasicFileAttributes.class);
		System.out.println("Relative Path: " + file);
		System.out.println("Absolute Path: " + file.toAbsolutePath().toString());
		boolean isExist = Files.exists(file);
		System.out.println("File Exist: " + isExist);
		System.out.println("File Name: " + file.getFileName());
		System.out.println("Parent Directory: " + file.getParent().toAbsolutePath());
		System.out.println("File Size: " + attributes.size() + " bytes");
		System.out.println("Creation Time: " + attributes.creationTime());
	}

}
