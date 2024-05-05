// 1. Blessy Munthia Purba [222212537]
// 2. Fauzan Alfaraby Nirwan [222212605]
// 3. Janitra Hayu Pramestya [222212678]

public class Persepsi {
    private int tingkatKepuasan;

    public Persepsi(){

    }

    public Persepsi(int tingkatKepuasan) {
        this.tingkatKepuasan = tingkatKepuasan;
    }

    public int getTingkatKepuasan(){
        return tingkatKepuasan;
    }

    public void setTingkatKepuasan(int tingkatKepuasan){
        if (tingkatKepuasan == 1){
            System.out.println("Sangat Tidak Memuaskan");
        } else if (tingkatKepuasan == 2){
            System.out.println("Tidak Memuaskan");
        } else if (tingkatKepuasan == 3){
            System.out.println("Memuaskan");
        } else if (tingkatKepuasan== 4){
            System.out.println("Sangat Memuaskan");
        } else {
            System.out.println("Warning : Tingkat Kepuasan tidak valid");
        }
    }
}

