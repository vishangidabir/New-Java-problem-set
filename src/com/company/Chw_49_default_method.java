package com.company;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning !");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4 K");
    };
}

interface MyWifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone {

    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }

    void pickCall(){
        System.out.println("Conn ecting");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
    @Override
    public void takeSnap() {
        System.out.println("Taking snap!");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording a video !");
    }

//    @Override
//    public void record4KVideo() {
//        System.out.println("Taking snap and Recording a video !");
//    }

    @Override
    public String[] getNetwork() {
        System.out.println("getting list of network :");
        String [] networkList = {"Vishangi", "Pratik", "Prachiti"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Network "+network);
    }

}


public class Chw_49_default_method {
    public static void main(String[] args) {
        MySmartPhone mySmartPhone = new MySmartPhone();

        mySmartPhone.connectToNetwork("brezela");

        mySmartPhone.record4KVideo();

        String [] ar = mySmartPhone.getNetwork();
        for(String item : ar){
            System.out.println(item);
        }

    }
}
