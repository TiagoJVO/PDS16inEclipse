/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.generator

import java.io.InputStream
import java.util.ArrayList
import java.util.List
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.pds16.pds16asm.pds16asm.impl.EndImpl

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class Pds16asmGenerator extends AbstractGenerator {
	val String SYSTEM_ENV_DASM = "DASM_PATH"

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		if(!existsEnd(resource)){
			val errors = new ArrayList<LinedError>()
			errors.add(new LinedError("Missing '.end' at the end of file",1))
			generateErrors(errors,resource)
			return
		}
			
		
		val InputStream output = executeDasm(resource)
		
		val List<LinedError> errors = DasmErrorParser.getErrorsFromStream(output);
		
	    generateErrors(errors, resource);
	}
	
	def boolean existsEnd(Resource resource) {
		resource.allContents.exists[elem|
			elem.class.equals(EndImpl)
		]
	}
	
	def void generateErrors(List<LinedError> errors, Resource resource) {
		if(!errors.isEmpty){
	    	var rel = resource.URI.toString().substring("platform:/resource".length)
	    	val sharedFile = ResourcesPlugin.workspace.root.findMember(rel);
	    	errors.forEach[error |
	    		{
		    		val marker = sharedFile.createMarker(IMarker.PROBLEM) 
		      		marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR)
		      		marker.setAttribute(IMarker.LINE_NUMBER, error.line)
		      		marker.setAttribute(IMarker.MESSAGE, error.description)
	      		}
	      	]
	    }
	}
	
	def InputStream executeDasm(Resource resource){
		val List<String> command = new ArrayList<String>();
		
		val String dasmPath = System.getenv(SYSTEM_ENV_DASM)//system environment variable definida pelo utilizador com o path do dasm.exe
		
		command.add(dasmPath);
		
		var resourceFullPath = ""
        val resourceRelativePath = resource.URI

		if (resourceRelativePath.isPlatform) 
			resourceFullPath = ResourcesPlugin.workspace.root.getFile(new Path(resourceRelativePath.toPlatformString(true))).rawLocation.toOSString	
		else 
			resourceFullPath = resource.resourceSet.URIConverter.normalize(resourceRelativePath).toFileString
		
		command.add(resourceFullPath)
		
		val ProcessBuilder builder = new ProcessBuilder(command);
		val Process process = builder.start();
		process.waitFor()
		return process.getInputStream();
	}
}
	
	