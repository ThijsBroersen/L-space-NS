package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object knows extends PropertyDef(
        iri = "http://schema.org/knows",
        iris = Set("http://schema.org/knows"),
        label = "knows",
        comment = """The most generic bi-directional social/work relation.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}