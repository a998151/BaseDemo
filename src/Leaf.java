class Leaf {
    int num=10;
    Leaf increment(){
        num++;
        return this;
    }
    protected void print(){
        System.out.println("num = "+num);
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "num=" + num +
                '}';
    }
}
