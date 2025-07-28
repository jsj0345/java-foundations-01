package object;

class object4 {
    public static void main(String[] args) {
        Mymath mm = new Mymath();
        long result1 = mm.add(5L,3L);
        long result2 = mm.subtract(5L,3L);
        long result3 = mm.multiply(5L,3L);
        double result4 = mm.divide(5L,3L);

        System.out.println("add(5L , 3L) = "+ result1);
        System.out.println("subtract(5L , 3L) = "+ result2);
        System.out.println("multiply(5L , 3L) = "+ result3);
        System.out.println("divide(5L , 3L) = "+ result4);



    }
}

class Mymath{
    long add(long a, long b){
        long result = a + b;
        return result;
    }

    long subtract(long a, long b)
    {
        return a - b;
    }

    long multiply(long a, long b)
    {
        return a * b;
    }

    double divide(double a, double b){ // double형이 long형보다 범위가 크므로 자동 형 변환이 가능함.
        return a / b;
    }
}