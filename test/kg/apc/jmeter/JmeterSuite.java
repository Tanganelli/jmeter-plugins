/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kg.apc.jmeter;

import kg.apc.jmeter.charting.ChartingSuite;
import kg.apc.jmeter.config.ConfigSuite;
import kg.apc.jmeter.control.ControlSuite;
import kg.apc.jmeter.dcerpc.DcerpcSuite;
import kg.apc.jmeter.perfmon.PerfmonSuite;
import kg.apc.jmeter.samplers.SamplersSuite;
import kg.apc.jmeter.threads.ThreadsSuite;
import kg.apc.jmeter.vizualizers.VizualizersSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author APC
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({VizualizersSuite.class, PerfmonSuite.class, DcerpcSuite.class, ConfigSuite.class, ThreadsSuite.class, ControlSuite.class, ChartingSuite.class, SamplersSuite.class})
public class JmeterSuite {

   @BeforeClass
   public static void setUpClass() throws Exception
   {
   }

   @AfterClass
   public static void tearDownClass() throws Exception
   {
   }

   @Before
   public void setUp() throws Exception
   {
   }

   @After
   public void tearDown() throws Exception
   {
   }

}