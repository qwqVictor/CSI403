/**
* Command line entry for testing purpose only
* @author Huang Kaisheng <2020215138@stu.cqupt.edu.cn>
* @version 1.0
*/
public class Test {
    public static void main(String[] args) {
        String file = "testdata.csv";
        if (args.length > 0) {
            file = args[0];
        }
        Helper.start(file);
    }
}