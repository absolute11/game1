import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String gamesDirectoryPath = "D:/Games";

        // Создаем директорию Games


            // Создаем директорию src
            File srcDirectory = new File(gamesDirectoryPath, "src");
            boolean srcCreated = srcDirectory.mkdir();
            if (srcCreated) {
                System.out.println("Директория src успешно создана.");

                // Создаем директорию main внутри src
                File mainDirectory = new File(srcDirectory, "main");
                boolean mainCreated = mainDirectory.mkdir();
                File testDirectory = new File(srcDirectory, "test");
                boolean testCreated = testDirectory.mkdir();
                if(testCreated){
                    System.out.println("Директория тест успешно создана");
                }
                else{
                    System.out.println("Не удалось создать директорию test");
                }
                if (mainCreated) {
                    System.out.println("Директория main успешно создана.");

                    // Создаем файл Main.java в директории main
                    File mainJavaFile = new File(mainDirectory, "Main.java");
                    try {
                        boolean mainJavaCreated = mainJavaFile.createNewFile();
                        if (mainJavaCreated) {
                            System.out.println("Файл Main.java успешно создан.");
                        } else {
                            System.out.println("Не удалось создать файл Main.java.");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    // Создаем файл Utils.java в директории main
                    File utilsJavaFile = new File(mainDirectory, "Utils.java");
                    try {
                        boolean utilsJavaCreated = utilsJavaFile.createNewFile();
                        if (utilsJavaCreated) {
                            System.out.println("Файл Utils.java успешно создан.");
                        } else {
                            System.out.println("Не удалось создать файл Utils.java.");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Не удалось создать директорию main.");
                }

            } else {
                System.out.println("Не удалось создать директорию src.");
            }

            // Создаем директорию res
            File resDirectory = new File(gamesDirectoryPath, "res");
            boolean resCreated = resDirectory.mkdir();
            if (resCreated) {
                System.out.println("Директория res успешно создана.");

                // Создаем директории drawables, vectors, icons внутри res
                File drawablesDirectory = new File(resDirectory, "drawables");
                boolean drawablesCreated = drawablesDirectory.mkdir();
                if (drawablesCreated) {
                    System.out.println("Директория drawables успешно создана.");
                } else {
                    System.out.println("Не удалось создать директорию drawables.");
                }

                File vectorsDirectory = new File(resDirectory, "vectors");
                boolean vectorsCreated = vectorsDirectory.mkdir();
                if (vectorsCreated) {
                    System.out.println("Директория vectors успешно создана.");
                } else {
                    System.out.println("Не удалось создать директорию vectors.");
                }

                File iconsDirectory = new File(resDirectory, "icons");
                boolean iconsCreated = iconsDirectory.mkdir();
                if (iconsCreated) {
                    System.out.println("Директория icons успешно создана.");
                } else {
                    System.out.println("Не удалось создать директорию icons.");
                }
            } else {
                System.out.println("Не удалось создать директорию res.");
            }

            // Создаем директорию savegames
            File savegamesDirectory = new File(gamesDirectoryPath, "savegames");
            boolean savegamesCreated = savegamesDirectory.mkdir();
            if (savegamesCreated) {
                System.out.println("Директория savegames успешно создана.");
            } else {
                System.out.println("Не удалось создать директорию savegames.");
            }

            // Создаем директорию temp
            File tempDirectory = new File(gamesDirectoryPath, "temp");
            boolean tempCreated = tempDirectory.mkdir();
            if (tempCreated) {
                System.out.println("Директория temp успешно создана.");

                // Создаем файл temp.txt в директории temp
                File tempTxtFile = new File(tempDirectory, "temp.txt");
                try {
                    boolean tempTxtCreated = tempTxtFile.createNewFile();
                    if (tempTxtCreated) {
                        System.out.println("Файл temp.txt успешно создан.");
                    } else {
                        System.out.println("Не удалось создать файл temp.txt.");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Не удалось создать директорию temp.");
            }
        }
    }
