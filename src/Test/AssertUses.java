package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.Users;


public class AssertUses {
	  private int numero1;
	  private int numero2;

/*Con el metodo Before, le decimos que ejecute esta seccion primero que los test, por ende, al llegar	  
a los test, los atributos numero1 y numero2 se encuentran con instanciados con un valor */
	  
  @BeforeMethod
  public void Setup () {
	numero1=5;
	numero2=10;
  }
	  
  @Test
  public void TestExitoso() {
	 int a = 1, b=1; 
	 Assert.assertTrue(numero1+5==numero2);
	 Assert.assertTrue(a==b);
	 Assert.assertFalse("A"=="B");
  }
  
  @Test
  public void TestFallo() {
	  
	 Assert.assertTrue(1==2);
	 Assert.assertFalse("B"=="B");
  }
  
  @Test
  public void TestExitosoEquals() {
	  
	 Assert.assertEquals(2 , 2);
	 Assert.assertEquals("c" , "c");
  }
  
  @Test
  public void TestExitosoNotEquals() {
	  
	Assert.assertNotEquals(3 , 2);
		 
  }
  
  //Uso del Null - NotNull
  
  
  @Test
  public void TestClaseNullOK() {
	  
   Users persona1 = null;
   Assert.assertNull(persona1);

  }

  @Test
  public void TestClaseNullFalloInstanciado() {
  
  Users persona1 = null;	  
  persona1 = new Users();
  Assert.assertNull(persona1);
  
  }
  
  @Test
  public void TestClaseNotNullOK() {
  Assert.assertTrue(numero1+5==numero2);
  Users persona1 = null;	  
  persona1 = new Users();
  Assert.assertNotNull(persona1);
  
  }
  

}
