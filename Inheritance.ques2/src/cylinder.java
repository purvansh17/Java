
public class cylinder extends circle {
  
   private double height;
   
   // Constructors
   public cylinder() {
      super();  // invoke superclass' constructor circle()
      this.height = 1.0;
   }
   public cylinder(double height) {
      super();  // invoke superclass' constructor circle()
      this.height = height;
   }
   public cylinder(double height, double radius) {
      super(radius);  // invoke superclass' constructor circle(radius)
      this.height = height;
   }
   public cylinder(double height, double radius, String color) {
      super(radius, color);  // invoke superclass' constructor circle(radius, color)
      this.height = height;
   }
   
   // Getter and Setter
   public double getHeight() {
      return this.height;
   }
   public void setHeight(double height) {
      this.height = height;
   }

   // Return the volume of this Cylinder
   public double getVolume() {
      return getArea()*height;   // Use Circle's getArea()
   }
 }
