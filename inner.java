class outerclass {
    int x = 10;

    class innerclass {
        int y = 5;
    }
}

public class inner {
    public static void main(String[] args) {
        outerclass myOuter = new outerclass();
        outerclass.innerclass myInner = myOuter.new innerclass();
        System.out.println(myInner.y + myOuter.x);
    }
}