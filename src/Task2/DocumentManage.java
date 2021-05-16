package Task2;

public class DocumentManage {
    private final Document[] documents = new Document[5];
    private int size =0;

    public void add(Document document) {
        documents[size] = document;
        size++;
    }

    public void deleteById(int id){
        for (int i = 0; i < size; i++) {
            if(documents[i].getId()==id) {
                documents[i] = null;
            }
        }
    }

    public void showInfo(int id){
        for (int i = 0; i < size; i++) {
            if(documents[i].getId()== id) {
                System.out.println(documents[i].toString());
            }
        }
        System.out.println("____");
    }

    public void searchBy(){
        for (int i = 0; i < size; i++) {
            if(documents[i]instanceof Book){
                System.out.println(documents[i] + " , ");
            } else if (documents[i]instanceof Magazine){
                System.out.println(documents[i] + " , ");
            } else if (documents[i]instanceof Newspaper) {
                System.out.println(documents[i] + " , ");
            } else {
                System.out.println("No doc on libraries");
            }
        }
    }

}
