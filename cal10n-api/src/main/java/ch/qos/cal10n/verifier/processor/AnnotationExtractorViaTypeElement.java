package ch.qos.cal10n.verifier.processor;


import ch.qos.cal10n.BaseName;
import ch.qos.cal10n.LocaleData;
import ch.qos.cal10n.util.AbstractAnnotationExtractor;

import javax.lang.model.element.TypeElement;

public class AnnotationExtractorViaTypeElement extends AbstractAnnotationExtractor {

  TypeElement typeElementForEnum;

  public AnnotationExtractorViaTypeElement(TypeElement typeElement) {
    typeElementForEnum = typeElement;
  }


  @Override
  protected LocaleData extractLocaleData() {
    LocaleData localeData = typeElementForEnum.getAnnotation(LocaleData.class);
    return localeData;
  }

  public String getBaseName() {
    BaseName baseNameAnnotation = typeElementForEnum.getAnnotation(BaseName.class);
    return baseNameAnnotation.value();

  }
}
