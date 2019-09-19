package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object arrivalTerminal extends PropertyDef(
        iri = "http://schema.org/arrivalTerminal",
        iris = Set("http://schema.org/arrivalTerminal"),
        label = "arrivalTerminal",
        comment = """Identifier of the flight's arrival terminal.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}