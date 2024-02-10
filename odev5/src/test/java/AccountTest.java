import com.robotdreams.model.Account;
import com.robotdreams.model.Personal;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

@Test
public class AccountTest {

    List<Personal> personalList = new ArrayList<>();
    Account account;
    @BeforeTest
    public void createAccount(){
        System.out.println("createPersonal");
        personalList.add(new Personal(1,"sadik","algul","otomasyon",750.55d,1000.00d));
        personalList.add(new Personal(2,"serkan","cura","otomasyon",250.55d,1000.00d));
        account = new Account(personalList);
    }

    @Test(groups = "unit",dataProvider = "credentials")
    public void checkSalary(int days, int id,int salary){

        //System.out.println(account.getTotalSalaryByDays(days,id));
        assertEquals(salary,(int)account.getTotalSalaryByDays(days,id));
    }

    @DataProvider(name = "credentials")
    public Object[][] dataProvider() {
        return new Object[][]{
                {15, 1,11258},
                {27,2,8764}
        };
    }
}
