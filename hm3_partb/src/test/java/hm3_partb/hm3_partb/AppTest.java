package hm3_partb.hm3_partb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
  
	public void check_equilateral(){
        int a = 5;
        int b = 5;
        int c=5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
    }
	@Test
	public void check_Scalene(){
        int a = 2;
        int b = 2;
        int c=4;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	@Test
	public void check_isosceles() {
		int a=5;
		int b=5;
		int c=9;
		triangle.classifyTriangle(a, b, c);
		String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
		
		
	}
	@Test
	public void check_notTriangle() {
		int a=5;
		int b=5;
		int c=12;
		triangle.classifyTriangle(a, b, c);
		String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
		
		
	}
}  