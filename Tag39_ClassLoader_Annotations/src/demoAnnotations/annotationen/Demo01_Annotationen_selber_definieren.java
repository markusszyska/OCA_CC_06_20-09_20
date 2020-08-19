package demoAnnotations.annotationen;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * Annotations are to be recorded in the class file by the compiler and
 * retained by the VM at run time, so they may be read reflectively.
 */
// 1. Annotation definieren
@Retention(RetentionPolicy.RUNTIME)
@interface PluginVersion {
	int major();
	int minor();
}
//2. Annotation anwenden
@PluginVersion(major = 3, minor = 0)
class Plugin {
	// Plugin Zeug hier
}

public class Demo01_Annotationen_selber_definieren {

	public static void main(String[] args) {
		//3. Nach der Annotation suchen und sie auswerten
		
		PluginVersion vers = Plugin.class.getAnnotation(PluginVersion.class);
		System.out.println(vers);
		
//		int versionMajor = vers.major();
//		int versionMinor = vers.minor();
		
		if(vers == null) {
			System.out.println("Plugin nicht gefunden");
		}
		if(vers.major() < 2) {
			System.out.println("Plugin Version zu alt");
		}else {
			System.out.println("Plugin kann verwendet werden");
		}
	}
}
