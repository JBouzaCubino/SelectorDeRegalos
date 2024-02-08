/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNOS_FP
 */
public class SelectorDeRegalosTest {
    
    public SelectorDeRegalosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void primeraLíneaTest(){
        assertEquals(SelectorDeRegalos.seleccionarRegalo(101, 11), "Juguete de construcción");
    }
    
    @Test
    public void quintaLíneaTest(){
        assertEquals(SelectorDeRegalos.seleccionarRegalo(45, 18), "Libro de aventuras");
    }
}
