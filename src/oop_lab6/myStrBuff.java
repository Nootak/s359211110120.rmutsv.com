package oop_lab6;

public class myStrBuff {
    public static void main(String[] args) {

     //StringBuffer myBuf = new StringBuffer();
        StringBuffer myBuf = new StringBuffer();
        myBuf.append("Hello");
        myBuf.append(" Welcome");
        myBuf.append(" RMUTSV");
        myBuf.append(" 2017");
        System.out.println(myBuf);
        myBuf.insert(14,"MT ");
        System.out.println(myBuf);
        System.out.println(myBuf.length());
        System.out.println(myBuf.capacity());
        System.out.println(myBuf.reverse());

    }//main
}//class
