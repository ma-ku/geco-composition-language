/**
 * generated by Xtext 2.10.0
 */
package de.cau.cs.se.geco.architecture.tests;

import com.google.inject.Inject;
import de.cau.cs.se.geco.architecture.architecture.GecoModel;
import de.cau.cs.se.geco.architecture.tests.ArchitectureInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ArchitectureInjectorProvider.class)
@SuppressWarnings("all")
public class ArchitectureParsingTest {
  @Inject
  private ParseHelper<GecoModel> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final GecoModel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
