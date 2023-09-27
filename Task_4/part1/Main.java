import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.print("Input path: ");
        String path = sk.nextLine();
        sk.close();

        try {
            Scanner sc = new Scanner(Paths.get(path), "Windows-1251");
            int i = 1;
            String abzats = "";

            while(sc.hasNextLine()) {
                String s = sc.nextLine();
                if (s.isEmpty()) {
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("part" + i));
                        Throwable var8 = null;

                        try {
                            writer.write(abzats);
                            abzats = "";
                            ++i;
                        } catch (Throwable var38) {
                            var8 = var38;
                            throw var38;
                        } finally {
                            if (writer != null) {
                                if (var8 != null) {
                                    try {
                                        writer.close();
                                    } catch (Throwable var37) {
                                        var8.addSuppressed(var37);
                                    }
                                } else {
                                    writer.close();
                                }
                            }

                        }
                    } catch (IOException var42) {
                        var42.printStackTrace();
                    }
                } else {
                    abzats = abzats + s + System.lineSeparator();
                }
            }

            if (!abzats.isEmpty()) {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("part" + i));
                    Throwable var45 = null;

                    try {
                        writer.write(abzats);
                    } catch (Throwable var36) {
                        var45 = var36;
                        throw var36;
                    } finally {
                        if (writer != null) {
                            if (var45 != null) {
                                try {
                                    writer.close();
                                } catch (Throwable var35) {
                                    var45.addSuppressed(var35);
                                }
                            } else {
                                writer.close();
                            }
                        }

                    }
                } catch (IOException var40) {
                    var40.printStackTrace();
                }
            }

            sc.close();
        } catch (IOException var43) {
            var43.printStackTrace();
        }

    }
}
