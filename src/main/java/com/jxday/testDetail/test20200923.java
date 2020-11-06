package com.jxday.testDetail;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

/**
 * 〈〉
 *
 * @author cty
 * @ClassName test20200923
 * @create 2020-09-23 17:43
 * @Version 1.0.0
 */

@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class test20200923 extends AbstractProcessor {
    
    private NameChecker nameChecker;
    
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if (!roundEnv.processingOver()){
            for (Element rootElement : roundEnv.getRootElements()) {
                nameChecker.checkName(rootElement);
            }
        }
        return false;
    }
    
    @Override
    public void init(ProcessingEnvironment processingEnvironment){
        super.init(processingEnvironment);        
        nameChecker = new NameChecker(processingEnvironment);        
    }
    
}
