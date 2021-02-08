package io.soebes.extension;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;

public class MyOwnListener implements TestExecutionListener {

  public void testPlanExecutionStarted(TestPlan testPlan) {
    System.out.println("MyOwnListener.testPlanExecutionStarted");
  }

  public void testPlanExecutionFinished(TestPlan testPlan) {
    System.out.println("MyOwnListener.testPlanExecutionFinished");
  }
}
