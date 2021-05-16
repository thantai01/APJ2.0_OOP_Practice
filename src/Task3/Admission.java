package Task3;

public class Admission {
    private int size = 0;
    private Candidate[] candidates = new Candidate[100];

    public void addCandidate(Candidate candidate) {
        candidates[size] = candidate;
        size++;
    }
    public void showInfo(){
        for (int i = 0; i < size; i++) {
            System.out.println(candidates[i]);
        }
        System.out.println("_____");
    }
    public void find(int id) {
        for (int i = 0; i < size; i++) {
            if(candidates[i].getId() == id) {
                System.out.println(candidates[i]);
            } else {
                System.out.println("Have no candidates with this ID");
            }
        }
    }
}
