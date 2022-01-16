package $package;format="lower,package"$
package $project;format="lower,word"$
package application
package $entity;format="lower,package"$
package $cqrs;format="lower,package"$
import $package;format="lower,package"$.$project;format="lower,word"$.entities.$entity;format="Camel"$
import io.github.minze25.scalamediator.core.{SingleCommand, SingleCommandHandler}

sealed class $usecase;format="Camel"$Command extends SingleCommand[$entity;format="Camel"$]

sealed class $usecase;format="Camel"$Handler() extends SingleCommandHandler[$usecase;format="Camel"$Command,$entity;format="Camel"$] {
  override def handle(command: $usecase;format="Camel"$Command): $entity;format="Camel"$ = ???
}