public class Reactangulator {

	public static void main(Strings [] args){
		int len = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);

	Reactangle myrectangle=new Reactangle( len,width);

	String output= String.format("YOur Reachnagle ***\n\n Length: %d\nWidth: %d\n Area: %d\nPerimeter: %d\n\n",myrectangle.len,myrectangle.width,myrectangle.getArea(),myrectangle.Perimeter() );

	System.Out.println(output);

	}

}
