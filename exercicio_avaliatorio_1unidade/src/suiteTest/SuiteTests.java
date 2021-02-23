package suiteTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({testePassagem.CartaoVemTest.class,
				testePassagem.ColetivoTest.class})
public class SuiteTests {

}
