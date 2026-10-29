class Test{
    void show (int x){
        System.out.println("int");
    }
    void show(double x){
        System.out.println("double");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show('A');
    }
}
