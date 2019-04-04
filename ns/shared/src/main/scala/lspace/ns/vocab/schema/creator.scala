package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object creator extends PropertyDef(
        iri = "https://schema.org/creator",
        iris = Set("https://schema.org/creator"),
        label = "creator",
        comment = """The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.""",
        `@extends` = () => List(),
        `@range` = () => List(Person.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}