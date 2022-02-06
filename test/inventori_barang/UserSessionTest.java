/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventori_barang;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Januar Tampubolon
 */
public class UserSessionTest {
    private UserSession us;
    public UserSessionTest() {
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
     * Test of getU_id method, of class UserSession.
     */
    @Test
    public void testGetU_id() throws Exception {
        try
        {
         int u_id = 000;
         String u_username = "test";
         String u_password = "test";
         String u_name = "Test";
         UserSession us = new UserSession();
         assert (us.getU_id() == u_id);
         
         //UserSession us = new UserSession(u_id, u_username, u_password, u_name);
        //System.out.println("getU_id");
        //int expResult = 0;
        //int result = UserSession.getU_id();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }
         catch(NullPointerException e) {System.out.println("testGetU_id() failed: NullPointerException:" + e.getMessage());}
        catch(IllegalArgumentException e){System.out.println("testGet_Uid() failed: IllegalArgumentException:" + e.getMessage());}
        catch(UnsupportedOperationException e){System.out.println("testGetU_id() failed: UnsupportedOperationException:" + e.getMessage());}
    }

    /**
     * Test of setU_id method, of class UserSession.
     */
    @Test
    public void testSetU_id() {
        System.out.println("setU_id");
        int u_id = 0;
        UserSession.setU_id(u_id);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getU_username method, of class UserSession.
     */
    @Test
    public void testGetU_username() throws Exception{
          try
        {
         //int u_id = 000;
         String u_username = "test";
         //String u_password = "test";
         //String u_name = "Test";
          UserSession us = new UserSession();
         //assert (us.getU_username() == u_username);
//        System.out.println("getU_username");
//        String expResult = "";
//        String result = UserSession.getU_username();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        }
        catch(NullPointerException e) {System.out.println("testGetU_username() failed: NullPointerException:" + e.getMessage());}
        catch(IllegalArgumentException e){System.out.println("testGet_username() failed: IllegalArgumentException:" + e.getMessage());}
        catch(UnsupportedOperationException e){System.out.println("testGetU_username() failed: UnsupportedOperationException:" + e.getMessage());}
    }

    /**
     * Test of setU_username method, of class UserSession.
     */
    @Test
    public void testSetU_username() {
        System.out.println("setU_username");
        String u_username = "";
        UserSession.setU_username(u_username);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getU_password method, of class UserSession.
     */
    @Test
    public void testGetU_password() throws Exception {
           try
        {
        // int u_id = 000;
         //tring u_username = "test";
         String u_password = "test";
         UserSession us = new UserSession();
         //String u_name = "Test";
         //assert(us.getU_password() == u_password);
    
//        System.out.println("getU_password");
//        String expResult = "";
//        String result = UserSession.getU_password();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        }
        catch(NullPointerException e) {System.out.println("testGetU_password() failed: NullPointerException:" + e.getMessage());}
        catch(IllegalArgumentException e){System.out.println("testGet_password() failed: IllegalArgumentException:" + e.getMessage());}
        catch(UnsupportedOperationException e){System.out.println("testGetU_password() failed: UnsupportedOperationException:" + e.getMessage());}
           
    }

    /**
     * Test of setU_password method, of class UserSession.
     */
    @Test
    public void testSetU_password() {
        System.out.println("setU_password");
        String u_password = "";
        UserSession.setU_password(u_password);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getU_nama method, of class UserSession.
     */
    @Test
    public void testGetU_nama() throws Exception {
           try
        {
         int u_id = 000;
         String u_username = "test";
         String u_password = "test";
         String u_nama = "Test";
         //assert (us.getU_nama() == u_nama);
    
//        System.out.println("getU_password");
//        String expResult = "";
//        String result = UserSession.getU_password();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        }
        catch(NullPointerException e) {System.out.println("testGetU_nama() failed: NullPointerException:" + e.getMessage());}
        catch(IllegalArgumentException e){System.out.println("testGet_nama() failed: IllegalArgumentException:" + e.getMessage());}
        catch(UnsupportedOperationException e){System.out.println("testGetU_nama() failed: UnsupportedOperationException:" + e.getMessage());}
           
    }

    /**
     * Test of setU_nama method, of class UserSession.
     */
    @Test
    public void testSetU_nama() {
        System.out.println("setU_nama");
        String u_nama = "";
        UserSession.setU_nama(u_nama);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
