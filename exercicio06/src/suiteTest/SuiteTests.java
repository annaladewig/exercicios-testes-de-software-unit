package suiteTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({locacao.BicicletaTest.class,
			   locacao.LocacaoTest.class,
			   financeiro.MovimentoLocacaoTest.class})
public class SuiteTests {

}
