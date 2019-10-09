package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object follows extends PropertyDef(
        iri = "http://schema.org/follows",
        iris = Set("http://schema.org/follows"),
        label = "follows",
        comment = """The most generic uni-directional social relation.""",
        `@extends` = List(),
        `@range` = List(Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}