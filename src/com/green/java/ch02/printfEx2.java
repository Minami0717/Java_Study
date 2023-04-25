package com.green.java.ch02;

public class printfEx2 {
    public static void main(String[] args){
        String url = "www.codechobo.com";
        float f1 = .10f;
        double d = 1.2345678;
        System.out.printf("f1=%f, %e, %g%n", f1,f1,f1);
        System.out.printf("d=%f\n",d);
        System.out.printf("d=%14.10f\n",d);  //14.10f
        System.out.printf("d=%.3f\n",d); // 3f 소수점3자리까지 사용하겠다

        System.out.println("[1234568901234567890]");
        System.out.printf("[%s]\n",url);
        System.out.printf("[%30s]\n",url);
        System.out.printf("[%-30s]\n",url);
        System.out.printf("[%.8s]\n",url);

    }
}
