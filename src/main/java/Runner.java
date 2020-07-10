import animals.Cat;

import java.sql.SQLOutput;

class Runner{
    public static void main(String[] args){
        Cat cat = new Cat("Felix","Meow","Whiskers",4);

        System.out.println(cat.getVoice());
    }
}