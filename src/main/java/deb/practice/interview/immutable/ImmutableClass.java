package deb.practice.interview.immutable;

/**
 * Created by Deb
 * Date : 11/29/2022
 */
public final class ImmutableClass {
    private final int id;
    private final Name name;

    public ImmutableClass(int id, Name name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Name getName() {
        return new Name(this.name.getFirstName(), this.name.getLastName());
    }
}
