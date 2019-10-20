package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object defaultValue extends PropertyDef(
        iri = "http://schema.org/defaultValue",
        iris = Set("http://schema.org/defaultValue"),
        label = "defaultValue",
        comment = """The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.""",
        `@extends` = List(),
        `@range` = List(Thing.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}