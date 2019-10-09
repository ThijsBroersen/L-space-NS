package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hospitalAffiliation extends PropertyDef(
        iri = "http://schema.org/hospitalAffiliation",
        iris = Set("http://schema.org/hospitalAffiliation"),
        label = "hospitalAffiliation",
        comment = """A hospital with which the physician or office is affiliated.""",
        `@extends` = List(),
        `@range` = List(Hospital.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}