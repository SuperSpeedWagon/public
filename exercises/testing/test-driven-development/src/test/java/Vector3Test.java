import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

final class Vector3Test {

    Vector3 v1, v2;
    @BeforeEach
    public void init(){
        v1 = new Vector3(2,-4,7);
        v2 = new Vector3(6,2,-3);
    }

    @Test
    public void isZeroVector() {
        Vector3 v = new Vector3(0,0,0);
        assertEquals(true, v.isZeroVector());
        assertEquals(false, v2.isZeroVector());
    }

    @Test
    public void dotProduct(){
       assertEquals(17, v1.dot(v2));
    }

    @Test
    public void lengthWorks(){
        assertEquals( 8.307, v1.length());
        assertEquals(7, v2.length());
    }

    @Test
    public void crossPoductWorks(){
        Vector3 v = new Vector3(-2,48,28);
        assertEquals(true, v.equals(v1.crossProduct(v2)));
    }

    @Test
    public void normalizeWorks(){
        assertEquals( 1, v1.normalize().length());
        assertEquals( 1, v2.normalize().length());
    }
}
