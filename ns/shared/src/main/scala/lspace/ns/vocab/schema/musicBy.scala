package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object musicBy extends PropertyDef(
        iri = "http://schema.org/musicBy",
        iris = Set("http://schema.org/musicBy"),
        label = "musicBy",
        comment = """The composer of the soundtrack.""",
        `@extends` = List(),
        `@range` = List(MusicGroup.ontology, Person.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}