package $package;format="lower,package"$.rest
package controllers
import io.github.minze25.scalamediator.core.IMediator
import play.api.mvc.{BaseController, ControllerComponents}
import javax.inject.{Inject, Singleton}

@Singleton
class $entity;format="Camel"$Controller @Inject()
(val controllerComponents: ControllerComponents, val mediator: IMediator)
  extends BaseController {
// Don't forget to add the methods to the conf/routes file
}