package Management;

public interface Management<O> {
    void add(O v);
    void edit(String name,O v);
    int find(String name);
    void delete(String name);
    void print();
}
