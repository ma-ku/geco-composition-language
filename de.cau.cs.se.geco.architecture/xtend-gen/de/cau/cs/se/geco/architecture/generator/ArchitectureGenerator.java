/**
 * generated by Xtext
 */
package de.cau.cs.se.geco.architecture.generator;

import de.cau.cs.se.geco.architecture.architecture.Connection;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.GeneratorImport;
import de.cau.cs.se.geco.architecture.architecture.Import;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.architecture.WeaverImport;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class ArchitectureGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    URI _uRI = resource.getURI();
    URI _trimFileExtension = _uRI.trimFileExtension();
    final URI targetUri = _trimFileExtension.appendFileExtension("xtend");
    String _fileString = targetUri.toFileString();
    StringConcatenation _builder = new StringConcatenation();
    fsa.generateFile(_fileString, _builder);
  }
  
  private CharSequence createGenerator(final Model model, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.menges.nexgen");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.ArrayList");
    _builder.newLine();
    _builder.append("import java.util.Collection");
    _builder.newLine();
    _builder.append("import java.util.List");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.URI");
    _builder.newLine();
    _builder.newLine();
    EList<Import> _imports = model.getImports();
    final Function1<Import, CharSequence> _function = new Function1<Import, CharSequence>() {
      public CharSequence apply(final Import it) {
        return ArchitectureGenerator.this.createImport(it);
      }
    };
    List<CharSequence> _map = ListExtensions.<Import, CharSequence>map(_imports, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    EList<Connection> _connections = model.getConnections();
    final Function1<Connection, CharSequence> _function_1 = new Function1<Connection, CharSequence>() {
      public CharSequence apply(final Connection it) {
        return ArchitectureGenerator.this.createField(it);
      }
    };
    List<CharSequence> _map_1 = ListExtensions.<Connection, CharSequence>map(_connections, _function_1);
    String _join_1 = IterableExtensions.join(_map_1);
    _builder.append(_join_1, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("class ");
    String _name = model.getName();
    _builder.append(_name, "");
    _builder.append(".");
    _builder.append(className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("new(URI uri) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.uri = uri");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def void execute(Collection<EObject> models) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence _createField(final Weaver connection) {
    CharSequence _xblockexpression = null;
    {
      WeaverImport _weaver = connection.getWeaver();
      String _importedNamespace = _weaver.getImportedNamespace();
      String[] _split = _importedNamespace.split("\\.");
      final String name = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("val ");
      _builder.append(name, "");
      _builder.append(" = new ");
      String _firstLower = StringExtensions.toFirstLower(name);
      _builder.append(_firstLower, "");
      _builder.append("()");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence _createField(final Generator connection) {
    CharSequence _xblockexpression = null;
    {
      GeneratorImport _generator = connection.getGenerator();
      String _importedNamespace = _generator.getImportedNamespace();
      String[] _split = _importedNamespace.split("\\.");
      final String name = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("val ");
      _builder.append(name, "");
      _builder.append(" = new ");
      String _firstLower = StringExtensions.toFirstLower(name);
      _builder.append(_firstLower, "");
      _builder.append("()");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence createImport(final Import node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    String _importedNamespace = node.getImportedNamespace();
    _builder.append(_importedNamespace, "");
    return _builder;
  }
  
  private CharSequence createField(final Connection connection) {
    if (connection instanceof Generator) {
      return _createField((Generator)connection);
    } else if (connection instanceof Weaver) {
      return _createField((Weaver)connection);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(connection).toString());
    }
  }
}
