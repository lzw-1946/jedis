import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisTest {
    Jedis jedis;
    @Before
    public void init(){
        jedis = new Jedis("192.168.1.102", 6379);
    }
    @Test
    public void test1(){
        System.out.println(jedis.ping());
    }

    @After
    public void after(){
        System.out.println("end......");
    }
}
