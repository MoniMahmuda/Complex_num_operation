package com.cse213.complex_num_operation;

public class ComplexNum {
    int real;
    int img;

    public ComplexNum(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public ComplexNum() {
    }

    ComplexNum add(ComplexNum c){
        ComplexNum temp = new ComplexNum();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;


    }

    @Override
    public String toString() {
        return real + "+" + img + "i";

    }
}
