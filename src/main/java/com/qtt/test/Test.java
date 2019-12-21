package com.qtt.test;

/**
 * Project name：qutingting
 * Class name：Test
 * description：TODO
 * date：2019/12/21 10:10
 *
 * @author ：XC
 */
    class HelloA {

        public HelloA() {
            System.out.println("父类构造方法");
        }

        {
            System.out.println("父类代码块");
        }

        static {
            System.out.println("父类静态代码块");
        }
    }

    class HelloB extends HelloA{
        public HelloB() {
            System.out.println("子类构造方法");
        }

        {
            System.out.println("子类代码块");
        }

        static {
            System.out.println("子类静态代码块");
        }
        public static void main(String[] args) {
            new HelloB();
        }
    }
