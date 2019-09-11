class GQtimer {
    public static void main(String[] args) {
        int n = 420585571;
        System.out.println(GQ_Decimal_Converter.toGQ(n));
        long time_1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; ++i)
            GQ_Decimal_Converter.toGQ(n);
        long time_2 = System.currentTimeMillis();
        System.out.println("My Time (time in milli): " + (time_2 - time_1) );
    }
}