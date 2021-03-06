package be.pxl.ja;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo03CreatingDirectoriesAndFiles {

	public static void main(String[] args) {
		Path path = Path.of(System.getProperty("user.home"), "JavaAdvIO", "Opdracht3", "bijlage.txt");
		if (Files.notExists(path.getParent())) {
			//indien de parent nog niet bestaat
			try {
				Files.createDirectory(path.getParent());
				//Files.createDirectories(path.getParent());
				//hele structuur als die nog niet bestaat
				//creer de dir
			} catch (IOException e) {
				System.out.println("An error occured while creating directory " + path.getParent());
			}
		}
		if (Files.notExists(path)) {
			//indien file nog niet bestaat
			try {
				Files.createFile(path);
			} catch (IOException e) {
				System.out.println("An error occured while creating file " + path);
			}
		}
	}

}
