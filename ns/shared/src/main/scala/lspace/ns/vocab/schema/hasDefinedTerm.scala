package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasDefinedTerm extends PropertyDef(
        iri = "http://schema.org/hasDefinedTerm",
        iris = Set("http://schema.org/hasDefinedTerm"),
        label = "hasDefinedTerm",
        comment = """A Defined Term contained in this term set.""",
        `@extends` = List(hasPart.property),
        `@range` = List(DefinedTerm.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.hasPart.Properties
}