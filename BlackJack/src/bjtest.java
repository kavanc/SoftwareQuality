import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class bjtest {

    public static void main(String[] args){
        Result result = JUnitCore.runClasses(testsuite.class);
        for (Failure failure : result.getFailures()){
            System.out.println("All tests were passed:" + failure.toString());
        }
        System.out.println("All tests were passed:" + result.wasSuccessful());
    }
}
