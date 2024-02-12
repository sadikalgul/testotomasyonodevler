import com.robotdreams.model.Personal;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

@Test
public class PersonalTest {

    List<Personal> personalList = new ArrayList<>();
    @BeforeTest(groups = "unit")
    public void createPersonal(){
       // System.out.println("createPersonal");
        personalList.add(new Personal(1,"sadik","algul","otomasyon",750.55d,1000.00d));
        personalList.add(new Personal(2,"serkan","cura","otomasyon",250.55d,1000.00d));
    }

    @BeforeMethod
    public void initMethod(){
        System.out.println("BeforeMethod");
    }

    @Test(groups = "unit")
    public void checkNames(){
        //System.out.println("checkNames");
        assertEquals("sadik",personalList.stream().filter(personal -> personal.getId() == 1).findFirst().get().getName());
        assertEquals("serkan",personalList.stream().filter(personal -> personal.getId() == 2).findFirst().get().getName());

    }
}
