package deb.practice.interview.staticcheck;

/**
 * Created by Deb
 * Date : 5/3/2023
 */
public class Start {
    public static void main(String[] args) {
        System.out.println("Trying out non static class ");
        OuterNonStaticClass nonStaticClass = new OuterNonStaticClass();
        OuterNonStaticClass.NonStaticNestedClass clazz = nonStaticClass.new NonStaticNestedClass();
        clazz.runOuterClassStaticVariable();
        clazz.runOuterClassMethod();

        System.out.println("Trying out static class ");
        OuterStaticClass.StaticNestedClass staticNestedClass = new OuterStaticClass.StaticNestedClass();
        staticNestedClass.runOuterClassStaticVariable();
        staticNestedClass.runOuterClassMethod();
    }
}
