package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object commentTime extends PropertyDef(
        iri = "http://schema.org/commentTime",
        iris = Set("http://schema.org/commentTime"),
        label = "commentTime",
        comment = """The time at which the UserComment was made.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`, `@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}