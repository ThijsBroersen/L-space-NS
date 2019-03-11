package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object makesOffer extends PropertyDef(
        iri = "https://schema.org/makesOffer",
        iris = Set("https://schema.org/makesOffer"),
        label = "makesOffer",
        comment = """A pointer to products or services offered by the organization or person.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}