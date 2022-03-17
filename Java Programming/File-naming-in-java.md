If a Java file has a public class then the name of the file should be the same as the public class and it should have the main mathod. This is a way to tell the entry point of a program to the JVM. If the class is public and the name of the file is different also when there are multiple public classes, the program won't compile. Sam and Pam are two classes in a single file, the name of the file should be Sam.java.
```
public class Sam {
  public static void main(String[]args) {
    System.out.println("Hello world");
    Pam p = new Pam ();
      p.print ();
  }
}
class Pam {
  public void print() {
    System.out.println("Hello world");
  }
}

```
After compiling the file, two class files will be formed Sam.class and Pam.class.
```javac Sam.java```
We should run the file by the class that has the main method.
```java Sam```

The two classes can be of default assessibility and the name of the file can be anything but conventional. 
