package $package;format="lower,package"$
import com.wix.accord.Validator
import com.wix.accord.dsl._
case class $entity;format="Camel"$() extends BaseEntity {
  override implicit val baseValidator: Validator[$entity;format="Camel"$.this.type] = validator[$entity;format="Camel"$] { e =>
  }
}