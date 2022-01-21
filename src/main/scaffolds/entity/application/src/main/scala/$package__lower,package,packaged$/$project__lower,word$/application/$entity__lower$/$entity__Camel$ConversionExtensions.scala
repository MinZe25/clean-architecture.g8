package $package;format="lower,package"$.$project;format="lower,word"$.application.$entity;format="lower,package"$
import $package;format="lower,package"$.$project;format="lower,word"$.entities.$entity;format="Camel"$
object $entity;format="Camel"$ConversionExtensions {
  implicit class $entity;format="Camel"$ConversionExtensions(val $entity;format="camel"$: $entity;format="Camel"$){
    def to$entity;format="Camel"$DTO:$entity;format="Camel"$ = $entity;format="Camel"$()
  }
  implicit class $entity;format="Camel"$DTOConversionExtensions(val $entity;format="camel"$DTO: $entity;format="Camel"$DTO){
    def to$entity;format="Camel"$:$entity;format="Camel"$DTO = $entity;format="Camel"$DTO()
  }
}
