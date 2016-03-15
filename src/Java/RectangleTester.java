/*
 * [A]98
 * [TA's advise]
 * 1.Good Job!
 * 2.不是使用getWeight(),getHeight()進行計算, 這部分扣2分.
 * */

//package Java;

import java.util.Scanner;

class rectangle {
	double height, width, X, Y, area, perimeter;

	rectangle() {
		//this(-1,-1,-1,-1);//加上這一行會讓你的程式更完整
	}

	rectangle(double _height, double _width, double _X, double _Y) {
		this.height = _height;
		this.width = _width;
		this.X = _X;
		this.Y = _Y;
	}

	double getHeight() {
		return this.height;
	}

	//getWeight or getWidth?
	double getWeight() {
		return this.width;
	}

	double getX() {
		return this.X;
	}

	double getY() {
		return this.Y;
	}

	
	//下面兩個method其實可以透過getHeight(),getWeight()取代, right?
	public double Area() {
		return area = this.height * this.width;
	}

	public double Perimeter() {
		return perimeter = (this.height + this.width) * 2;
	}

	public String toString() {
		return "java.Rectangle[X=" + this.X + ",Y=" + this.Y + ",width=" + this.width + ",height=" + this.height
				+ "]\nArea=" + Area() + "\nPerimeter=" + Perimeter();
	}
}

public class RectangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rectangle = new Scanner(System.in);
		rectangle _rectangle = new rectangle();
		System.out.print("請輸入矩形長度：");
		_rectangle.height = rectangle.nextDouble();
		System.out.print("請輸入矩形寬度：");
		_rectangle.width = rectangle.nextDouble();
		System.out.print("請輸入矩形X：");
		_rectangle.X = rectangle.nextDouble();
		System.out.print("請輸入矩形Y：");
		_rectangle.Y = rectangle.nextDouble();
		System.out.println("\n" + _rectangle.toString());
		System.out.print("\nEnd of Output!");
	}
}
