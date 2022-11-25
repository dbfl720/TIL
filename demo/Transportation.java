package com.example.demo;

public class Transportation {



    class Bus extends Transportation {
//        int currentPassenger = 2;

//        int fee = 2000;

        int gas = 100;
        int currentSpeed = 0;
        String status = "운행";

        String destination;
        int distanceToDes;


//        Bus(int number) {
//            this.busNumber = number;
//        }


        void operateOn() {
            if (status.equals("운행")) {
                System.out.println("이미 운행 중 입니다.");
            } else {
                this.status = "운행";
                System.out.println("운행을 시작합니다.");
            }
        }

        void operateOff() {
            this.status = "차고지행";
            System.out.println("운행을 종료합니다.");
        }

        void gasCheck() {
            if (gas < 10) {
                this.status = "차고지행";
                System.out.println("주유가 필요합니다.");
            }
        }
//
//        void getPeople(int passenger) {  //? 추가할 승객 ?
//            if (this.currentPassenger <= maxPassenger && this.status.equals("운행")) {
//                this.currentPassenger += passenger;
//            } else {
//                System.out.println("탑승하실 수 없습니다.");
//            }
//
//        }

        void changedSpeed(int speed) {   //?변경할 속도 입력 받기?
            if (this.gas >= 10) {
                this.currentSpeed += speed;

            } else {
                this.status = "차고지행";
                System.out.println("주유량을 확인해 주세요.");


            }
        }

    }


    class taxi extends Transportation {
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


        taxi(int number) {
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
            taxi mytaxi = new taxi(1234);

            System.out.println(mytaxi.taxiNumber);
        }
    }
}


