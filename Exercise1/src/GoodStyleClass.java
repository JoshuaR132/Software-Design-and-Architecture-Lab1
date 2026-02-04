class GoodStyleClass {

    int avalue = 0;
    int bvalue = 0;

    public GoodStyleClass() {
        avalue = 1;
        bvalue = 1;
    }

    public int add1(int x, int y) {
        if (x < 6) {
            return x + y;
        }
        return 0;
    }

    public int add2(int x, int y) {
        for (int i = 0; i < y; i++) {
            x += 1;
        }
        return x;
    }
}