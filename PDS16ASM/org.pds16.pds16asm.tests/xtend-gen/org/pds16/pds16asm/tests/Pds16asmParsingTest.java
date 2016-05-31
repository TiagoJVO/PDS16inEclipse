/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pds16.pds16asm.pds16asm.PDS16ASM;
import org.pds16.pds16asm.tests.Pds16asmInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(Pds16asmInjectorProvider.class)
@SuppressWarnings("all")
public class Pds16asmParsingTest {
  @Inject
  private ParseHelper<PDS16ASM> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final PDS16ASM result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}