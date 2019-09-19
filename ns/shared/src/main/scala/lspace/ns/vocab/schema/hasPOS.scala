package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasPOS extends PropertyDef(
        iri = "http://schema.org/hasPOS",
        iris = Set("http://schema.org/hasPOS"),
        label = "hasPOS",
        comment = """Points-of-Sales operated by the organization or person.""",
        `@extends` = () => List(),
        `@range` = () => List(Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}