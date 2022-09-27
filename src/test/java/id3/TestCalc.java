package id3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc{
@Test
public void testadd(){
 Calc hello = new Calc();
 int res = hello.add(10,20);
 assertEquals(30,res);
}
public void testsubtract(){
 Calc hi = new Calc();
 int res = hi.subtract(10,5);
 assertEquals(5,res);
}

}