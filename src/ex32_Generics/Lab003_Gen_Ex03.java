package ex32_Generics;

public class Lab003_Gen_Ex03 {
    public static void main(String[] args) {

        GenricClass g = new GenricClass(10);
        GenricClass g1 = new GenricClass("Rohit");
        GenricClass g2 = new GenricClass(true);
        GenricClass g3 = new GenricClass(11.20);

        System.out.println(g.getData());
    }
}

class GenricClass<T>{

   private T data;

    public GenricClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
