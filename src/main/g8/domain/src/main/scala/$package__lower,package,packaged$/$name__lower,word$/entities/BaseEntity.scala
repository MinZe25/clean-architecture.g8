package $package;format="lower,package"$
package $name;format="lower,word"$
package entities

import com.wix.accord.dsl.validator
import com.wix.accord.{Result, Validator}

trait BaseEntity {
  private implicit val baseValidator: Validator[BaseEntity] = validator[BaseEntity] {
    _ =>
  }
  implicit val implicitValidator: Validator[_]

  def validate(): Result = com.wix.accord.validate(this)
}