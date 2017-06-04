package de.brandt.math.utils.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * TestSuite for the metdhods in Utils.
 * @author Jan Brandt
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ TestEulerPhiFunction.class, Testgcd.class, TestIsPrime.class})
public class AllUtilsTests {

}
