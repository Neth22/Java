public class sum {

    int i;
    int j;

    sum(){
        i=10;
        j=20;
        System.out.println("constructor calling first");
    }
    public static void main(String[] args) {
      sum s = new sum();
        System.out.println("value of :"+(s.i + s.j));
    }

}
