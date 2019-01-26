public class circle {
   
   private double radius;
   private String color;

   public circle() {
      this.radius = 1.0;
      this.color = "red";
   }
   public circle(double radius) {
      this.radius = radius;
      this.color = "red";
   }
   public circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
   }

    public double getRadius() {
      return this.radius;
   }
   public String getColor() {
      return this.color;
   }
   public void setRadius(double radius) {
      this.radius = radius;
   }
   public void setColor(String color) {
      this.color = color;
   }


   // Return the area of circle
   public double getArea() {
      return radius * radius * Math.PI;
   }
}