/*
 * Vehicle class
 */
public class Vehicle extends Generics {	
/* fields
* 
*/
public static final String type = "Vehicle";
public enum KeyType {combo, make, year, color};
public static KeyType key = KeyType.combo;
private String make; 
private int year; 
private String color;

/* constructor
* 
*/
public Vehicle(String make, int year, String color)
{
this.setType(type);
this.make = make; 
this.year = year; 
this.color = color; 
}

/* 
* toString provides output based off of this.key setting
*/
@Override
public String toString()
{
String output="";
switch(key) {
case make:
output += this.make;
break;
case year:
output += "" + this.year;
output = output.substring(output.length()-3);
break;
case color:
output += this.color;
break;
case combo:
default:
output += type + ": " + this.make  + ", " + this.color + ", " + this.year; 
}
return output;

}

/* Initialize Vehicle data
* 
*/
public static Generics[] vehicleData() {
Generics[] ad = { 
new Vehicle("Honda", 2029, "Red"),
new Vehicle("Toyota", 2010, "Black"),
new Vehicle("Mecedes", 2018, "Silver"),
new Vehicle("BMW", 2009, "Blue"),
new Vehicle("Ferrari", 2020, "Yellow"),
new Vehicle("Ford", 2005, "Green")
};
return ad;
}

/* main to test Animal class
* 
*/
public static void main(String[] args)
{
Generics[] ad = vehicleData();
for(Generics a : ad)
System.out.println(a);
}

}
