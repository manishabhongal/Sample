package testClasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MAN_TC_002_verifyURL {
  @Test
  public void verifyURL() {
	  Reporter.log("URL verified", true);
  }
  
  
  @Test
  public void verifyURL1() {
	  Reporter.log("url1 verified and done changes", true);
  }
}
