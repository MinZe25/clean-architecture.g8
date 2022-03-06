package $package;format="lower,package"$.domain.entities

import com.wix.accord.dsl.validator
import com.wix.accord.{Result, Validator}

trait BaseEntity {
  private implicit val baseValidator: Validator[BaseEntity] = validator[BaseEntity] {
    _ =>
  }
  implicit val implicitValidator: Validator[_]

  def validate(): Result = com.wix.accord.validate(this)
}