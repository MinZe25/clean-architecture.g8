package $package;format="lower,package"$.domain.entities
import com.wix.accord.Validator
import com.wix.accord.dsl._
case class $entity;format="Camel"$() extends BaseEntity {
  override implicit val implicitValidator: Validator[$entity;format="Camel"$.this.type] = validator[$entity;format="Camel"$] { e =>
  }
}