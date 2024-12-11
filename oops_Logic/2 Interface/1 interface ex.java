
interface a {
    void eat();
}

class b implements a {

    public void eat() {
        System.out.println("Hii vivek ");
    }
}

class interfaceex {
    public static void main(String[] args) {
        b b = new b();
        b.eat();
    }
}
