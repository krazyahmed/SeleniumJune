package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({Login.class,
	           AddEmployee.class,
	           DeleteEmployee.class,
	           Logout.class})
public class JunitTestSuite {

}
