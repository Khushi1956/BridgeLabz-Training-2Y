class Model implements Cloneable {
    int version = 1;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Model m1 = new Model();
        Model m2 = (Model) m1.clone();
        System.out.println("Cloned model version: " + m2.version);
    }
}
