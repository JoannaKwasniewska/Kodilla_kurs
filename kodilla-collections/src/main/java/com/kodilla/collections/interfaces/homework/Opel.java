package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{

        private int speed;

        public Opel() {
            this.speed = 0;
        }

        public int getSpeed() {
            return speed;
        }

        public void increaseSpeed() {
            speed += 20;
        }

        public void decreaseSpeed() {
            speed -= 10;
        }
    }

