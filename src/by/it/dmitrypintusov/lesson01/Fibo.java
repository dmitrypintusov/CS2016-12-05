package by.it.dmitrypintusov.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить три способа вычисления чисел Фибоначчи.
 */
public class Fibo {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fibo.calc(n), fibo.time());

        //вычисление чисел фибоначчи медленным методом (рекурсией)
        fibo = new Fibo();
        n = 33;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fibo.slowA(n), fibo.time());

        //вычисление чисел простым быстрым методом
        fibo = new Fibo();
        n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());

        //вычисление чисел фибоначчи самым быстрым методом
        fibo = new Fibo();
        n = 55555;
        System.out.printf("fasterC(%d)=%d \n\t time=%d \n\n", n, fibo.fasterC(n), fibo.time());
    }


    private int calc(int n) {
        if (n >= 0) {
		    if (n <= 1) {
			    return n;
		    } else {
			    return calc(n-1) - calc(n-2);
		    }
	    } else {
	        System.out.println ("Must be more than 0.");
        }
        return 0;
    }


    public BigInteger slowA(Integer n) {
        if (n==0) {
            return BigInteger.ZERO;
        } else if (n==1) {
            return BigInteger.ONE;
        } else {
            return slowA(n-1).add(slowA(n-2));
        }

    }

    public BigInteger fastB(Integer n) {
        BigInteger array [] = new BigInteger[n+1];
        array[0] = BigInteger.ZERO;
        array[1] = BigInteger.ONE;
        for (int i=2; i<=n; i++) {
            array[i] = array[i-1].add(array[i-2]);
        }
        return array[n];
    }

    public BigInteger fasterC(Integer n) {

        //попробуйте здесь релизовать самый быстрый и эффективный по использованию памяти
        //вариант, какой только сумеете
        return BigInteger.ZERO;
    }


}
