package Task1;

public class Main {
    public static void main(String[] args) {
        PersonnelManagement list = new PersonnelManagement();
        Personnel ps1 = new Personnel("Nguyen van A",24,"Male");
        Personnel nv1 = new Employee("Hoang thi C",25,"Female","Back-Office");
        Personnel eg1 = new Engineer("Tran van H",29,"Male","Soft-ware Developer");
        list.add(ps1);
        list.add(nv1);
        list.add(eg1);
        list.print();
        System.out.println(nv1.getName() + " have location at " +(list.find(nv1.getName())+1));
        Personnel ps2 = new Personnel("Tran trung K",30,"Male");
        list.edit("Nguyen van A",ps2);
        list.print();

    }
}
