If a Java file has a public class then the name of the file should be the same as the public class that has the main method. This is a way to tell the entry point of a 
program to the JVM. If the class is public and the name of the file is different also when there are multiple public classes, the program won't compile. 
```
public class Sam{
  public static void main (String[]args){
    System.out.println ("Hello world");
    Pam p = new Pam ();
      p.print ();
  }
}
class Pam{
  public void print (){
    System.out.println ("Hello world");
  }
}

```
Sam and Pam are two classes in a single file, the name of the file should be Sam.java. Because Sam.java is the public class additionally main method would be also inside
Sam class. 

The two classes can be of default assessibility and the name of the file can be anything but conventional. 
