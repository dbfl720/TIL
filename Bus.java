package com.example.demo;

public class Bus extends Transportation{

    int currentPassenger =2;
    int maxPassenger = 30;
    int fee = 2000;
    int busNumber ;
    int gas = 100;
    int currentSpeed = 0;
    String status = "운행";


    Bus(int number) {
        this.busNumber = number;
    }



    void operateOn(){
        if(status.equals("운행")){
            System.out.println("이미 운행 중 입니다.");
        } else {
            this.status = "운행";
            System.out.println("운행을 시작합니다.");
        }
    }

    void operateOff(){
        this.status="차고지행";
        System.out.println("운행을 종료합니다.");
    }

    void gasCheck(){
        if(gas<10){
            this.status = "차고지행";
            System.out.println("주유가 필요합니다.");
        }
    }

    void getPeople(int passenger){  //? 추가할 승객 ?
        if(this.currentPassenger <= maxPassenger && this.status.equals("운행") ){
            this.currentPassenger += passenger;
        } else {
            System.out.println("탑승하실 수 없습니다.");
        }

    }

    void changedSpeed(int speed){   //?변경할 속도 입력 받기?
        if(this.gas >= 10){
            this.currentSpeed += speed;

        }else{
            this.status="차고지행";
            System.out.println("주유량을 확인해 주세요.");


        }
    }

}




