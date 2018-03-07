/*
 * Source - https://stackoverflow.com/questions/2320404/creating-classes-dynamically-with-java
 */
import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import java.net.URL;
import java.net.URLClassLoader;

public class DynamicClass {
	/**
	 * TODO - Add a constructor to take certain parameters like Class name that has to be created
	 */
  Date today = new Date();
  String todayMillis = Long.toString(today.getTime());
  String todayClass = "z_" + todayMillis;
  String todaySource = todayClass + ".java";

  /**
   * Convert this to a public method so that classes could be created/run
   * @param args
   */
  public static void main (String args[]){
	DynamicClass mtc = new DynamicClass();
    mtc.createIt();
    if (mtc.compileIt()) {
       System.out.println("Running " + mtc.todayClass + ":\n\n");
       mtc.runIt();
       }
    else
       System.out.println(mtc.todaySource + " is bad.");
    }

  /*
   * Pass the parameters like class name, methods it should contain, what kind of class it is
   */
  public void createIt() {
    try {
    	System.out.println("Creating this " + todaySource);
    	File myFile = new File(todaySource);
    	myFile.createNewFile();
      FileWriter aWriter = new FileWriter(myFile);
      aWriter.write("public class "+ todayClass + "{");
      aWriter.write(" public void doit() {");
      aWriter.write(" System.out.println(\""+todayMillis+"\");");
      aWriter.write(" }}\n");
      aWriter.flush();      
      aWriter.close();
      }
    catch(Exception e){
      e.printStackTrace();
      }
    }

  public boolean compileIt() {
    String [] source = { new String(todaySource)};
//    ByteArrayOutputStream baos= new ByteArrayOutputStream();

    System.out.println(com.sun.tools.javac.Main.compile(source));// m1;// = new com.sun.tools.javac.Main();
//    com.sun.tools.javac.main.Main compiler = new com.sun.tools.javac.main.Main("javac");
//    int status = compiler.compile(source);
    return true;
    }

  public void runIt() {
    try {
    	
    	/*
    	 * The URL Class Loader loads the compied class from the specified class path
    	 */
      File f = new File("/home/venkat/workspace/Parallel Programming");
      URL[] cp = {f.toURI().toURL()};
      URLClassLoader urlcl = new URLClassLoader(cp);
      Class thisClass = urlcl.loadClass(todayClass);
      Class params[] = {};
      Object paramsObj[] = {};
      Object iClass = thisClass.newInstance();
      Method thisMethod = thisClass.getDeclaredMethod("doit", params);
      thisMethod.invoke(iClass, paramsObj);
      }
    catch (Exception e) {
      e.printStackTrace();
      }
    }
}