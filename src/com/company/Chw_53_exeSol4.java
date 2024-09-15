package com.company;

abstract class Telephone{
    abstract void ring();
    abstract void lift (String door);

    abstract String disconnect(String network);
}

class SmartPhone extends Telephone  {
    public void ring(){
        System.out.println("Ringing !");
    }
    void lift (String door){
        System.out.println();
    }
    String disconnect(String network){
        return network;
    }
}

interface TvRemote{
    void changeChannel();

    void changeVolume();
}

interface SmartTvRemote extends TvRemote{
    void ChangeDisplay();
}
 class Tv extends SmartPhone implements SmartTvRemote{
     @Override
     public void changeChannel() {
         System.out.println("Channel");
     }

     @Override
     public void changeVolume() {
         System.out.println("volume");
     }

     @Override
     public void ChangeDisplay() {
         System.out.println("Display");
     }
 }
public class Chw_53_exeSol4 {
    public static void main(String[] args) {
//        SmartPhone smartPhone = new SmartPhone();
//        smartPhone.ring();
//        smartPhone.lift("Incoming");
//        smartPhone.disconnect("Pratik");
//
//        Telephone telephone = new SmartPhone();
//        String tel = telephone.disconnect("bdjk");
        Tv tv = new Tv();
        tv.changeChannel();
        tv.ring();
        tv.ChangeDisplay();
    }
}
