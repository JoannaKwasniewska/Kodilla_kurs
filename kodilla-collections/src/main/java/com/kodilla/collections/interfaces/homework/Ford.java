package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

        private int speed;

        public Ford() {
            this.speed = 0;
        }

        public int getSpeed() {
            return speed;
        }

        public void increaseSpeed() {
            speed += 30;
        }

        public void decreaseSpeed() {
            speed -= 20;
        }
    }

