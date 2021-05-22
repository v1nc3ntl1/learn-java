package com.learning;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Path directory = FileSystems.getDefault().getPath("FileTree\\Dir2");
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, "*.dat")) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }

        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
            public boolean accept(Path path) throws IOException {
                return Files.isRegularFile(path);
            }
        };

        System.out.println("********************************");

        directory = FileSystems.getDefault().getPath("FileTree\\Dir2");

        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("********************************");

        directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("********************************");

        DirectoryStream.Filter<Path> filter2 = p -> Files.isRegularFile(p);
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter2)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("********************************");
        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        System.out.println("********************************");

        try {
            Path templFile = Files.createTempFile("myapp", ".appext");
            System.out.println("Temporary file path = " + templFile.toAbsolutePath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("********************************");

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for (FileStore store : stores) {
            System.out.println("Volume name/Drive letter =" + store);
            System.out.println(store.name());
        }

        System.out.println("********************************");

        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();

        for (Path path : rootPaths) {
            System.out.println(path);
        }

        System.out.println("********************************");
        System.out.println("Walking tree for dir 2");

        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try {
            Files.walkFileTree(dir2Path, new PrintNames());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("********************************");

        System.out.println("***Copy Dir2 to Dir4/Dir2Copy***");

        Path copyPath = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
        // FileTree\Dir4\Dir2Copy
        try {
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copyPath));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("********************************");

        File file = new File("\\Examples\\file.txt");
        Path converted = file.toPath();
        System.out.println("Converted path = " + converted);
        System.out.println("********************************");

        File parent = new File("\\Examples");
        File resolvedFile = new File(parent, "dir\\file.txt");
        System.out.println(resolvedFile.toPath());

        System.out.println("********************************");
        resolvedFile = new File("\\Examples", "dir/file.txt");
        System.out.println(resolvedFile.toPath());

        System.out.println("********************************");
        Path parentPath = Paths.get("\\Examples");
        Path childRelativePath = Paths.get("dir\\file.txt");
        System.out.println(parentPath.resolve(childRelativePath));
        System.out.println("********************************");

        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory = " + workingDirectory.getAbsoluteFile());

        System.out.println("--- print Dir2 contents using list() ---");
        File dir2File = new File(workingDirectory, "\\FileTree\\Dir2");
        String[] dir2Contents = dir2File.list();
        for (int i=0; i<dir2Contents.length; i++){
            System.out.println("i=" + i + ": " + dir2Contents[i]);
        }

        System.out.println("0----- print dir2 content using listFiles()----");
        File[] dir2Files = dir2File.listFiles();
        for (int i=0; i<dir2Files.length; i++){
            System.out.println("i=" + i + ": " + dir2Files[i].getName());
        }
    }
}
