package $package;format="lower,package"$
package $name;format="lower,word"$

import com.google.inject._
import io.github.minze25.scalamediator.modules.{ClassScannerModule, MediatorModule}
import play.api.{Configuration, Environment}

class BaseModule(environment: Environment, configuration: Configuration) extends AbstractModule {
  override def configure(): Unit = {
    install(new ClassScannerModule("$package;format=\"lower,package\"$.$name;format=\"lower,word\"$.application"))
    install(new MediatorModule)
  }
}
