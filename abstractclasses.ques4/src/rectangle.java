
class rectangle extends Shape {
	
	rectangle(double a, double b){
		super(a,b);  // baseclass is invoked using super keyword
			
	}

	double area() {
		return dim1*dim2;     // value of area() is overridden
	}
}
