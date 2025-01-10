package hm3_partb.hm3_partb;

/**
 * Hello world!
 */
enum Triangle_Types {
	  equilateral,
	  isosceles,
	  Scalene,
	  Nottriangle,
  ERROR
  
	} 

class TriangleClassifier {
	
	private static Triangle_Types triangle;
	
	public static void classifyTriangle(int a, int b, int c) {
		
		
		
		
		if((c<a+b)&&(a<b+c)&&(b<c+a)) {
			if((a==b)&&(b==c)) {
				triangle=Triangle_Types.equilateral;
			}
			else if ((a==b)||(b==c)||(a==c)) {
				triangle=Triangle_Types.isosceles;
				
				
			}
			else {
				triangle=Triangle_Types.Scalene;
			}
		}
		else {
			triangle=Triangle_Types.Nottriangle;
		}
		}

	public Triangle_Types get_type() {
		// TODO Auto-generated method stub
		return this.triangle;
	}
	}
			
	        
	       

