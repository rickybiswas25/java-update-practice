package deb.practice.interview.singleton;

import java.io.Serial;
import java.io.Serializable;

/**
 * Created by Deb
 * Date : 11/29/2022
 */
public class SingletonClass implements Serializable {
    private static SingletonClass singletonClass;

    private SingletonClass() {}

    public static synchronized SingletonClass createSingleton() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    @Serial
    protected Object readResolve() {
        return singletonClass;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
