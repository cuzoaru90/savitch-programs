/**
 * Consider a graphics system that has classes for various figures, say rectangles, boxes, triangles, circles, and so
 * on. For example, a rectangle might have data members height, width, and center point, while a box and circle might
 * have only a center point and an edge length or radius, respectively. In a well-designed system these would be derived
 * from a common class, Figure. You are to implement such a system.
 *
 * The class Figure is the base class. You should add only Rectangle and Triangle classes derived from Figure. Each class
 * has stubs for methods erase and draw. Each of these methods outputs a message telling the name of the class and what
 * method has been called. Since these are just stubs, they do nothing more than output this message. The method center()
 * calls the erase() and draw() methods to erase and redraw the figure at the center. Since you have only stubs for
 * erase and draw, center() will not do any "centering" but will call the methods erase and draw, which will allow you
 * to see which versions of draw and center it calls. Also, add an output message in the method center that announces
 * that center is being called. The methods should take no arguments. Also, define a demonstration program for your
 * classes.
 *
 * For a real example you would have to replace the definition of each of these methods to do the actual drawing.
 *
 *
 *
 */
public abstract class Figure {

  protected int height, width, base;

  protected Point center;

  public abstract void draw();
  public abstract void center(Point aCenter);

  public Figure(){

  }



}
