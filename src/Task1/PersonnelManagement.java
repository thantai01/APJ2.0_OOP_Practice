package Task1;

import Management.Management;

public class PersonnelManagement implements Management<Personnel> {
    private int size = 0;
    private final Personnel[] list = new Personnel[100];

    @Override
    public void add(Personnel personnel) {
        list[size] = personnel;
        size++;
    }

    @Override
    public void edit(String name,Personnel personnel) {
        list[find(name)] = personnel;
    }

    @Override
    public int find(String name) {
        for (int i = 0; i < size; i++) {
            if (name.equals(list[i].getName())) {
                return i;
            }
        } return -1;
    }

    @Override
    public void delete(String name) {
      list[find(name)] = null;
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
        System.out.println(".______.");
    }

}
