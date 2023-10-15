package tobysrping.helloboot;

public interface HelloRepository {
    Hello findHello(String name);

    void increaseCount(String name);

    default int countOf(String name) {
        Hello hello = findHello(name);
        return hello != null ? hello.getCount() : 0;
    }
}
