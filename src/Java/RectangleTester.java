/*
 * [A]98
 * [TA's advise]
 * 1.Good Job!
 * 2.���O�ϥ�getWeight(),getHeight()�i��p��, �o������2��.
 * */

//package Java;

import java.util.Scanner;

class rectangle {
	double height, width, X, Y, area, perimeter;

	rectangle() {
		//this(-1,-1,-1,-1);//�[�W�o�@��|���A���{���󧹾�
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

	
	//�U�����method���i�H�z�LgetHeight(),getWeight()���N, right?
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
		System.out.print("�п�J�x�Ϊ��סG");
		_rectangle.height = rectangle.nextDouble();
		System.out.print("�п�J�x�μe�סG");
		_rectangle.width = rectangle.nextDouble();
		System.out.print("�п�J�x��X�G");
		_rectangle.X = rectangle.nextDouble();
		System.out.print("�п�J�x��Y�G");
		_rectangle.Y = rectangle.nextDouble();
		System.out.println("\n" + _rectangle.toString());
		System.out.print("\nEnd of Output!");
	}
}
