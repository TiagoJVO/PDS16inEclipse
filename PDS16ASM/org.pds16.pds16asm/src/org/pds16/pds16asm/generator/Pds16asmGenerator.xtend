/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.List
import java.util.ArrayList
import java.io.InputStream
import java.io.InputStreamReader
import java.io.BufferedReader
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Pds16asmGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val List<String> command = new ArrayList<String>();
		command.add("C:\\Users\\tiago\\Desktop\\proj\\teste\\dasm.exe");
		
		var libraryFile = ""
        
        val theRelativeFile = resource.URI.trimFileExtension.appendFileExtension('asm')

		if (resource.URI.isPlatform) {
			libraryFile = ResourcesPlugin.workspace.root.getFile(new Path(theRelativeFile.toPlatformString(true))).rawLocation.toOSString	
		}            	
		else {
			libraryFile = resource.resourceSet.URIConverter.normalize(theRelativeFile).toFileString
		}
		
		command.add(libraryFile)
		val ProcessBuilder builder = new ProcessBuilder(command);
		val Process process = builder.start();
		val InputStream is = process.getInputStream();
	    val InputStreamReader isr = new InputStreamReader(is);
	    val BufferedReader br = new BufferedReader(isr);
	    var String line;
	    while ((line = br.readLine()) != null) {
	      	if(line.startsWith("erro"))
	      		System.out.println(line)
	    }
	}
}
	
	
