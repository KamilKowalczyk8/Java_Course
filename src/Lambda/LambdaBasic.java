package Lambda;
//interfejs
interface Addition {
    int add(int a,int b);
}
interface MathOperation<T>{
    T operate(T a,T b);
}
public class LambdaBasic {
    public void test(Addition addition){
        System.out.println(addition.add(100,50));
    }
    public static void main(String[] args) {

        Addition addition = (int a, int b) -> a+b;
        System.out.println(addition.add(11,11));
        System.out.println(addition.add(22,11));

        LambdaBasic lambdaBasic = new LambdaBasic();
        lambdaBasic.test((a,b)->a*2+b);

        MathOperation<Integer> mathOperation = (Integer a,Integer b) -> a + b;
        System.out.println(mathOperation.operate(10,15));

        MathOperation<Integer> substraction = (a,b)->a-b;
        System.out.println(substraction.operate(100,77));

    }
}
