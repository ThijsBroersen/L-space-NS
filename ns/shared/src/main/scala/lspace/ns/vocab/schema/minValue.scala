package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object minValue extends PropertyDef(
        iri = "http://schema.org/minValue",
        iris = Set("http://schema.org/minValue"),
        label = "minValue",
        comment = """The lower value of some characteristic or property.""",
        `@extends` = () => List(),
        `@range` = () => List(`@number`, Number.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}