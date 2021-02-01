package be.pxl.ja.IOStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Oefening1 {
    public static void main(String[] args) {
        Path userHomePath = Path.of(System.getProperty("user.home"));
        userHomePath = userHomePath.resolve("JavaAdvIO").resolve("Opdracht1").resolve("Fase2");
        System.out.println(userHomePath);
        System.out.println(userHomePath.toString());
        System.out.println(userHomePath.getFileName());
        System.out.println(userHomePath.getName(0));
        System.out.println(userHomePath.subpath(0,2));
        System.out.println(userHomePath.getParent());
        System.out.println(userHomePath.getRoot());;
    }
}
