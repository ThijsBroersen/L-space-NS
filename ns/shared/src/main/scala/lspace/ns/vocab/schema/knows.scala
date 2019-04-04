package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object knows extends PropertyDef(
        iri = "https://schema.org/knows",
        iris = Set("https://schema.org/knows"),
        label = "knows",
        comment = """The most generic bi-directional social/work relation.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}