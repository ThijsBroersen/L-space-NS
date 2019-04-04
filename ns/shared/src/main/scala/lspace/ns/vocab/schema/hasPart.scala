package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object hasPart extends PropertyDef(
        iri = "https://schema.org/hasPart",
        iris = Set("https://schema.org/hasPart"),
        label = "hasPart",
        comment = """Indicates an item or CreativeWork that is part of this item, or CreativeWork (in some sense).""",
        `@extends` = () => List(),
        `@range` = () => List(CreativeWork.ontology)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}