package deb.practice.interview.staticcheck;

/**
 * Created by Deb
 * Date : 5/3/2023
 */
public class OuterNonStaticClass {
    private static final String sampleString = "Sample String";

    public void runSampleString() {
        System.out.println(sampleString);
    }

    public class NonStaticNestedClass {

        public void runOuterClassStaticVariable() {
            System.out.println("Accessing directly non static " + sampleString);
        }

        public void runOuterClassMethod() {
            runSampleString();
        }
    }
}
