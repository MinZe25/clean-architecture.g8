package $package;format="lower,package"$
package $name;format="lower,word"$
package application

trait Repository[T] {
  def getAll: List[T]
  def save(t: T*): Unit
  def delete(t: T*): Unit
  def update(t: T*): Unit
  def get(t: T): Option[T]
}
