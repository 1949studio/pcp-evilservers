/**
 * @Classname ExecTemplateJDK7
 * @Author Jack Toke
 */
import java.io.IOException;
public class ExecTemplateJDK7 {

    static {
        try {
            Runtime runTime = Runtime.getRuntime();
            String executablePath = "C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE";

            Process process = runTime.exec(executablePath);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
