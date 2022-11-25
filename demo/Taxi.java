package com.example.demo;

public class Taxi extends Transportation{

    String destination;
    int distanceToDes;
    int basicDistance = 1;
    int basicFee = 3000;
    int distancePerFee = 1000;
    int maxPassenger = 4;
    int gasAmount = 100;
    String status = "일반";
    int currentSpeed = 0;
    int gas = 100;

    int totalFee = 0;
    int taxiNumber;


    Taxi(int number) {
        this.taxiNumber = number;
    }


    void powerOn() {
        if (this.gas >= 10) {   //?
            this.status = "일반";

        } else {
            System.out.println("주유량 부족으로 시동을 걸지 못했습니다.");

        }
    }

    void powerOff() {
        this.status = "운행불가";

    }

    void getPeople() {
        if (this.gas >= 10 && this.status.equals("일반")) {
            this.status = "운행 중";

        } else {
            System.out.println("승객을 태울 수 없습니다.");
        }
    }

    void changedspeed(int speed) {
        this.currentSpeed += speed;

    }

    void calculate(int distanceToDes) {
        totalFee = this.distancePerFee * this.basicDistance + basicFee;

    }
}
class test {
    public void main(String[] args) {
        Taxi mytaxi = new Taxi(1234);

        System.out.println(mytaxi.taxiNumber);
    }
}



