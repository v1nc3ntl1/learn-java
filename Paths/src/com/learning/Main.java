package com.learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        try {
            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
            Files.deleteIfExists(fileToDelete);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.move(fileToMove, destination);

//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }


//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//        //Path filePath = FileSystems.getDefault().getPath("files","Subdirectoryfile.txt");
//        Path filePath = Paths.get(".", "files", "Subdirectoryfile.txt");
//        printFile(filePath);
//        filePath = Paths.get("C:\\", "Java-Projects", "online-courses", "OutThere.txt");
////        filePath = Paths.get("C:\\Java-Projects\\online-courses\\OutThere.txt");
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        System.out.println("******************************");
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "Subdirectoryfile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        Path path3 = FileSystems.getDefault().getPath("thisfiledoesntexists.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("c:\\","\\abc\\test\\ing", "hwayver");
//        System.out.println(path4.toAbsolutePath());
//        System.out.println("Exists = " + Files.exists(path4));
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
    }

    public static void printFile(Path path) {
        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
