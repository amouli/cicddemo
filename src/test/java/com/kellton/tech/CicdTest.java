package com.kellton.tech;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class CicdTest  extends FunctionalTestCase {
	
	 @Test
	    public void mavenFlowReturnsHelloMaven() throws Exception {
	        runFlowAndExpect("cicddemoFlow", "Sadik Ali");
	    }
	    
	    @Override
	    protected String getConfigFile() {
	        return "cicddemo.xml";
	    }
}
