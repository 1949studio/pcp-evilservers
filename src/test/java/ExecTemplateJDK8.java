/**
 * @Classname ExecTemplateJDK8
 * @Author Welkin
 */
import java.io.IOException;

public class ExecTemplateJDK8 {

    static {
        try {
            Runtime runTime = Runtime.getRuntime();
            String executablePath = "calc.exe";

            Process process = runTime.exec(executablePath);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println();
    }

}
