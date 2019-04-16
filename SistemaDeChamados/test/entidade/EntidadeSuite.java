/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author 31718671
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({entidade.SistemaOperacionalTest.class, entidade.PessoaTest.class, entidade.TipoConexaoTest.class, entidade.TipoProblemaTest.class, entidade.BancoDeDadosTest.class, entidade.RegistroChamadoTest.class, entidade.TecnicoTest.class, entidade.ClienteEmpresaTest.class, entidade.EmpresaTest.class, entidade.StatusTest.class, entidade.ChamadoTest.class})
public class EntidadeSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
