package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object serviceType extends PropertyDef(
        iri = "http://schema.org/serviceType",
        iris = Set("http://schema.org/serviceType"),
        label = "serviceType",
        comment = """The type of service being offered, e.g. veterans' benefits, emergency relief, etc.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}