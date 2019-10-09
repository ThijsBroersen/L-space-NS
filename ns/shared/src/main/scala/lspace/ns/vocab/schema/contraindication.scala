package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object contraindication extends PropertyDef(
        iri = "http://schema.org/contraindication",
        iris = Set("http://schema.org/contraindication"),
        label = "contraindication",
        comment = """A contraindication for this therapy.""",
        `@extends` = List(),
        `@range` = List(MedicalContraindication.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}