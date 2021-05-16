package Task1;

import Management.Management;

public class PersonnelManagement implements Management<Personnel> {

    private final Personnel[] list = new Personnel[5];
    private int size = 0;
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

    public static void main(String[] args) {
        PersonnelManagement list = new PersonnelManagement();
        Personnel ps1 = new Personnel("Nguyen van A",24,"Male");
        Personnel ps2 = new Personnel("Nguyen van B",26,"Male");
        list.add(ps1);
        list.add(ps2);
        list.print();
        System.out.println(ps2.getName() + " have location at " +(list.find(ps2.getName())+1));
        Personnel ps3 = new Personnel("Hoang thi C",30,"Female");
        list.edit("Nguyen van B",ps3);
        list.print();
        list.delete("Nguyen van A");
        list.print();
    }
}
