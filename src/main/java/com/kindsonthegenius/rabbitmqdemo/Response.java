package com.kindsonthegenius.rabbitmqdemo;

public class Response {

    private double x;
    private double y;
    private double result;

    public Response(double x, double y, double result) {
        this.x = x;
        this.y = y;
        this.result = result;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
