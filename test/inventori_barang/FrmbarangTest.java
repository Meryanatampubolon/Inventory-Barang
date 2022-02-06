/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventori_barang;

import com.mysql.jdbc.Connection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amris
 */
public class FrmbarangTest {
    
    private final String getAllbarang = "SELECT * FROM spesialis";
    public FrmbarangTest() {
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

    /**
     * Test of main method, of class Frmbarang.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Frmbarang.main(args);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
