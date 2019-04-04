package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object editor extends PropertyDef(
        iri = "https://schema.org/editor",
        iris = Set("https://schema.org/editor"),
        label = "editor",
        comment = """Specifies the Person who edited the CreativeWork.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}