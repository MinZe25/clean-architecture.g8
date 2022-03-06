package $package;format="lower,package"$
package $project;format="lower,word"$
package application
package $entity;format="lower,package"$
package $cqrs;format="lower,package"$
import $package;format="lower,package"$.domain.entities.$entity;format="Camel"$
import io.github.minze25.scalamediator.core.{
  IMediator,
  SingleCommand,
  SingleCommandHandler
}
import com.google.inject.{ Inject, Provider }

sealed class $usecase;format="Camel"$Command extends SingleCommand[$entity;format="Camel"$]

sealed class $usecase;format="Camel"$Handler @Inject() (val provider: Provider[IMediator])
  extends SingleCommandHandler[$usecase;format="Camel"$Command,$entity;format="Camel"$] {
  private lazy val mediator: IMediator = provider.get()
  override def handle(command: $usecase;format="Camel"$Command): $entity;format="Camel"$ = ???
}