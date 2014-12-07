public class Sierpinski {
	public static void main (String[] args) {
		double x = 0.50;
		double y = 0.0;
		double len = 0.5;
		int n = Integer.parseInt(args[0]);///command line argument for number of shifts
		///filledTriangle(x, y, len);
		drawSierpinski(x,y,len,n);
	}

	public static void filledTriangle (double x, double y, double len) { 
		
		///creating points with verticy at (.5,0)
		///defining other points in terms of a,b, and c by using pythagoream theorem

		double a = len/2;
		double c = len;
		double b = Math.sqrt((c * c)-(a * a)); 
		
		double[] sideX = {x, (x - a), (x + a)};
		double[] sideY = {y, (y + b), (y + b)}; 
		
		StdDraw.filledPolygon(sideX, sideY);
	}

	public static void drawSierpinski (double x, double y, double len, int n) {
		///recursion 
		double a = len/2;
		double c = len;
		double b = Math.sqrt((c * c)-(a * a)); 
		if(n == 0){
		///base case
		} 
		else{ 
			filledTriangle(x,y,len);
			drawSierpinski(x-a, y, len/2, n-1); ///shifting for triangles on left side of original 
			drawSierpinski(x+a, y, len/2, n-1); ///shifting for triangles on the right side of original 
			drawSierpinski(x, y+b, len/2, n-1); ///shifting for triangles above the original
		}

	}
}